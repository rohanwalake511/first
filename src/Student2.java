public class Student2 {
    int rollno;
    String name;
    void insertrecord(int r,String n){
        rollno=r;
        name=n;
    }
    void display(){
        System.out.println(rollno+" "+name);
    }
    public static void main(String args[]){
        Student2 s1=new Student2();
        Student2 s2=new Student2();
        s1.insertrecord(100,"Rock");
        s2.insertrecord(200,"Karan");
        s1.display();
        s2.display();
        Student s3= new Student();
        s3.display();
    }
}
