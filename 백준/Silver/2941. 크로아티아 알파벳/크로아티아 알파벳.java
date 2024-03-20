import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        
        String st = br.readLine();

        System.out.print(st.replaceAll("c=|c-|dz=|d-|lj|nj|s=|z="," ").length());
    }
}

// replaceAll() 안에는 정규식 표현


