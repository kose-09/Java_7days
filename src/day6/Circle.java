package day6;

public class Circle {
	//半径
	public double r;
	//円周の長さを求める
	public double circumference() {
		return 2 * 3.14 * r;
	}
	//面積の大きさを求める
	public double area() {
		return 3.14 * r * r;
	}

}
