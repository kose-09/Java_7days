package day3;

public class Prob308 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("num = " + num);
		if(num != 1) {
			System.out.println("1ではありません");
		}else {
			System.out.println("１です");
		}
	}

}
