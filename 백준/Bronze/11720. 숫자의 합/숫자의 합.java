import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        String list = sc.next();

        char[] arr = list.toCharArray();
        int sum = 0;
        for(int i = 0; i < arr.length; i++) {
            sum += arr[i] - 48;
        }
        System.out.println(sum);
        sc.close();
    }
}