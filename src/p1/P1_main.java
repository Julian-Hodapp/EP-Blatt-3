package p1;

public class P1_main {
	public static void main(String[] args) {
		int w = 6;
		
		if(w == 1 || w == 4) {
			System.out.println("Gewonnen !");
		} else if (w == 2) {
			System.out.println("Verloren !");
		} else if (w == 5) {
			System.out.println("Unentschieden !");
		} else {
			System.out.println("nicht definiert");
		}
	}
}
