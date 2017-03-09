import java.util.Scanner;
/**
 *
 * @author M-H
 */
public class CreneauHoraire implements Cloneable  { //on fait implementer cloneable pour pouvoir utiliser la methode clone
    protected int jour;
    protected int heure;
    protected int minute;
    protected int duree;
    
    //constructeur
    public CreneauHoraire(int j, int h, int m, int d){
        this.jour=j;
        this.heure=h;
        this.minute=m;
        this.duree=d;
    }
    
    //redefinition de la methode equals de la classe object
    @Override
    public boolean equals(Object o){
        if(!(o instanceof CreneauHoraire)){ //on verifie que l'objet est bien un creneau
            return false;
        }
        
        CreneauHoraire c = (CreneauHoraire)o; //cast:on instancie un creneau(c) et on lui attribue o 
                                              //mais en precisant que o est un creneau
        return duree==c.duree;//compare les entiers     
        
    }
    
    public static void saisieCreneau(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Veuillez saisir le jour");
        int jr = sc.nextInt(); //nextint est utilisé pour recuperer un int
        
        System.out.println("Veuillez saisir l'heure de debut: ");
        int hr = sc.nextInt();
        
        System.out.println("minute de debut: ");
        int min = sc.nextInt(); 
        
        System.out.println("durée(en minutes): ");
        int dr = sc.nextInt(); 
        
        System.out.println("Recapitulatif:\n jour: " + jr + "\ndebut: " + hr + "h" + min + "\nduree: " + dr);
    }
    
    //on redeclare la methode clone mais avec le code de la classe mere object
    @Override
   public Object clone() {
            CreneauHoraire creneau = null;
	    try {
	    	// On récupère l'instance à renvoyer par l'appel de la 
	      	// méthode super.clone()
	      	creneau = (CreneauHoraire) super.clone();
	    } catch(CloneNotSupportedException cnse) {
	      	// Ne devrait jamais arriver car nous implémentons 
	      	// l'interface Cloneable
	      	cnse.printStackTrace(System.err);
	    }
	    
	    // on renvoie le clone
	    return creneau;
	}
}