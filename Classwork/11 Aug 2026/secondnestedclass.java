class Subject {
    int a = 5;
    class App_Development {
        int mark = 99;
        String code = "20CS212";
        String staff = "Shanmugha";
        void display() {
            System.out.println("Welcome to Mobile Application Development Course");
        }
    }
    class Physics {
        int mark = 99;
        String code = "20PH211";
        String staff = "Chitra";

        void display() {
            System.out.println("Welcome to Nano Tech Physics Course");
        }
    }
    class JavaProgramming {
        int mark = 99;
        String code = "20CS213";
        String staff = "Divya";

        void display() {
            System.out.println("Welcome to Java Programming Course");
        }
    }
    class Webtech {
        int mark = 99;
        String code = "20CS212";
        String staff = "Anusha";
        void display() {
            System.out.println("Welcome to Website Development Course");
        }
    }
}
public class secondnestedclass {
    public static void main(String[] args) {
        // Creating object of outer class
        Subject sub = new Subject();
        // Creating objects of non-static inner classes
        Subject.App_Development app = sub.new App_Development();
        Subject.JavaProgramming java = sub.new JavaProgramming();
        Subject.Physics phy = sub.new Physics();
        Subject.Webtech web = sub.new Webtech();
        // App Development details
        System.out.println(app.code);
        System.out.println(app.mark);
        System.out.println(app.staff);
        app.display();
        System.out.println();
        // Java Programming details
        System.out.println(java.code);
        System.out.println(java.mark);
        System.out.println(java.staff);
        java.display();
        System.out.println();
        // Physics details
        System.out.println(phy.code);
        System.out.println(phy.mark);
        System.out.println(phy.staff);
        phy.display();
        System.out.println();
        // Web Technology details
        System.out.println(web.code);
        System.out.println(web.mark);
        System.out.println(web.staff);
        web.display();
    }
}