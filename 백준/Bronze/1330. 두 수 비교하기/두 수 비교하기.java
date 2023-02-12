import java.util.Scanner;

public class Main {//25083
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int A = sc.nextInt();
		int B = sc.nextInt();
		
		String y = "";
		if(A==B) {
			y="==";
		}
		else if(A<B) {
			y="<";
		}
		else {
			y=">";
		}
		
		System.out.println(y);
		
		sc.close();
	}
}
