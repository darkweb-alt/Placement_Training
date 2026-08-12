// shapes --?class
// area()   --> Area of the shapes  

// area(int)---?square  +a*a;

// area(int, int) -->rect 

package Aug_12_2026;

class Shapes{
    void area(){
        System.out.println("Welcome to find the area of Shapes");

    }
   void area(int a){
        System.out.println("Area of Square is "+ a*a);

    }

    void area(int a, int b){
        System.out.println("Area of Rectangel is "+ a*b);
    }
    void area(float b, int h){
        System.out.println("Area of triangle is "+0.5*(double)(b*h));
    }
    void area(double a, int rad){
        System.out.println("The area of circle is "+ 3.1415* rad*rad);
    }
}

public class areafinding {
   public static void main(String[] args) {
     Shapes sp=new Shapes();
    sp.area();
     sp.area(5);
    sp.area(5,6);
   
    sp.area(5.5f,6);
    sp.area(6.5,7);

   }

}