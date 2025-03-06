// Spesialist arver fra Lege og implementerer Godkjenningsfritak
class Spesialist extends Leger implements Godkjenningsfritak {
    private String kontrollkode;

    // Konstruktør
    public Spesialist(String navn, String kontrollkode) {
        super(navn);
        this.kontrollkode = kontrollkode;
    }

    // Implementerer metode fra Godkjenningsfritak
    @Override
    public String hentKontrollkode() {
        return kontrollkode;
    }

    // Overskriver toString()
    @Override
    public String toString() {
        return "Spesialist: " + navn + ", Kontrollkode: " + kontrollkode;
    }
}