package day4;

public class Prob412 {
	
	public static void main(String[] args) {
		int minimum = 100;
		for(int i = 0; i < 5; i++) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
			if(num < minimum) {
				minimum = num;
			}
		}
		System.out.println("最小値：" + minimum);
	}

}
