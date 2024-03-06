import java.io.IOException;

class Main {
    public static void main(String[] args) throws IOException {
        int c = System.in.read();
        int[] arr = new int[26];
        int max=0;
        int n=0;

        while(c>64){
            if(c<91){
                arr[c-65]++;
            }else {
                arr[c-97]++;
            }
            c = System.in.read();
        }

        for(int i=0; i<arr.length; i++){
            if(max<arr[i]) {
                max = arr[i];
                n = i + 65;
            }else if (max == arr[i]) {
                n = 63;
            }
        }
        System.out.println((char) n);

    }
}