import java.io.*;
import java.nio.Buffer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        String st = br.readLine();
        int cnt = 0;

        for(int i =0; i<st.length();i++){
            int n = st.charAt(i);
            if(n>=65 && n<=67){
                cnt += 3;
            }else if(n>=68 && n<=70){
                cnt += 4;
            }else if(n>=71 && n<=73){
                cnt += 5;
            }else if(n>=74 && n<=76){
                cnt += 6;
            }else if(n>=77 && n<=79){
                cnt += 7;
            }else if(n>=80 && n<=83){
                cnt += 8;
            }else if(n>=84 && n<=86){
                cnt += 9;
            } else if(n>=87 && n<=90){
                cnt += 10;
            }
        }

        System.out.println(cnt);

    }
}
