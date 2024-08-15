package day3;

public class Prob304 {
	public static void main(String[] args) {
		int num = (int)(Math.random()*100)+1;
		System.out.println("num = " + num);
		if(num <= 10 || num >=90) {
			System.out.println("10以下か、90以上の値です。");
		}
	}

}
