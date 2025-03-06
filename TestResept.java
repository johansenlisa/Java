// Testklasse for å opprette og teste resepter
public class TestResept {
    public static void main(String[] args) {
        // Oppretter noen legemidler for testing
        Legemidler paracet = new Vanlig("Paracet", 100, 500);
        Legemidler antibiotika = new Vanlig("Antibiotika", 200, 250);
        Legemidler pPiller = new Vanlig("P-piller", 150, 0); 

        // Oppretter et objekt = en lege for testing
        Leger drHansen = new Leger("Dr. Hansen"); 

        // Oppretter ulike resepter
        HvitResept hvitResept = new HvitResept(paracet, drHansen, 1, 5);
        BlaaResept blaaResept = new BlaaResept(antibiotika, drHansen, 2, 3);
        MilitærResept militærResept = new MilitærResept(paracet, drHansen, 3);
        PResept pResept = new PResept(pPiller, drHansen,5, 4);

        // Test av farge()
        System.out.println("HvitResept farge: " + hvitResept.farge()); // Forventet: Hvit
        System.out.println("BlåResept farge: " + blaaResept.farge()); // Forventet: Blå

        // Test av prisAaBetale()
        System.out.println("HvitResept pris: " + hvitResept.prisAaBetale()); // Forventet: 100
        System.out.println("BlåResept pris: " + blaaResept.prisAaBetale()); // Forventet: 50 (25% av 200)
        System.out.println("MilitærResept pris: " + militærResept.prisAaBetale()); // Forventet: 0
        System.out.println("PResept pris: " + pResept.prisAaBetale()); // Forventet: 42 (150 - 108, men ikke under 0)

        // Test av reit
        System.out.println("MilitærResept reit: " + militærResept.hentReit()); // Forventet: 3

        // Test av bruk()
        System.out.println("BlåResept brukt: " + blaaResept.Bruk()); // Forventet: true
        System.out.println("BlåResept reit etter bruk: " + blaaResept.hentReit()); // Forventet: 2
        System.out.println("HvitResept brukt 5 ganger:");
        for (int i = 0; i < 5; i++) {
            System.out.println("Bruk " + (i+1) + ": " + hvitResept.Bruk());
        }
        System.out.println("HvitResept brukt igjen: " + hvitResept.Bruk()); // Forventet: false (ingen reit igjen)
    }
}
