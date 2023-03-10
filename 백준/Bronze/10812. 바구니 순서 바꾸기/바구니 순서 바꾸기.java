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

        int[] arr = new int[n]; // 바구니 생성
        int[] temp = new int[n];

        for(int i=0; i<n; i++){ // 바구니에 숫자넣기
            arr[i] = i+1;
        }

        for(int i=0; i<m; i++){ // 교환 횟수 만큼 반복

            st = new StringTokenizer(br.readLine());

            int x = Integer.parseInt(st.nextToken())-1; // 바구니 시작
            int y = Integer.parseInt(st.nextToken())-1; // 바구니 끝
            int z = Integer.parseInt(st.nextToken())-1; // 바구니 중간


            int cnt = 0;

            for(int j=z; j<=y; j++){
                temp[cnt++] = arr[j];
            }

            for(int j=x; j<z; j++) {
                temp[cnt++] = arr[j];
            }

            for(int j=0; j<cnt; j++){
                arr[x+j] = temp[j];
            }
        }

        for(int i=0; i< arr.length; i++) {
            System.out.print(arr[i] + " ");
        }

    }
}
