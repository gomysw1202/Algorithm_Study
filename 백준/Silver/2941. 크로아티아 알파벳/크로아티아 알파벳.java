import java.io.*;

public class Main {

    public static void main(String[] args) throws IOException {
       BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

       String[] sArr = {"c=","c-","dz=","d-","lj","nj","s=","z="};

       String s = br.readLine();

       for(String val : sArr) {
           while(s.contains(val)){
               s = s.replace(val, "A");
           }
       }

        System.out.println(s.length());
       
       br.close();
    }

}
