import java.util.*;

class q1{ 
    void formatDays(int n){
        int  years = n/360;
        int  months = (n%360)/12;
        int days = ((n%360)%12);
        System.out.println(years+" : "+months+" : "+days);
    
    }
}
public class Main {
    public static void main(String[] args) {
        q1 a1 = new q1();
        a1.formatDays(360);
        
    }
}

