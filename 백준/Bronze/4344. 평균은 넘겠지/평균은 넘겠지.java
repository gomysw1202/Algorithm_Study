import java.io.*;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out));

        StringTokenizer st;
        int c = Integer.parseInt(br.readLine()); // 테스트 케이스 수
        double[] pct_arr = new double[c]; // 퍼센트 결과를 담는 배열

        for(int i=0; i<c; i++) {
            st = new StringTokenizer(br.readLine());
            int n = Integer.parseInt(st.nextToken()); // 학생의 수
            double[] arr = new double[n]; // 학생 수 만큼의 배열
            double sum=0;
            double avg = 0; // 과목 평균 담는 변수
            int cnt = 0;// 평균을 넘는 학생의 수

            for (int j=0; j<arr.length; j++) {
                arr[j] = Integer.parseInt(st.nextToken()); // 학생 점수를 배열에 넣기
                sum += (double)arr[j];
            }

            avg = sum/n; // 과목 평균 구하기

            for(int j=0; j<arr.length; j++) {
                if(avg < arr[j]) {
                    cnt++;
                }
            }
            pct_arr[i] = (double)cnt*100/n; // 평균을 넘는 학생의 퍼센트
        }

        for (int i=0; i<pct_arr.length; i++) {
            bw.write(String.format("%.3f%%", pct_arr[i])+"\n");
        }

        bw.flush();
        bw.close();
        br.close();
    }
}


