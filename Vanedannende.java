//subklasse
public class Vanedannende extends Legemidler {
    public int styrke; 

    Vanedannende(String n, int p, double mgV, int s){
        super(n,p,mgV); // kaller på superklassen med de gitte variablene i parameteren 
        styrke = s; 
    }

    @Override
    public String toString() {
        return super.toString() + ", Vanedannende styrke: " + styrke;
    }
}
