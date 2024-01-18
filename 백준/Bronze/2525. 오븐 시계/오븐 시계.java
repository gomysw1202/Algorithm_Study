import java.util.Scanner;

public class Main {
   
   public static void main(String[] args) {
      
      Scanner sc = new Scanner(System.in);
      int a = sc.nextInt();
      int b = sc.nextInt();
      int c = sc.nextInt();
      
      
      if(c>=60) { 
         a = c/60 + a;
         b = c%60 + b;
         if(b >= 60) {
            a = a+1;
            b = b-60;
         }
      }
      
      else {
         b = b+c;
         if(b >= 60) {
            a = a+1;
            b = b-60;
         }
        }
      
      if(a == 24) {
         a = 0;
      }
      else if(a > 24) {
         a = a - 24;
      }
      
      System.out.println(a+ " " +b);
      
      sc.close();
   }
}	