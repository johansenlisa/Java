// MilitærResept er en subklasse av HvitResept
class MilitærResept extends HvitResept {
    
    // Konstruktør: Oppretter en militærresept
    public MilitærResept(Legemidler legemiddel, Leger utskrivendeLege, int pasientId) {
        // Kaller konstruktøren i superklassen (HvitResept) og setter reit til 3
        super(legemiddel, utskrivendeLege, pasientId, 3);  
    }

    // Overskriver metoden prisAaBetale() fra HvitResept
    @Override
    public int prisAaBetale() {
        return 0;  // Militærresept gir 100% rabatt, så pasienten betaler ingenting
    }
}

