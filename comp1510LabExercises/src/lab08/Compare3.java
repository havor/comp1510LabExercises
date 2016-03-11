package lab08;

@SuppressWarnings("rawtypes") 
public class Compare3 {
    
    @SuppressWarnings("unchecked")
    public static Comparable largest(
            Comparable c1, 
            Comparable c2,
            Comparable c3){
         if (c1.compareTo(c2) <0) 
             c1 = c2;
         if (c1.compareTo(c3) <0) 
             c1 = c3;
         return c1;        
    }
    
}
