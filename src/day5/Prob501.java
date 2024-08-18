package day5;

public class Prob501 {
	
	public static void main(String[] args) {
		int[] a = new int[7];
		a[0] = (int)(Math.random()*10)+1;
		a[1] = (int)(Math.random()*10)+1;
		a[2] = (int)(Math.random()*10)+1;
		a[3] = (int)(Math.random()*10)+1;
		a[4] = (int)(Math.random()*10)+1;
		a[5] = (int)(Math.random()*10)+1;
		a[6] = (int)(Math.random()*10)+1;
		for(int i = 0; i < a.length; i++) {
			System.out.print("a["+i+"]=" + a[i] + " ");
		}
		System.out.println();
	}

}
