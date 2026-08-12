package Aug_12_2026;

class Sample{
    void display(){
        System.out.println("Hello this is display");

    }
    void display(String name){
        System.out.println("Hello "+ name);
    }
}
public class polymorphism {
    public static void main(String[] args) {
        Sample sp=new Sample();
        sp.display();
        sp.display("Pitambar ");
    }

}
