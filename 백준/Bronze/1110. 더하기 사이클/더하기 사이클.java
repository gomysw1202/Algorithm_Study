import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int num = Integer.parseInt(br.readLine());
        int sum = num;
        int count = 0;

        while(true) {

            int a = sum % 10; // 6
            int b = a + sum/10; // 8

            if(b >= 10){
                b = b % 10;
            }
            sum = a*10+b;
            count++;
            if(num == sum) {
                System.out.print(count);
                break;
            }
        }
    }

}
