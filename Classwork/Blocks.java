// Instance block, static block and local block


public class Blocks {
    {
        System.out.println("Hello Pitambar");
    }
    public static void main(String[] args) {
        // Blocks b=new Blocks();  
        // If we don't initialize the object of that class, then it won't get the memory , and hence it will not execute the code block of the class Blocks Teach me the concepts of those I think class doesn't have the memory that's why it is not displayed at first if u know the thing about it explain me more on it and also using static , kkeyword now it will  run , that's why java is called partially obj oriented programming

        System.out.println("This is main");
  

        {
            int a=5;
            System.out.println(a);
            System.out.println("Hello hiii I am inside the main");
            
        }
    
//    System.out.println(a);  I can't access
    }
    
}
