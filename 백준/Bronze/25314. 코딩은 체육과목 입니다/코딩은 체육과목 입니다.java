import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        String l = new String();
        for (int i = 0; i < n/4; i++) {
            l+= "long"+" ";
        }

        System.out.println(l+"int");
        sc.close();
    }
}