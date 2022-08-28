class Arithematic{
    void add(int a , int b)
                    {
    System.out.println("The sum of "+a+" + "+b+" = "+(a+b));
                        } 
    void diff(int a, int b){
        System.out.println("The difference of "+a+" - "+b+" = "+(a-b));
    }
    void mul(int a,int b){
        System.out.println("The product of "+a+" x "+b+" = "+(a*b));
    }
    void div(float  a , float b){
        System.out.println("The division of "+a+" / "+b+" = "+(a/b));
    }
    void mod(int a , int b){
        System.out.println("The modulo division  of "+a+" % "+b+" = "+(a%b));
    }
}

public class q2{
    public static void main(String[] args){
        Arithematic a = new Arithematic();
        a.add(4,7);
        a.mul(89,5);
        a.diff(56,345);
        a.mod(456,67);
        a.div(53,87);
    }
}
