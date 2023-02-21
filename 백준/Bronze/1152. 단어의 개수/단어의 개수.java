import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().trim();

        String[] sArr = s.split(" ");

        int cnt = 0;
        for(int i=0; i< sArr.length; i++) {
            if(!sArr[i].isEmpty()) {
                cnt++;
            }
        }

        bw.write(cnt+"");

        bw.flush();
        bw.close();
        br.close();
    }
}