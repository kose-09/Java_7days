package day3;

public class Prob318 {
	
	public static void main(String[] args) {
		int temp = (int)(Math.random()*45)-10;
		System.out.println("摂氏" + temp + "度");
		if(temp >= 30) {
			System.out.println("真夏日です");
		}else if(temp >= 25 && temp < 30) {
			System.out.println("夏日です");
		}else if(temp < 0) {
			System.out.println("真冬日です");
		}
	}

}
