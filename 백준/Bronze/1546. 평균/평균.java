import java.io.*;
import java.util.StringTokenizer;

class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        int n = Integer.parseInt(br.readLine());

        StringTokenizer st = new StringTokenizer(br.readLine());

        double[] arr = new double[n];
        int i=0;
        double max = 0;
        double sum=0;


        for(int j=0; j<n; j++){
            arr[j] = Integer.parseInt(st.nextToken());
            if(max<arr[j]){
                max = arr[j];
                i = j;
            }
        }

        for(int j=0; j<n; j++){
            arr[j] = arr[j]/max * 100;
            sum += arr[j];
        }

        System.out.println(sum/n);
    }
}
