package day4;

public class Prob408 {
	
	public static void main(String[] args) {
		while(true) {
			int num = (int)(Math.random()*10)+1;
			System.out.println(num);
			if(num == 10) {
				break;
			}
		}
		System.out.println("終了します。");
	}

}
