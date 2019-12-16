public class Calc{
    static int a;// static class variable declared outside method and inside the class
    static int b;// static class variable declared outside method and inside the class

    // No return type  - with parameters STATIC Method
    public static void addition(int a, int b) {
        System.out.print("Addition of "+a+" and "+b+" = ");
        System.out.println(a+b);
    }
    // No return type - with parameters STATIC Method
    public static void sub(int a, int b){
        System.out.print("Subtraction of "+a+" and "+b+" = " );
        System.out.println(a-b);
    }
    //No return type - with parameters STATIC Method
     public static void mult(int a, int b){
        System.out.print("Multiplication of "+a+" and "+b+" = ");
        System.out.println(a*b);
     }
     //No return type - with parameters STATIC Method
     public static void div(int a, int b){
        System.out.print("Division of "+a+" and "+b+" = ");
        System.out.println((a/b));
     }
      // maim method
    public static void main(String[] args){
        System.out.println("     Calculator");
        addition(a =6, b= 12);
        sub(a=20, b=10);
        mult(a=30, b=30);
        div(a=40, b=5);
    }

















}







