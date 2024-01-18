import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();

       for(int c=b; c>0; c/=10){
           System.out.println(c%10*a);
       }

        System.out.println(a*b);
    }
}