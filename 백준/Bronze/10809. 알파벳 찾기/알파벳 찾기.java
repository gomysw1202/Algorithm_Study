import java.io.*;
class Main {
    public static void main(String[] args) throws IOException {

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

        char[] arr = br.readLine().toCharArray();
        int[] arr2 = new int[26];

        for(int i=0; i<arr2.length; i++){
            arr2[i] = -1;
        }

        for(int i=0; i<arr.length; i++) {
           int num = (int) arr[i] - 97;
           if(arr2[num] == -1){
               arr2[num] = i;
           }
        }

        for(int i=0; i<arr2.length; i++){
            System.out.print(arr2[i]+" ");
        }

    }
}
