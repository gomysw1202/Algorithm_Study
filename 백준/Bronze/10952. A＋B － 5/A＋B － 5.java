import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        int a,b;
        Scanner scan = new Scanner(System.in);
        while(true) {
            a=scan.nextInt();
            b=scan.nextInt();
            if(a==0 && b==0) {
                break;
            }else {
                System.out.println(a+b);
            }
        }

    }

}