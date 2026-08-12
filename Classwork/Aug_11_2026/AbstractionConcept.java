package Aug_11_2026;
abstract class Home{
    void visible(){
        System.out.println("SOFA TV FRIDGE");
    }
    abstract void hide();
}

class myself extends Home{
 @Override 
 void hide(){
    System.out.println("Jewels docx money certificate");
 }
}
class somebody extends myself{
   void hide(){
    System.out.println("jewels");
   }

}

public class AbstractionConcept {
    // what is abstraction,
    // ===? Hide process
    
    //We can implement  abstract(0% to 100%);

    public static void main(String[] args) {
        // myself m=new myself();
        // m.visible();
        // m.hide();
        somebody s=new somebody();
        s.hide();
        s.visible();
        
    }
}
