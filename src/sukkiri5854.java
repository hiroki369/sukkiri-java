
public class sukkiri5854 {
	public static void main(String [] args) {
		System.out.println("メソッドを呼び出します。");
		double triangleArea = calcTriangleArea(10.0,5);
		System.out.println(triangleArea);
		double circleArea = calcCircleArea(5);
		System.out.println(circleArea);
	}
	public static double calcTriangleArea(double bottom, double height) {
		double ans = (bottom * height)/2;
		return ans;
	}
	public static double calcCircleArea (double radius) {
		double ans = (radius * radius)*3.14;
		return ans;
	}
}
