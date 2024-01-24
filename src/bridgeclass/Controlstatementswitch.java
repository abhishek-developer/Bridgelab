package bridgeclass;

public class Controlstatementswitch {

	public static void main(String[] args) {
		
		int num=2;
		
		switch(num) {
		case 0:
			System.out.println("number is 0");
			
		break;
		case 1:
			System.out.println("number is 1");
			
		break;	
		default:
			System.out.println("num is integer");
		
		}
		System.out.println(num);
		
		
		int i = 20;
		switch(i) {
		default:
			System.out.println("Default");
		case 1:
			System.out.println(100);
			break;
		case 2:
			System.out.println(200);
		case 3:
			System.out.println(300);
		}

	}

}
