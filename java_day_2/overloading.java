class overloading{
    void add(int a , int b , int c ,int d){
            System.out.println(a+b+c+d);
        }
        void add(int a , int b , int c ){
            System.out.println(a+b+c);
        }
        void add(int a , int b){
            System.out.println(a+b);
        }
        void add(float a , float b , float c ,float d){
            System.out.println(a+b+c+d);
        }
        void add(float a , float b , float c ){
            System.out.println(a+b+c);
        }
        void add(float a , float b){
            System.out.println(a+b);
        }
}

public class inheritance{
    public static void main(String[] args){
        overloading a = new overloading();
        a.add(5,3,7,34);
        a.add(5,345,34);
        a.add(5,345);
        a.add(5.1,3.4,7.43,34.43);
    }
}
