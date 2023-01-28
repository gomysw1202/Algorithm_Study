import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

       if(A==B && B==C && A==C) {
           System.out.println(10000+A*1000);
       }
       else if (A==B || A==C) {
           System.out.println(1000+A*100);
       }
       else if (B==C) {
           System.out.println(1000+B*100);
       }
       else {
           int i = Math.max(A, B);
           i = Math.max(i, C);
           System.out.println(i*100);
       }

        sc.close();
    }
}