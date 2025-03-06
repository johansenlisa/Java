//subklasse av HvitResept
class PResept extends HvitResept {
    // Konstruktøren for PResept
    public PResept(Legemidler legemiddel, Leger utskrivendeLege, int pasientId, int reit) {
        super(legemiddel, utskrivendeLege, pasientId, reit); 
    }

    @Override
    public int prisAaBetale() {
        int nyPris = legemiddel.hentPris() - 108;
        return Math.max(nyPris, 0);  // Sørger for at prisen aldri blir negativ
    }
}
