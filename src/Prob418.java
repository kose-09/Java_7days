
public class Prob418 {
	
	public static void main(String[] args) {
		for(int m = 1; m <= 10; m++) {
			for(int n = 1; n <= 10; n++) {
				if(m == n) {
					System.out.print("■ ");
				}else {
					System.out.print("□ ");
				}
			}
			System.out.println();
		}
	}

}
