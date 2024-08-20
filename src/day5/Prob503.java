package day5;

public class Prob503 {
	
	public static void main(String[] args) {
		int[] data = new int[10];
		data[0] = (int)(Math.random()*100)+1;
		data[1] = (int)(Math.random()*100)+1;
		data[2] = (int)(Math.random()*100)+1;
		data[3] = (int)(Math.random()*100)+1;
		data[4] = (int)(Math.random()*100)+1;
		data[5] = (int)(Math.random()*100)+1;
		data[6] = (int)(Math.random()*100)+1;
		data[7] = (int)(Math.random()*100)+1;
		data[8] = (int)(Math.random()*100)+1;
		data[9] = (int)(Math.random()*100)+1;
		for(int i = 0; i < data.length; i++) {
			System.out.print(data[i] + " ");
		}
		System.out.println();
		System.out.print("奇数：");
		for(int i = 0; i < data.length; i++) {
			int a = data[i] % 2;
			if(a == 1) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
		System.out.print("偶数：");
		for(int i = 0; i < data.length; i++) {
			int a = data[i] % 2;
			if(a == 0) {
				System.out.print(data[i] + " ");
			}
		}
		System.out.println();
	}

}
