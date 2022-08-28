class Arithematic1{
   int n1 , n2 ;
   public Arithematic1(int a , int b){
       n1 = a ;
       n2 = b;
   }
   public void add(){
       System.out.println(n1+" + "+n2+" = "+(n1+ n2));
   }
}
class arithematic2 extends Arithematic1{
    public arithematic2(int a , int b)
{
    super(a,b);
    
}
    public void diff(){
        System.out.println(n1+" - "+n2 +" = "+(n1-n2));
    }
} 

public class inheritance{
    public static void main(String[] args){
        arithematic2 a = new arithematic2(345,566);
        a.add();
        a.diff();
    }
}
