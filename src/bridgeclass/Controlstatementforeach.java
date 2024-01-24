package bridgeclass;

public class Controlstatementforeach {

	public static void main(String[] args) {
		
		int arr[] = {10,20,30,40,50};
		for(int num: arr) {
			System.out.println(num);
		}
		
		int arr1[]= {10,20,30,40,50,60,70,80,90,100};
		int sum = 0;
		for(int i: arr1) {
			sum = sum+i;
		}
		System.out.println(sum);

	}

}
