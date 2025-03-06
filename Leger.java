// Enkel klasse for Lege (kun med navn, siden vi ikke har implementert den enda)
class Leger {
    public String navn;

    //konstruktør
    public Leger(String navn) {
        this.navn = navn;
    }

    public String hentNavn() {
        return navn;
    }

    // Overskriver toString()
    @Override
    public String toString() {
        return "Lege: " + navn;
    }
}
