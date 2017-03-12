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
    
    public CreneauHoraireComparable get(int i){
        return (CreneauHoraireComparable)super.get(i);//downcaste carsuper.get(i) retourne un objet et posait problème dans le trie
    }
    
    
    public void trie(){
        
        //il faut preciser quelque part dans l'implantation de la classe que la liste prend des elements comparables et non des objets tout simples
        int i = 0;
        if(this.get(i).compareTo(this.get(i+1))==-1){//si l'element à la position i est supérieur à celui à la position i+1
            int temp = this.get(i).duree;
            this.get(i).duree = this.get(i+1).duree;
            this.get(i+1).duree=temp;
        }
        
    }
}
