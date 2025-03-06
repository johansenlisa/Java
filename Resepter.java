// Abstrakt klasse for alle typer resepter
abstract class Resept {
    // Statisk teller som sikrer unike ID-er for alle resepter
    private static int teller = 0; 

    // Instansvariabler
    protected int id; // Unik ID for hver resept
    protected Legemidler legemiddel; // Referanse til legemiddelet resepten gjelder for
    protected Leger utskrivendeLege; // Referanse til legen som har skrevet ut resepten
    protected int pasientId; // ID-en til pasienten som eier resepten
    protected int reit; // Hvor mange ganger resepten kan brukes før den blir ugyldig

    // Konstruktør: Initialiserer verdiene når et Resept-objekt opprettes
    public Resept(Legemidler legemiddel, Leger utskrivendeLege, int pasientId, int reit) {
        this.id = ++teller; 
        this.legemiddel = legemiddel; 
        this.utskrivendeLege = utskrivendeLege; 
        this.pasientId = pasientId; 
        this.reit = reit; // Setter antall ganger resepten kan brukes
    }

    // Henter reseptens unike ID
    public int hentId() {
        return id;
    }

    // Henter legemiddelet resepten gjelder for
    public Legemidler hentLegemidler() {
        return legemiddel;
    }

    // Henter legen som skrev ut resepten
    public Leger hentLege() {
        return utskrivendeLege;
    }

    // Henter ID-en til pasienten som resepten er skrevet ut til
    public int hentPasientId() {
        return pasientId;
    }

    // Henter hvor mange ganger resepten kan brukes før den er ugyldig
    public int hentReit() {
        return reit;
    }

    // Metode for å bruke resepten én gang
    public boolean Bruk() {
        if (reit > 0) { // Hvis resepten fortsatt har bruk igjen
            reit--; // Reduser antall gjenværende bruk
            return true; // Returnerer true fordi den kunne brukes
        }
        return false; // Returnerer false fordi resepten er oppbrukt
    }
   
    // Abstrakte metoder for å hente reseptens farge (må implementeres i subklasser)
    abstract public String farge();
    abstract public int prisAaBetale();

    // Overskriver toString() for å skrive ut all viktig informasjon om resepten
    @Override
    public String toString() {
        return "Resept-ID: " + id + 
               ", Legemiddel: " + legemiddel.navn + 
               ", Utskrevet av: " + utskrivendeLege.hentNavn() + 
               ", Pasient-ID: " + pasientId + 
               ", Reit: " + reit;
    }
}