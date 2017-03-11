import java.util.ArrayList;
import java.util.Collections;
/**
 *
 * @author M-H
 */
public class ListeTriee extends ArrayList implements Comparable{
    
    //public CreneauHoraireComparable compa;
    public ListeTriee(){
        super();
    }
    
    
    @Override
    public boolean add(Object o){//redefinition de la methode add pour pouvoir prendre que des elements comparable
        if(!(o instanceof Comparable)){
            return false;
        }else{
            super.add(o);
            return true;
        }
    }
    
    @Override
    public int compareTo(Object o){//redefinition de comparable pour eviter que liste triee soit une classe abstraite
        
        CreneauHoraireComparable compa = (CreneauHoraireComparable)o;
        
        return compa.compareTo(o);//utilisation de la methode de comparaison de creneauHoraireComparable
    }
    
    
    
    public void sort(ListeTriee liste){
        
        //il faut preciser quelque part dans l'implantation de la classe que la liste prend des elements comparables et non des objets tout simples
        
        
    }
}
