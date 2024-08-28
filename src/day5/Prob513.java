package day5;

public class Prob513 {
	
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
		
		System.out.print("最大値：");
		int max = 0;
		for(int m = 0; m < d.length; m++) {
			for(int n = 0; n < d[m].length; n++) {
				if(d[m][n] > max) {
					max = d[m][n];
				}
			}
		}
		System.out.println(max);
		
		System.out.print("最小値：");
		int minimum = 9;
		for(int m = 0; m < d.length; m++) {
			for(int n = 0; n < d[m].length; n++) {
				if(d[m][n] < minimum) {
					minimum = d[m][n];
				}
			}
		}
		System.out.println(minimum);
	}

}
