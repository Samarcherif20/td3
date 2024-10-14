package td3;

public class Dictionnaire {
	private int nbMots;
    private MotDico[] dico;
    private String nom;
    private int i;
    
    public Dictionnaire(String nom, int t) {
        this.nom = nom;
        this.dico = new MotDico[t];
        this.nbMots = 0;
        this.i=0;
    }
    public void ajouterMot(MotDico m) {
        if (i < dico.length) {
            dico[i] = m;
            i++;
            nbMots++;
        } else {
            System.out.println("Dictionnaire plein");
        }
    }

   
    public void supprimerMot(String ch) {
        int pos = chercherMot(ch);
        if (pos != -1) {
            for (int i = pos; i < i - 1; i++) {
                dico[i] = dico[i + 1];
            }
            dico[i- 1] = null;
            i--;
            nbMots--;
        } else {
            System.out.println("Mot non trouvé ");
        }
    }

    
    public int chercherMot(String ch) {
        for (int i = 0; i < i; i++) {
            if (dico[i].getMot().equalsIgnoreCase(ch)) {
                return i  ;
            }}
		return i;}
        
       

    public void listerDico() {
        if (nbMots == 0) {
            System.out.println("Le dictionnaire est vide.");
        } else {
            for (int i = 0; i < i; i++) {
                System.out.println(dico[i]);
            }
        }
    }

    public int nbSynonymes(MotDico m) {
        int nb = 0;
        for (int i = 0; i < i; i++) {
            if (dico[i].synonyme(m)) {
                nb++;
            }
        }
        return nb;
    }

    // Getters
    public int getNbMots() {
        return nbMots;
    }

    public String getNom() {
        return nom;
    }



    public static void main(String[] args) {
       
        Dictionnaire larousse = new Dictionnaire("Larousse", 10);

        
        MotDico mot1 = new MotDico("oiseau", "Animal domestique  trés jolie");
        MotDico mot2 = new MotDico("chien", "Animal .");
        MotDico mot3 = new MotDico("elephant", "very cute.");
        
        larousse.ajouterMot(mot1);
        larousse.ajouterMot(mot2);
        larousse.ajouterMot(mot3);

        
        
        larousse.listerDico();

      
        int position = larousse.chercherMot("chat");
        if (position == -1) {
            System.out.println("Le mot 'chat' n'existe pas.");
        }

        
        
        position = larousse.chercherMot("oiseau");
        if (position != -1) {
            System.out.println("Mot trouvé : " + larousse.dico[position]);
        }

        
        System.out.println("Nombre de synonymes pour le mot 'elephant' : " + larousse.nbSynonymes(mot3));

        
        System.out.println("Suppression du mot 'oiseau' :");
        larousse.supprimerMot("oiseau");
        larousse.listerDico();
        

       

}}
