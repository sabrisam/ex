import java.util.Scanner;

public class Exercice1 {

    /**
     * Cette fonction prend un tableau de Strings en paramètre et retourne un
     * nouveau tableau contenant les mêmes éléments, avec une case disponible de
     * plus.
     */
    public static String[] agrandirTab(String[] tab) {
        String[] nouvTab = new String[tab.length+1];
        for (int i=0; i<tab.length; i++){
            nouvTab[i] = tab[i];
        }
        return nouvTab;
    }

	 /**
     * Cette fonction lit des mots sur la ligne de commande et les retourne dans
     * un tableau de Strings. Chaque "mot" est définit comme une ligne complète,
     * du début de la ligne entrée jusqu'au prochain \n.
     */
    public static String[] lireMot() {
    	Scanner clavier = new Scanner(System.in);
    	String[] mots = new String[10];
    	for(int i = 0; i<mots.length; i++) {
    		mots[i] = clavier.nextLine();
    	}
        return mots;
    }
    
    /**
     * Cette fonction prend en paramètre un tableau de mots et retourne un
     * nouveau tableau contenant ces mots triés en ordre croissant.
     */
    public static String[] trier(String[] mots) {
        String temp;
        for (int i=0; i<mots.length; i++){
            for(int j=i+1; j<mots.length; j++){
                if (mots[i].compareToIgnoreCase(mots[j])>0){
                    temp = mots[i];
                    mots[i] = mots[j];
                    mots[j] = temp;
                }
            }
        }
        return mots;
    }
    
    /**
     * Cette fonction prend en paramètre un tableau de mots trié et retourne un
     * nouveau tableau où chaque mot est unique (tous les doublons sont
     * retirés).
     */
    public static String[] retirerDoublons(String[] mots) {
    	
    	
    	
		return mots;
    }
    	
    	
    	
    
   
    
    
    
    
    
    /**
     * Fonction principale du programme (utilisée pour tester le code).
     */
    public static void main(String[] args) {
        
    	String[] mots= {"a","a","c","d","d","t","r","r","s","s","z"};
    	int taille = mots.length;
    	String temp[] = new String[mots.length];
    	int j = 0 ;
    	
    	for(int i = 0; i<taille-1; i++) {
    		if(mots[i] != mots[i+1]) {
    			temp[j++] = mots[i];
    		}
    	}
    	temp[j++] = mots[taille-1];
    	
    	for(int k=0; k<j; k++) {
    		System.out.println(temp[k]);
    	}
    	
    }
} 	
    	
    			
    		
		
   

