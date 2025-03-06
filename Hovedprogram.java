// Hovedprogram for integrasjonstest
public class Hovedprogram {
    public static void main(String[] args) {
        // Oppretter objekter
        Leger lege = new Leger("Dr. Hansen");
        Spesialist spesialist = new Spesialist("Dr. Berg", "ABC123");
        Narkotisk legemiddel = new Narkotisk("Morfin", 100, 10.00, 3);

        // Skriver ut informasjon om objektene
        System.out.println(lege); 
        System.out.println(spesialist);
        System.out.println(legemiddel);

    }
}
