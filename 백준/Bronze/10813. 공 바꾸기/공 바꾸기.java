import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.StringTokenizer;

public class Main {

    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        StringTokenizer st = new StringTokenizer(br.readLine());

        int n = Integer.parseInt(st.nextToken()); // 바구니 수
        int m = Integer.parseInt(st.nextToken()); // 교환 횟수

        int[] arr = new int[n]; // 바구니 수 만큼 배열 생성
        int temp = 0; // 교환시 숫자를 저장할 임시공간

        for(int i=0; i<n; i++){
            arr[i] = i+1; // 바구니에 초기 번호 넣기
        }

        for(int i=0; i<m; i++){ // 교환 횟수 만큼 반복
            st = new StringTokenizer(br.readLine()); // 교환 할 바구니 입력

            int x = Integer.parseInt(st.nextToken())-1; // 바구니1 (배열이 0부터 시작하니 -1 해주기)
            int y = Integer.parseInt(st.nextToken())-1; // 바구니2

            temp = arr[x]; // 바구니1에 있는 숫자를 임시저장공간에 저장
            arr[x] = arr[y]; // 바구니2에 있는 숫자를 바구니1에 넣기
            arr[y] = temp; // 바구니1에 있던 숫자를 바구니2에 넣기
        }

        for(int i=0; i<arr.length; i++) {
            System.out.print(arr[i] + " "); // 배열 출력
        }
    }
}
