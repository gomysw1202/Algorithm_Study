import java.io.*;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int t = Integer.parseInt(br.readLine());

        while(t-- > 0) {
            int c = Integer.parseInt(br.readLine());

            int q = c/25;
            c = c % 25;
            int d = c/10;
            c = c % 10;
            int n = c/5;
            c = c % 5;
            int p = c;

            System.out.println(q+ " " + d + " " + n + " " + p);
        }
    }

}