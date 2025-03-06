// abstrakt klasse gjør at den ikke opprettes som objekt!!
abstract class Legemidler{ //superklasse
    //instandsvariabler
    static int teller = 0; // Variabelen er `static`, noe som betyr at den deles av alle objekter av klassen og økes hver gang et nytt objekt opprettes.
    public final String navn; //final betyr at det ikke kan endres på senere
    public int pris; 
    public final double mengdeVirkestoff; 
    public final int ID = teller++;  

    //Konstruktør 
    public Legemidler(String n, int p, double mgV){ 
    navn = n; //ettersom det er ulike navn trenger jeg ikke "this." 
    pris = p;
    mengdeVirkestoff = mgV; 
    }
 
    public String toString(){
        return "Navn: " + navn + ", Pris: " + pris + " kr, Mengde virkestoff: " + mengdeVirkestoff + " mg";
    }
    
    public int hentPris(){
        return pris;
    }
    
    public void settNyPris(int pris){
        this.pris = pris; //sammenligner parameter med instans, derfor må jeg bruke this. 
    }

}