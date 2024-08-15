package day4;

public class Prob403 {
	
	public static void main(String[] args) {
		int num = (int)(Math.random()*10)+1;
		System.out.println("数：" + num);
		int i = 1;
		do {
			System.out.print("■ ");
			i++;
		}while(i <= num);
		System.out.println();
	}

}
