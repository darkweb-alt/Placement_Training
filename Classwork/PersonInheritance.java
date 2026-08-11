class Person {

    String name = "Person";
    String work = "Sleeping";
    String activity = "";

    void activityfn(String hobby) {
        activity = hobby;
    }
}

class Student extends Person {
    Student(String name, String work){
        this.name=name;
        this.work=work;
    }
}

class Child extends Person {
    String parent="Venkat";
    Child(String name, String work){
        this.name=name;
        this.work=work;
    }
}

class Customer extends Person {
    Customer(String name, String work){
        this.name=name;
        this.work=work;
    }
}

class Visitor extends Person {
    Visitor(String name, String work){
        this.name=name;
        this.work=work;
    }
}

public class PersonInheritance {

    public static void main(String[] args) {

        Visitor v = new Visitor("Visitor","Visiting");
        Customer c = new Customer("Customer","Shopping");
        Child ch = new Child("Child","Playing");
        Student st = new Student("Student","Studying");

        // Visitor
       
        v.activityfn("Taking Photos");

        System.out.println("Visitor Details:");
        System.out.println("Name: " + v.name);
        System.out.println("Work: " + v.work);
        System.out.println("Activity: " + v.activity);

        System.out.println();

        // Customer

        c.activityfn("Buying Products");

        System.out.println("Customer Details:");
        System.out.println("Name: " + c.name);
        System.out.println("Work: " + c.work);
        System.out.println("Activity: " + c.activity);

        System.out.println();

        // Child
  
        ch.activityfn("Playing Cricket");

        System.out.println("Child Details:");
        System.out.println("Name: " + ch.name);
        System.out.println("Parent: " + ch.parent);
        System.out.println("Activity: " + ch.activity);

        System.out.println();

        // Student
     
        st.activityfn("Coding");

        System.out.println("Student Details:");
        System.out.println("Name: " + st.name);
        System.out.println("Work: " + st.work);
        System.out.println("Activity: " + st.activity);
    }
}