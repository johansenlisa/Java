public class TestLegemiddel {
    public static void main(String[] args) {
        testNarkotisk();
        testVanedannende();
        testVanlig();
    }

    // Tester Narkotisk legemiddel
    private static void testNarkotisk() {
        Narkotisk narkotisk = new Narkotisk("Morfin", 500, 10.5, 5);
        sjekk("Test pris", narkotisk.hentPris() == 500);
        sjekk("Test ID", narkotisk.ID == 0); // Forventer at første opprettede objekt har ID 0
        System.out.println(narkotisk);
    }

    // Tester Vanedannende legemiddel
    private static void testVanedannende() {
        Vanedannende vanedannende = new Vanedannende("Valium", 300, 5.0, 3);
        sjekk("Test pris", vanedannende.hentPris() == 300);
        sjekk("Test ID", vanedannende.ID == 1); // Forventer at andre opprettede objekt har ID 1
        System.out.println(vanedannende);
    }

    // Tester Vanlig legemiddel
    private static void testVanlig() {
        Vanlig vanlig = new Vanlig("Paracet", 100, 1.0);
        sjekk("Test pris", vanlig.hentPris() == 100);
        sjekk("Test ID", vanlig.ID == 2); // Forventer at tredje opprettede objekt har ID 2
        System.out.println(vanlig);
    }

    // Enkel testmetode for å sjekke forventet verdi
    private static void sjekk(String beskrivelse, boolean resultat) {
        if (resultat) {
            System.out.println(beskrivelse + " bestått!");
        } else {
            System.out.println(beskrivelse + " feilet!");
        }
    }
}
