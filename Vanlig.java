
//Subklasse + en klasse som representerer vanlige legemidler uten spesielle restriksjoner.
public class Vanlig extends Legemidler{

    // Kaller konstruktøren i superklassen (Legemidler) for å initialisere de arvede egenskapene med de oppgitte verdiene.
    Vanlig(String n, int p, double mgV){
        super(n,p,mgV);
    }

   
}