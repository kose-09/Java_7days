package day4;

public class Prob416 {
	
	public static void main(String[] args) {
		for(int m = 1; m <= 9; m++) {
			for(int n = 1; n <= 9; n++) {
				System.out.print(m + "*" + n + "=" + m*n + " ");
			}
			System.out.println();
		}
	}

}
