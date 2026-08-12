package Aug_12_2026;

abstract class Employee{
    private String name;
    private double salary;
    
    void setName(String name){
     this.name=name;
    }
    String getName(){
        return name;
    }

    void setSalary(double salary){
this.salary=salary;
    }
    double getSalary(){
        return salary;
    }

    abstract void Bonus_call();
        // System.out.println("Calling Bonus");
    

    abstract void display_all();
        // System.out.println("will display");

}
abstract class Developer extends Employee{
      
}
abstract class Full_Stack extends Developer{

}
abstract class MERN_Stack extends Developer{
    
}
abstract class Manager extends Employee{
      
}

abstract class OfficeWorker extends Employee{
      
}



public class Empmgmt {
    

}