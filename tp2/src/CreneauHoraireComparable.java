/**
 *
 * @author M-H
 */
public class CreneauHoraireComparable extends CreneauHoraire implements Comparable{
    public CreneauHoraireComparable(int j, int h, int m, int d){
        super(j, h, m, d);
    }
    
    @Override
    public int compareTo(Object o){
        if(!(o instanceof CreneauHoraire)){
            return 2;
        }
        
        CreneauHoraire c = (CreneauHoraire)o;
        if(duree==c.duree) {
            return 0;
        }else{
            if(duree>c.duree){
                return -1;
            }else{
                return 1;
            }
        }
    }
}