public class Verden {
    public Rutenett rutenett; 
    public int genNr; // Instansvariabel for generasjonsnummer
    public int antRader;
    public int antKolonner;

    // Konstruktør 
    public Verden(int antRader, int antKolonner) {
        this.rutenett = new Rutenett(antRader, antKolonner);  // Oppretter rutenett-objekt
        this.genNr = 0;  // Initialiserer generasjonsnummeret til 0
        this.rutenett.fyllMedTilfeldigeCeller(); // fyller rutenettet med tilfeldige celler
        this.antRader = antRader;
        this.antKolonner = antKolonner;
        
        for (int rad = 0; rad < antRader; rad++) { //går igjennom hver rad i rutenettet
            for (int kol = 0; kol < antKolonner; kol++) { // går gjennom hver kolonne
                this.rutenett.settNaboer(rad, kol); // legger til naboer for cellen på posisjon (rad, kol)
            }
        }
    }

        public void tegn() {
            System.out.println("Generasjonsnummer: " + this.genNr);
            System.out.println("Antall levende celler: " + this.rutenett.antallLevende());
            this.rutenett.tegnRutenett(); // Tegner rutenettet ved å skrive ut cellene til terminalen
            System.out.println(); // Linjeskift for bedre lesbarhet
        }
    
        // Metode som oppdaterer verden ved å telle naboer, oppdatere cellenes status og øke generasjonsnummeret
        public void oppdatering() {
                // Nå oppdaterer vi statusen til hver celle
            for (int rad = 0; rad < this.antRader; rad++) {
                for (int kol = 0; kol < this.antKolonner; kol++) {
                    // Henter cellen på den aktuelle rad- og kolonneposisjonen
                    Celle celle = rutenett.hentCelle(rad, kol);
                    if (celle != null) {
                        celle.tellLevendeNaboer(); 
                    }
                }
            }
                for (int rad = 0; rad < this.antRader; rad++) {
                    for (int kol = 0; kol < this.antKolonner; kol++) {
                        // Henter cellen på den aktuelle rad- og kolonneposisjonen
                        Celle celle = rutenett.hentCelle(rad, kol);
                        if (celle != null) {
                            celle.oppdaterStatus(); // Oppdaterer status for cellen
                        }
                    }
 
             // Oppdaterer cellenes status (død/levende)
            this.genNr++; // Øker generasjonsnummeret
            
        }
        }
    }

    
  