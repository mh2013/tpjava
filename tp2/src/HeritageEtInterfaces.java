import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author M-H
 */
public class HeritageEtInterfaces {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        CreneauHoraire c1 = new CreneauHoraire(87,10,00,2);
        CreneauHoraireComparable c2 = new CreneauHoraireComparable(87,10,00,1);
        CreneauHoraireComparable c4 = new CreneauHoraireComparable(87,10,00,3);
        CreneauHoraire c3 = (CreneauHoraire) c1.clone();
        ListeTriee liste = new ListeTriee(); 
        
       boolean b = c1==c2; //compare les adresses memoire
       boolean a = c1.equals(c2); //compare aussi les adresses memoire mais a été redefinie dans la classe CreneauHoraire
       boolean d = c3.equals(c2);
       System.out.println(b); //false
       System.out.println(a); //true
       System.out.println(d); //
       /*c1.saisieCreneau();*/
       int valcomparaison = c2.compareTo(c1);
       System.out.println(valcomparaison);
       if(liste.add(c2) || liste.add(c4)){
           System.out.println("ajout reussi");
       }
       System.out.println(liste.get(0).getClass());
       /*Collections.sort(liste);
       int i;
       for(i=0;i<=liste.size();i++){
           System.out.println(liste.get(i).duree);
       }*/
    }
    
}

