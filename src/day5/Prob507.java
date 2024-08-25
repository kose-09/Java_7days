package day5;

public class Prob507 {
	
	public static void main(String[] args) {
		//配列変数の作成
		int[] d = new int[5];
		for(int i = 0; i < d.length; i++) {
			d[i] = (int)(Math.random()*10)+1;
			System.out.print(d[i] + " ");
		}
		System.out.println();
		//合計の表示
		int sum = 0;
		for(int i = 0; i < d.length; i++) {
			sum += d[i];
		}
		System.out.println("合計値：" + sum);
		//平均の表示
		double avg = sum / 5.0;
		System.out.println("平均値：" + avg);
		//平均値より大きい値の表示
		System.out.print("平均値より大きい数：");
		for(int i = 0; i < d.length; i++) {
			if(d[i] > avg) {
				System.out.print(d[i] + " ");
			}
		}
		System.out.println();
		//平均値より小さい値の表示
		System.out.print("平均値より小さい数：");
		for(int i= 0; i < d.length; i++) {
			if(d[i] < avg) {
				System.out.print(d[i] + " ");
			}
		}
		System.out.println();
	}

}
