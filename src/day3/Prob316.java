package day3;

public class Prob316 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println("num = " + num);
		if(num % (2*3) == 0) {
			System.out.println("2と3の公倍数です。");
		}else if(num % 2 == 0) {
			System.out.println("2の倍数です。");
		}else if(num % 3 == 0) {
			System.out.println("3の倍数です。");
		}
	}

}
