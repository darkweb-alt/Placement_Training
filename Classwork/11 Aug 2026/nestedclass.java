class person{
    int age=20;
    String name="Person";
    class student{

        int age=21;
        String name="Student";
          class LateralStudent{
        String name="Late guys";
    }
    }
  
}

public class nestedclass {
    public static void main(String[] args) {
        person p=new person();
        person.student stu=p.new student();
        System.out.println(p.age);
        System.out.println(p.name);
        System.out.println(stu.age);
        System.out.println(stu.name);
        person.student.LateralStudent obj=stu.new LateralStudent();
        System.out.println(obj.name);
    }
    
}
