import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int n = Integer.parseInt(br.readLine());

        for(int i=0; i<n; i++){
            st = new StringTokenizer(br.readLine());
            int num = Integer.parseInt(st.nextToken());

            int a = (num / 10) % 10 * 10 + num % 10;
             if((num+1)%a == 0) {
                 bw.write("Good");
             }else {
                 bw.write("Bye");
             }
            bw.newLine();
        }
        bw.flush();
        bw.close();
    }
}