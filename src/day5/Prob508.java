package day5;

public class Prob508 {
	public static void main(String[] args) {
		int[] d = new int[5];
		for(int i = 0; i < d.length; i++) {
			d[i] = (int)(Math.random()*20)-10;
			System.out.print(d[i] + " ");
		}
		System.out.println();
		
		int a = 0;
		for(int i = 0; i < d.length; i++) {
			if(d[i] > 0) {
				a++;
			}
		}
		System.out.println("0より大きい数：" + a + "個");
		
		int b = 0;
		for(int i = 0; i < d.length; i++) {
			if(d[i] < 0) {
				b++;
			}
		}
		System.out.println("0より小さい数：" + b + "個");
		
		int c = 0;
		for(int i = 0; i < d.length; i++) {
			if(d[i] == 0) {
				c++;
			}
		}
		System.out.println("0の個数：" + c + "個");
	}

}
