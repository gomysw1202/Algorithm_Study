import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);

        StringBuilder sb = new StringBuilder();
        int n = sc.nextInt()/4;

        while(n-->0){
            sb.append("long ");
        }

        System.out.println(sb + "int");
    }
}