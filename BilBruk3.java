public class BilBruk3 {
    public static void main(String[] args) {
        // Oppretter et Bil3-objekt
        Bil3 bil = new Bil3("NO46219");

        // Oppretter et Person-objekt og gir det Bil3-objektet
        Person person = new Person(bil);

        // Kaller metoden for å skrive ut bilnummeret
        person.skrivUtBilNummer();
    }
}
