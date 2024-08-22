package day4;

public class Prob413 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		if(num >= 5) {
			int i = 0;
			while(i < num) {
				System.out.print("★");
				i++;
			}
			System.out.println();
		}else {
			System.out.println("発生した数値：" + num);
		}
	}

}
