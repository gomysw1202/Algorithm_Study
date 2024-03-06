import java.io.*;
import java.util.Arrays;
import java.util.Locale;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        String st = br.readLine().toUpperCase();

        int[] arr = new int[26];
        int max=0;
        int c=0;

        for(int i=0; i<st.length(); i++){
            arr[st.charAt(i)-65]++;
        }

        for(int i=0; i<arr.length; i++){
            if(max < arr[i]) {
                max = arr[i];
                c = i+65;
            }
        }

        for(int i=0; i<arr.length; i++){
            if(max == arr[i] && c-65 != i) {
               c = 63;
            }
        }

        System.out.println((char) c);

    }
}
