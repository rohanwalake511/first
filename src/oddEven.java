import java.util.Scanner;

public class oddEven {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int num= sc.nextInt();
        if(num%2==0){
            System.out.println("Even");
        }
        else{
            System.out.println("Odd");
        }
        int b=sc.nextInt();
        switch(b){
            case 1: System.out.println("Hello");
            break;
            case 2: System.out.println("Bonjour");
            break;
            case 3: System.out.println("Namaste");
            break;
            default: System.out.println("Wrong number");
        }
    }
}
