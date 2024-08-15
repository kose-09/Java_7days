package day3;

public class Prob305 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println("num = " + num);
		if(num >= 20 && num < 80) {
			System.out.println("20以上80未満です。");
		}
	}

}
