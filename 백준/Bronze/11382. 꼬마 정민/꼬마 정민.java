import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());

        long sum = 0L;
        while(st.hasMoreTokens()) {
            sum += Long.parseLong(st.nextToken());
        }

        bw.write(sum+"");

        bw.close();
        br.close();

    }
}