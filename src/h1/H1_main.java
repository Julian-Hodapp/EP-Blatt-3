package h1;

public class H1_main {
	public static void main(String[] args) {
		double guthaben = -100, monEingang = 200;
		
		int rating = -2;
		
		boolean warnhinweis = true, negativ = true;
		
		warnhinweis = false;
		negativ = false;
		
		if (guthaben > 0) {
			negativ = false;
			rating += 3;
		} else if (guthaben == 0) {
			negativ = false;
			rating += 2;
		} else {
			negativ = true;
			
			if (monEingang >= guthaben * -1) {
				rating += 1;
			} else {
				rating -= 1;
				
				if (rating < 0) {
					warnhinweis = true;
				} else {
					warnhinweis = false;
				}
			}
		}
		
		System.out.println("Guthaben: " + guthaben);
		System.out.println("monEingan: " + monEingang);
		System.out.println("rating: " + rating);
		System.out.println("negativ: " + negativ);
		System.out.println("warnhinweis: " + warnhinweis);
	}
	
//	public static void main(String[] args) {
//		double guthaben = -100, monEingang = 200;
//		
//		int rating = -2;
//		
//		boolean warnhinweis, negativ;
//		
//		if (guthaben < 0) {
//			negativ = true;
//		} else {
//			negativ = false;
//		}
//		
//		if (guthaben > 0) {
//			rating += 3;
//		}
//		
//		if (guthaben == 0) {
//			rating += 2;
//		}
//		
//		if (guthaben < 0 & -1 * guthaben <= monEingang) {
//			rating += 1;
//		}
//		
//		if (guthaben < 0 & -1 * guthaben > monEingang) {
//			rating -= 1;
//		}
//		
//		if (guthaben < 0 & -1 * guthaben > monEingang & rating < 0) {
//			warnhinweis = true;
//		} else {
//			warnhinweis = false;
//		}
//		
//		System.out.println("Guthaben: " + guthaben);
//		System.out.println("monEingan: " + monEingang);
//		System.out.println("rating: " + rating);
//		System.out.println("negativ: " + negativ);
//		System.out.println("warnhinweis: " + warnhinweis);
//		
//	}
}
