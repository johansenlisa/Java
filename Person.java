public class Person {
    private Bil3 bil; // Referanse til Bil3-objektet

    // Konstruktør som tar et Bil3-objekt som parameter
    public Person(Bil3 bil) {
        this.bil = bil;
    }

    // Metode som skriver ut bilnummeret til bilen personen eier
    public void skrivUtBilNummer() {
        System.out.println("Personen eier bilen med bilnummer: " + bil.hentNummer());
    }
}

