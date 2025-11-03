package h3;

public class H3_main {
	public static void main(String[] args) {
		//max = wie viele Personen maximal einen Fixplatz erhalten dürfen
		//fix = wie viele Personen bereits einen Fixlplatz für die Veranstaltung erhalten haben
		//wartend = wie viele Personen sich noch auf der Warteliste für einen Fixplatz befinden
		int max = 110, fix = 60, wartend = 70;
		
		boolean istVoll = false;
		
		if (fix > max) {
			System.out.println("Der Kurs ist überfüllt");
			
			//anpassen
		} else if(max == fix) {
			System.out.println("Der Kurs ist schon voll");
			
			istVoll = true;
		} else {
			int freiePlätze = max - fix;
			
			if (freiePlätze > wartend) {
				fix += wartend;
				
				wartend = 0;
			} else if (freiePlätze == wartend) {
				fix += freiePlätze;
				
				wartend = 0;
				
				istVoll = true;
			} else {
				fix += freiePlätze;
				
				wartend -= freiePlätze;
				
				istVoll = true;
			}
		}
		
		System.out.println("max: " + max);
		System.out.println("fix: " + fix);
		System.out.println("wartend: " + wartend);
		System.out.println("istVoll: " + istVoll);
		
	}
}
