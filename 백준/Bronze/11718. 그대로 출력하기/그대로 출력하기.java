import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String result = "";
        while(true) {
            String line = br.readLine();
            if(line == null) {
                break;
            }
            result += line+"\n";
        }

        bw.write(result);

        bw.close();
        br.close();
    }
}