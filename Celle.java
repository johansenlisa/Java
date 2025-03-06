public class Celle {
    public boolean levende; 
    public int antNaboer;
    public int antLevendeNaboer;
    public Celle[] naboer;

    public Celle() {   // konstruktør
        this.levende = false; // levende = True, død = False. 
        this.naboer = new Celle[8]; // liste(array) med 8 elementer
        this.antNaboer = 0; 
        this.antLevendeNaboer = 0; 
    }

    public void settDoed() { // 
        this.levende = false;
    }

    public void settLevende() {
        this.levende = true;
    }

    public boolean erLevende() {
        return this.levende;
    }

    public char hentStatusTegn() { //obs: typen er char
        if (erLevende()) { //kaller på erLevende for å sjekke om cellen er levende 
            return 'O'; // enkelt tegn! obs på om det er string "" eller char ''
        }
        else {
            return '.'; 
        }
    }

    public void leggTilNabo(Celle nabo) {
        if (antNaboer < naboer.length) { // Sjekk at det er plass i arrayen
            naboer[antNaboer] = nabo; // legger til nabo i arrayen
            antNaboer++; // øker deretter telleren for antall naboer
        } 
    }

    public void tellLevendeNaboer() {
        this.antLevendeNaboer = 0;

        for (Celle nabo : naboer) {  
            if (nabo != null && nabo.erLevende()) { // Teller antall levende naboer, ved bruk av metoden 
                this.antLevendeNaboer++; //øker telleren for antLevendeNaboer
            }

            /* null er et spesielt verdiløst objekt i Java, som betyr ingen verdi eller ingen referanse.
            Det brukes til å indikere at en variabel ikke peker på et objekt eller at den ikke har blitt initialisert.
            Det er ikke en tallverdi, men en referanseverdi. && = and */
        }


    }

    public void oppdaterStatus() {
        //  hvis cellen er levende og har 2 eller (or = || ) 3 levende naboer
        if (this.levende && (this.antLevendeNaboer == 2 || this.antLevendeNaboer == 3)) {
            settLevende();  
        }
        else if (!this.levende && this.antLevendeNaboer == 3) { // Hvis cellen er død og har nøyaktig 3 levende naboer
            settLevende();  
        }
        else {
            settDoed(); 
        }
    }
 }


