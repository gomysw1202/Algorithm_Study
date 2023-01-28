import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int A = sc.nextInt();
        int B = sc.nextInt();
        int C = sc.nextInt();

        B = A * 60 + B + C;
        if(B >= 1440) {
            B = B - 1440;
        }

        if(B < 59) {
            A = 0;
        }
        else {
            A = B/60;
            B = B - A * 60;
        }

        System.out.println(A + " " + B);
        sc.close();
    }
}