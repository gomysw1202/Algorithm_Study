import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();
        String[] result = new String[n];

        for (int i = 0; i < n; i++) {
            String[] sArr = sc.next().split("");
            result[i] = sArr[0] + sArr[sArr.length-1];
        }

        for(int i=0; i< n; i++) {
            System.out.println(result[i]);
        }

        sc.close();
    }
}