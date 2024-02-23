//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    int id;
    String name;
    public void employee(int eid,String ename){
        eid=id;
        ename=name;
    }
    void display(){
        //Main two=new Main();
        System.out.println(id+" "+name);
    }
    public static void myMethod(){
        System.out.println("I got executed");
    }

    public static void main(String[] args) {
        myMethod();
        Main one=new Main();
        one.id=12;
        one.name="Rhajf";
        one.display();
    }
}