import java.util.Scanner;

public class rectanglePattern {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int len=sc.nextInt();
        int bre=sc.nextInt();
        for(int i=0;i<bre;i++){
            for(int j=0;j<len;j++){
                System.out.print("*");
            }
            System.out.println();
        }
        for(int i=0;i<len;i++){
            for(int j=0;j<i;j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
