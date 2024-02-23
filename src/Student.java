import java.net.SocketOption;
import java.net.SocketTimeoutException;
import java.sql.SQLOutput;

public class Student {
    int id;
    String name;

    public static void main(String args[]) {
        Student s1 = new Student();
        System.out.println(s1.id);
        System.out.println(s1.name);
    }
    public static void display(){
        System.out.println("Shown");
    }
}
class testStudent2{
    public static void main(String args[]){
        Student s2=new Student();
        s2.id=100;
        s2.name="Mahindra";
        System.out.println(s2.id+" "+s2.name);
    }
}

