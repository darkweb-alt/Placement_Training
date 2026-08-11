
public class StudentManagement{
    int id;
    String name;
    public int[] marks=new int[5];
     int totalmarks(int a){
    int total=0;
    for(int i=0;i<marks.length;i++){
   total+=marks[i];
    }
    return total;
    }
    public static void main(String[] args) {
        
    }
}


