import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;

        while(true) {
            String line = br.readLine();
            if("".equals(line) || line == null) {
                break;
            }
            st = new StringTokenizer(line);
            bw.write(Integer.parseInt(st.nextToken()) + Integer.parseInt(st.nextToken())+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }

}