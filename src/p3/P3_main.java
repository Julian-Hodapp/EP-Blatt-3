package p3;

public class P3_main {
	public static void main(String[] args) {
		int k = -5;
		
		if (k < 0) {
			System.out.println("Der Betrag von k ist: " + k * -1);
		} else {
			System.out.println("Der Betrag von k ist: " + k);
		}
		
		System.out.println("K zum Quadrat: " + k * k);
		
		if (k % 2 == 0) {
			System.out.println("die Zahl k ("+ k + ") ist gerade");
		} else {
			System.out.println("die Zahl k (" + k + ") ist ungerade");
		}
		
		
	}
}
