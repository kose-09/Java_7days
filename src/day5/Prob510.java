package day5;

public class Prob510 {
	
	public static void main(String[] args) {
		int[] d = new int[7];
		for(int i = 0; i < d.length; i++) {
			d[i] = (int)(Math.random()*10)+1;
			System.out.print(d[i] + " ");
		}
		System.out.println();
		
		for(int i = 0; i < d.length; i++) {
			for(int j = 1; j <= d[i]; j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}

}
