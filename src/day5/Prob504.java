package day5;

public class Prob504 {
	
	public static void main(String[] args) {
		int[] data = new int[10];
		
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*100)+1;
		}
		
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("50以上の数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] >= 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("50未満の数：");
		for(int i = 0; i < data.length; i++) {
			if(data[i] < 50) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}
