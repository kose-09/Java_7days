package day3;

public class Prob309 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println("num = " + num);
		if(num < 50) {
			System.out.println("50未満です");
		}else {
			System.out.println("50以上です");
		}
	}

}
