import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());
        int cnt = 0;
        for(int i=0; i<n; i++) {
            char[] arr = br.readLine().toCharArray();
            int[] arr2 = new int[26];
            boolean isGroup = true;

            for(int j=0; j<arr.length; j++){
                int a = arr[j]-97;
                if(arr2[a] > 0){
                    if(arr[j] != arr[j-1]){
                        isGroup = false;
                        break;
                    }
                }else {
                    arr2[a]++;
                }
            }
            if(isGroup){
                cnt++;
            }
        }

        System.out.print(cnt);
    }
}


