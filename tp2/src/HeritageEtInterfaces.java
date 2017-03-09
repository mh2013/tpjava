/**
 *
 * @author M-H
 */
public class HeritageEtInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreneauHoraire c1 = new CreneauHoraire(87,10,00,1);
        CreneauHoraire c2 = new CreneauHoraire(87,10,00,1);
        CreneauHoraire c3 = (CreneauHoraire) c1.clone();
        
       boolean b = c1==c2; //compare les adresses memoire
       boolean a = c1.equals(c2); //compare aussi les adresses memoire mais a été redefinie dans la classe CreneauHoraire
       boolean d = c3.equals(c2);
       System.out.println(b); //false
       System.out.println(a); //true
       System.out.println(d); //
       /*c1.saisieCreneau();*/
    }
    
}
