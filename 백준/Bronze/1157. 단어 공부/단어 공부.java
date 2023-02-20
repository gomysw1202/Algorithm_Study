import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.OutputStreamWriter;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        String s = br.readLine().toUpperCase();// 입력 받은 문자열 대문자로 변경
        int[] alpa = new int[26]; // 대문자 알파벳 길이만큼 배열 생성

        for (int i = 0; i < s.length(); i++) { // 문자 길이만큼 반복
            alpa[(int) s.charAt(i) - 65] += 1; // 해당 알파벳 위치에 1증가
        }

        int max = 0; // 최대 언급 카운트 담기
        int rs = 0;
        for (int i = 0; i < alpa.length; i++) {
            if (alpa[i] > max) {
                max = alpa[i];
                rs = i+65;
            }
        }

        for(int i=0; i<alpa.length; i++) {
           if(max==alpa[i] && i!=rs-65) {
               rs = 63;
           }
        }

        bw.write((char)rs);

        bw.flush();
        bw.close();
        br.close();
    }
}