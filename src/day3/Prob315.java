package day3;

public class Prob315 {
	
	public static void main(String[] args) {
		int score = (int)(Math.random()*100)+1;
		System.out.println("点数：" + score);
		if(score >= 80) {
			System.out.println("優");
		}else if(score < 80 && score >= 70) {
			System.out.println("良");
		}else if(score < 70 && score >= 60) {
			System.out.println("可");
		}else {
			System.out.println("不可");
		}
	}

}
