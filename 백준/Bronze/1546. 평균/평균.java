import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Main {
    public static void main(String[]args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());// 과목수 입력
        StringTokenizer st = new StringTokenizer(br.readLine()); // 점수 입력
        double[] arr = new double[n]; // 점수를 담는 배열 생성

        double max = 0; // 최댓값
        int num = 0; // 최대값의 인덱스
        double sum = 0; // 과목 총 합
        for(int i=0; i<arr.length; i++){
            arr[i] = Integer.parseInt(st.nextToken());
            if(max<arr[i]) {
                max = arr[i];
                num = i;// 최댓값 인덱스 담기
            }
        }

        for (int i=0; i<arr.length; i++) {
            arr[i] = (arr[i] / max) * 100;
            sum += arr[i];
        }

        System.out.println(sum/n);

    }
}
