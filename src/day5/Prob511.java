package day5;

public class Prob511 {
	
	public static void main(String[] args) {
		int[] d = new int[5];
		for(int i = 0; i < d.length; i++) {
			d[i] = (int)(Math.random()*100)+1;
			System.out.print(d[i] + " ");
		}
		System.out.println();
		
		System.out.print("0以上60未満：");
		for(int i = 0; i < d.length; i++) {
			if(d[i] >= 0 && d[i] <60) {
				System.out.print(d[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("60以上80未満：");
		for(int i = 0; i < d.length; i++) {
			if(d[i] >= 60 && d[i] < 80) {
				System.out.print(d[i] + " ");
			}
		}
		System.out.println();
		
		System.out.print("80以上：");
		for(int i = 0; i < d.length; i++) {
			if(d[i] >= 80) {
				System.out.print(d[i] + " ");
			}
		}
		System.out.println();
	}

}
