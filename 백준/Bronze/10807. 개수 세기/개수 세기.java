import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 숫자 갯수

        StringTokenizer st = new StringTokenizer(br.readLine());

        int num = Integer.parseInt(br.readLine());

        int cnt = 0;

        while(st.hasMoreTokens()) {

            if(Integer.parseInt(st.nextToken()) == num) {
                cnt++;
            }
        }
        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }

}