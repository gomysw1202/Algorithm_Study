import java.util.Scanner;

public class Main {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        String[] aArr = sc.next().split("");
        String[] bArr = sc.next().split("");

        String a = "";
        String b = "";
        for(int i=aArr.length-1; i>=0; i--) {
            a+= aArr[i];
            b+= bArr[i];
        }

        if (Integer.parseInt(a) > Integer.parseInt(b)) {
            System.out.println(a);
        }
        else {
            System.out.println(b);
        }

        sc.close();
    }
}