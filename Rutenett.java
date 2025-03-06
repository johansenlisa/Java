// sorry for overflødig kommentering - men jeg trenger å kommentere ting for å forstå dette faget hehe

public class Rutenett {
    public int antRader; //instansvariabel
    public int antKolonner;
    public Celle[][]rutene; //instansvariabel - array med to dimensjoner

    // konstruktøren som tar inn antall rader og kolonner
    public Rutenett(int antRader, int antKolonner) {
        this.antRader = antRader; // setter instansvariabelen antRader til verdien som kommer fra parameteren
        this.antKolonner = antKolonner;
        this.rutene = new Celle[antRader][antKolonner]; // initialiserer den todimensjonale arrayen "rutene" med størrelse [antRader][antKolonner]

    }
    public void lagCelle(int rad, int kol) {
        Celle nyCelle = new Celle(); // Oppretter ny celle
        if (Math.random() <= 0.3333) {
            nyCelle.settLevende(); // 1/3 sjanse for å være levende
        }
        rutene[rad][kol] = nyCelle; // Plasserer cellen på riktig plass
    }

    public void fyllMedTilfeldigeCeller() {
        for (int rad = 0; rad < antRader; rad++) {  // Itererer gjennom hver rad
            for (int kol = 0; kol < antKolonner; kol++) { // Itererer gjennom hver kolonne
                lagCelle(rad, kol); // Korrekt plassering
            }
        }
    }
//Vi bruker Celle-klassen i metoden fordi arryet inneholder objekter av type Celle som representerer en celle i rutenettet.
    public Celle hentCelle(int rad, int kol) { 
        if ((rad >= 0 && rad < this.antRader) && (kol >= 0 && kol < this.antKolonner)) { //sjekker at rad og kol ikke neg-tall og mindre en intsansvariablene som er definert i Celle klassen
            return rutene[rad][kol]; 
        }
        return null; //indikerer at en variabel ikke har blitt initialisert eller har et "tomt" objekt
    }

    public void tegnRutenett() {
        //dobbel for løkke med if sjekk 
        for (int rad = 0; rad < this.antRader; rad++) {
            for (int kol = 0; kol < antKolonner; kol++) {
                if (rutene[rad][kol] != null) {
                    System.out.print(rutene[rad][kol].hentStatusTegn() + " ");  // Bruker hentStatusTegn() for å hente tegnet
                } else {
                    System.out.print(". ");  
                }
            }
            System.out.println();  // Går til neste rad
        }
    }
    

    public void settNaboer(int rad, int kol){
        // Denne ytre for-løkken itererer gjennom radene rundt den aktuelle cellen.
        for (int naboRad = rad - 1; naboRad <= rad + 1; naboRad++) {
            // Denne indre for-løkken itererer gjennom kolonnene rundt den aktuelle cellen.
            for (int naboKol = kol - 1; naboKol <= kol + 1; naboKol++) {
                
                // Sjekker om naboRad og naboKol er innenfor gyldige indekser i rutenettet
                if (naboRad >= 0 && naboRad < this.antRader && naboKol >= 0 && naboKol < this.antKolonner) {
                    
                    // Henter naboen som er på posisjonen naboRad og naboKol ved å bruke hentCelle()
                    Celle nabo = hentCelle(naboRad, naboKol);
                    
                    // Sjekker om naboen ikke er null og at vi ikke prøver å legge til cellen selv som nabo
                    if (nabo != null && (naboRad != rad || naboKol != kol)) { 
                        // Legger til naboen til cellens naboer 
                        hentCelle(rad, kol).leggTilNabo(nabo); 
                    } 
                } 
            } 
        } 
    } 

    public void kobleAlleCeller() {
        for (int rad = 0; rad < this.antRader; rad++) { 
            for (int kol = 0; kol < this.antKolonner; kol++) { 
                Celle celle = hentCelle(rad, kol); // Henter cellen på posisjon (rad, kol)
                if (celle != null) {
                    settNaboer(rad, kol);  // Kaller metoden settNaboer på cellen for å oppdatere antall naboer for cellen
                    celle.tellLevendeNaboer();
                }
            }
        }
    }

    
    public int antallLevende() {
        int antallLevendeCeller = 0; // Teller antall levende celler
        
        // Itererer gjennom alle radene i rutenettet
        for (int rad = 0; rad < this.antRader; rad++) {
            // Itererer gjennom alle kolonnene i rutenettet
            for (int kol = 0; kol < this.antKolonner; kol++) {
                // Henter cellen på posisjon (rad, kol)
                Celle celle = hentCelle(rad, kol);
                
                // Sjekker om cellen eksisterer og er levende
                if (celle != null && celle.erLevende()) {
                    antallLevendeCeller++; // Øker telleren for levende celler
                }
            }
        }
        return antallLevendeCeller; // Returnerer antall levende celler
        }
    }

        