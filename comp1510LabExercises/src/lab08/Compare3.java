package lab08;

public class Compare3 implements Comparable<Compare3>{
    String strVal;
    
    public Compare3(String strVal) {
        this.strVal = strVal;
    }
    
    @Override
    public int compareTo(Compare3 c) {
        // TODO Auto-generated method stub
        return strVal.compareTo(c.strVal);
    }
    
    public static Compare3 largest(Compare3 c1, Compare3 c2, Compare3 c3){
        Compare3 temp;
        temp = (c1.compareTo (c2) >0) ? c1 : c2;
        temp = (temp.compareTo(c3) >0) ? temp: c3;
        return temp;     
    }
    
    public String toString() {
        return "Compare3 object: " + strVal;
    }
}
