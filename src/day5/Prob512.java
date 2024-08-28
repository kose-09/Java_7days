package day5;

public class Prob512 {
	
	public static void main(String[] args) {
		
		int[][] d = new int[3][3];
		for(int m = 0; m < d.length; m++) {
			for(int n = 0; n < d[m].length; n++) {
				d[m][n] = (int)(Math.random()*10);
			}
		}
		
		for(int m = 0; m < d.length; m++) {
			for(int n = 0; n < d[m].length; n++) {
				System.out.print(d[m][n] + " ");
			}
			System.out.println();
		}
	}

}
