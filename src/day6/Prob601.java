package day6;

public class Prob601 {
	
	public static void main(String[] args) {
		Minmax m = new Minmax();
		int a = 1, b = 2, c = 6;
		System.out.println(a + "と" + b + "と" + c + "のうち、最大のものは" + m.max(a,b,c));
		System.out.println(a + "と" + b + "と" + c + "のうち、最小のものは" + m.min(a,b,c));
		
	}

}
