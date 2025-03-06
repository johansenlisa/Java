public class GameOfLife {
    public static void main(String[] args) {
        // Oppretter et nytt verden-objekt med 8 rader og 12 kolonner
        Verden verden = new Verden(8, 12);
    
        verden.tegn();
            
        // Simulerer og tegner de neste 3 generasjonene
        for (int i = 0; i < 3; i++) {
            verden.oppdatering(); // Oppdaterer verden til neste generasjon
            verden.tegn(); // Tegner den nye generasjonen
    }
}
}