import java.io.*;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        int n = Integer.parseInt(br.readLine()); // 테이스 케이스 횟수

        int[] rsArr = new int[n]; // 점수를 담는 배열 생성

        for(int i=0; i<n; i++) { // 테스트케이스 입력 반복문

            String st = br.readLine();
            int score = 0;
            int sum = 0;

            String[] stArr = st.split("");
            for(int j=0; j<stArr.length; j++) {

                if(stArr[j].equalsIgnoreCase("O")) {
                    sum += ++score;
                }
                else {
                    score = 0;
                }
                rsArr[i] = sum;
            }
        }

        for(int i=0; i<rsArr.length; i++) {
            bw.write(rsArr[i] + "\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}
