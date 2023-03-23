import java.util.*;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int N = sc.nextInt();
        int count = 0;
        for (int i = 0; i < N; i++) {
            int num = sc.nextInt();
            boolean sosu = true;
            if(num==1){
                continue;
            }
            for(int j=2; j<num; j++) { 
                if (num % j == 0) {
                    sosu = false;
                }
            }
                if(sosu) {
                    count++;
                }
        }
        System.out.println(count);
    }
}