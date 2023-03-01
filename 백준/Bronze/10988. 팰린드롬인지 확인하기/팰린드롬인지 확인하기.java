import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        String[] arr = st.split("");
        String rst = "";
        for(int i=arr.length-1; i>=0; i--) {
            rst += arr[i];
        }

        if(rst.equals(st)) {
            System.out.println(1);
        }
        else{
            System.out.println(0);
        }

    }

}
