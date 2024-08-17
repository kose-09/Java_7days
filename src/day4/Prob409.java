package day4;

public class Prob409 {
	
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*100)+1;
			System.out.println(num);
			int a = num%10;
			if(a == 0) {
				break;
			}
		}
		System.out.println("終了します。");
	}

}
