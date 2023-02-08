import java.io.*;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st = new StringTokenizer(br.readLine());
        int n = Integer.parseInt(st.nextToken());

        int x = Integer.parseInt(st.nextToken());

        st = new StringTokenizer(br.readLine());
        String[] arr = new String[n];

        String num = "";
        for (int i = 0; i < arr.length; i++) {
            arr[i] = st.nextToken();
            if (Integer.parseInt(arr[i]) < x) {
                num += arr[i] + " ";
            }
        }

        bw.write(num);

        bw.flush();
        bw.close();
        br.close();
    }
}