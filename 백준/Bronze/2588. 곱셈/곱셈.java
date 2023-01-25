import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int a = sc.nextInt();
        int b = sc.nextInt();
        int sum = a*b;
        ArrayList<Integer> list = new ArrayList<>();
        while(b != 0) {
            list.add(b%10);
            b /= 10;
        }

        for (int i = 0; i<list.size(); i++) {
            System.out.println(a*list.get(i));
        }
        System.out.println(sum);
        sc.close();
    }
}