
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int h = sc.nextInt();
		int m = sc.nextInt();
		
		if(m<45) {
			m=60-(45-m);
			if(h-1<0) {
				h = 24+h-1;
			}
			else
				h=h-1;
		}
		else if(m>45)
			m = m-45;
		
		else if(m==45) {
			m=0;
		}
		
		System.out.println(h);
		System.out.println(m);
		
		sc.close();
	}
}
