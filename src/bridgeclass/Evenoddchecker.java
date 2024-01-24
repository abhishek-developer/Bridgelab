package bridgeclass;
import java.util.Scanner;
public class Evenoddchecker {
      
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		
	     int a = scan.nextInt();
	     System.out.println("Enter a value of a");
		if(a%2 == 0) {
			System.out.println("a is even");
		}else {
			System.out.println("a is odd");
		}
		scan.close();
	}
	
}
