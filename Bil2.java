public class Bil2 {
    private String bilNummer; // Instansvariabel for bilnummer

    // Konstruktør som setter bilens nummer
    // Verdien fra parameteren bilNummer kopieres til instansvariabelen bilNummer.
    public Bil2(String bilNummer) {
        this.bilNummer = bilNummer; //this = referer til nåværende objekt 
    }

    // Metode som returnerer bilens nummer
    public String hentNummer() {
        return bilNummer;
    }

    // Metode som skriver ut bilens nummer
    public void skrivUt() {
        System.out.println("Jeg er en bil med bilnummer: " + bilNummer);
    }
}
