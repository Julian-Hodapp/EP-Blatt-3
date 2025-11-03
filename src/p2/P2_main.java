package p2;

public class P2_main {
	public static void main(String[] args) {
		int a = 100, b = 100, c = 3, d = 0;
		
		boolean e1 = a == b, e2 = a == b || a == c, e3 = a + b >= c, e4 = a + b + c >= 100;
		
		if (e1) {
			++d;
		}
		
		if (e2) {
			++d;
		}
		
		if (e3) {
			++d;
		}
		
		if (e4) {
			++d;
		}
		
		System.out.println(d);
	}
}
