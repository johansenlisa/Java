//subklasse
public class Narkotisk extends Legemidler{ //arver pga extends
    public int styrke;

   
    Narkotisk(String n, int p, double mgV, int s){
           super(n,p,mgV); // kaller på superklassen med de gitte variablene i parameteren 
           styrke = s; 
    }

    @Override  //en annotasjon som brukes når en subklasse overskriver en metode fra en superklasse.
    public String toString() { //toString() er en metode i Object-klassen (som alle klasser i Java arver fra).
        return super.toString() + ", Narkotisk styrke: " + styrke;
    }
}

