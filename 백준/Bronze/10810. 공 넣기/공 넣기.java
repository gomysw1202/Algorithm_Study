import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);


        int n = sc.nextInt(); // 바구니 수
        int m = sc.nextInt(); // 테스트 케이스 횟수

        int[] arr = new int[n]; // 바구니 배열 생성

        for (int x=0; x<m; x++) { // 테스트 케이스 횟수 만큼 반복
            int i = sc.nextInt(); // i 바구니
            int j = sc.nextInt(); // j 바구니
            int k = sc.nextInt(); // k번 공

            for(int y=i-1; y<j; y++) {
                arr[y] = k;
            }
        }

        for(int i=0; i<arr.length; i++){
            System.out.print(arr[i] + " ");
        }

        sc.close();
    }
}
