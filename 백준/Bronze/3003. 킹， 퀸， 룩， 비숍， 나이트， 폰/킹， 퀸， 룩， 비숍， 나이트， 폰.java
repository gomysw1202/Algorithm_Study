import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int[] arr = {1,1,2,2,2,8};
        int[] rs = new int[6];
        String a = "";
        for(int i=0; i<rs.length; i++) {
            rs[i] = sc.nextInt();
            a += arr[i] - rs[i] + " ";
        }
        System.out.println(a);
        
        sc.close();
    }
}