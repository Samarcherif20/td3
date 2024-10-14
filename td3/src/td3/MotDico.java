package td3;

public class MotDico {
	private static int compteur = 0; 
    private int num;
    private String mot;
    private String def;
 
    public MotDico(String mot, String def) {
        this.num = ++compteur;
        this.mot = mot;
        this.def = def;
    }

    
    public String getMot() {
        return mot;
    }

    public void setMot(String mot) {
        this.mot = mot;
    }

    public String getDéfinition() {
        return def;
    }

    public void setDéfinition(String s) {
        this.def =s;
}
    public boolean synonyme(MotDico m) {
        return this.mot.equalsIgnoreCase(m.mot);
    }
}