package day5;

public class Prob506 {
	
	public static void main(String[] args) {
		int[] data = new int[10];
		for(int i = 0; i < data.length; i++) {
			data[i] = (int)(Math.random()*10)+1;
			System.out.print(data[i] + " ");
		}
		System.out.println();
		
		int max = 1;
		for(int i = 0; i < data.length; i++) {
			if(data[i] > max) {
				max = data[i];
			}
		}
		System.out.println("最大値：" + max);
		
		int minimum = 10;
		for(int i = 0; i < data.length; i++) {
			if(data[i] < minimum) {
				minimum = data[i];
			}
		}
		System.out.println("最小値：" + minimum);
		
		int sum = 0;
		for(int i = 0; i < data.length; i++) {
			sum += data[i];
		}
		double avg = sum/10.0;
		System.out.println("平均値：" + avg);
		
	}

}
