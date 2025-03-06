// HvitResept er en subklasse av Resept
class HvitResept extends Resept {

    // Konstruktør: Oppretter en hvit resept
    public HvitResept(Legemidler legemiddel, Leger utskrivendeLege, int pasientId, int reit) {
        // Kaller konstruktøren i superklassen (Resept)
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    // Overskriver den abstrakte metoden farge() fra Resept-klassen
    @Override
    public String farge() { 
        return "Hvit"; // Returnerer at dette er en hvit resept
    }

    // Overskriver den abstrakte metoden prisAaBetale() fra Resept-klassen
    @Override
    public int prisAaBetale() {
        return legemiddel.hentPris(); // Pasienten betaler full pris for legemiddelet
    }
}
