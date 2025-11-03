package h2;

public class H2_main {
	public static void main(String[] args) {
		int jahr = 2025;
		
		boolean schalt = false;
		
		if (jahr % 4 == 0 & jahr % 100 != 0) {
			schalt = true;
		}
		
		if (schalt) {
			System.out.println("Das Jahr " + jahr + " ist ein Schaltjahr");
		} else {
			System.out.println("Das Jahr " + jahr + " ist kein Schaltjahr");
		}
	}
}
