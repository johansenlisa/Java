// BlaaResept er en subklasse av Resept
class BlaaResept extends Resept {
    
    // Konstruktør: Oppretter en blå resept
    public BlaaResept(Legemidler legemiddel, Leger utskrivendeLege, int pasientId, int reit) {
        // Kaller konstruktøren i Resept-klassen (superklasse)
        super(legemiddel, utskrivendeLege, pasientId, reit);
    }

    // Overskriver den abstrakte metoden farge() fra Resept-klassen
    @Override
    public String farge() {
        return "Blå"; // Returnerer at dette er en blå resept
    }

    // Overskriver den abstrakte metoden prisAaBetale() fra Resept-klassen
    @Override
    public int prisAaBetale() {
        // Blå resepter gir 75% rabatt, pasienten betaler kun 25% av prisen
        return (int) Math.round(legemiddel.pris * 0.25); // Avrunder til nærmeste hele krone
    }
}
