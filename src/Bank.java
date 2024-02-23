public class Bank {
    int acc_no;
    String name;
    float amt;

    void insert(int i, String j, float k) {
        acc_no = i;
        name = j;
        amt = k;
    }

    void deposit(float k) {
        amt = amt + k;
        System.out.println(k + "deposited");
    }

    void withdraw(float k) {
        if (amt < k) {
            System.out.println("Insufficient Balance");
        } else {
            amt = amt - k;
            System.out.println(k + "Withdrawn");
        }
    }

    void check_balance() {
        System.out.println("Balance is " + amt);
    }

    void display() {
        System.out.println(acc_no + " " + name + " " + amt);
    }
}
class TestBank{
    public static void main(String [] args){
        Bank b1=new Bank();
        b1.insert(1234,"kiran",2500);
        Bank b2=new Bank();
        b2.insert(3456,"guru",5000);
        b1.display();
        b2.display();
        b1.check_balance();
        b2.check_balance();
        b2.deposit(200);
        b2.check_balance();
    }
}
