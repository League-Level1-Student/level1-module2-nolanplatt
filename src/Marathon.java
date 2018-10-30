public class Marathon {

	static int nextBibNumber;
	static int lastBibGivenOut;
	static String raceLocation = "New York";
	static String raceStartTime = "9.00am";

	String name;
	int speed;
	int bibNumber;

	Marathon(String name, int speed) {
		this.name = name;
		this.speed = speed;
	}

	public static void main(String[] args) {
		// create two athletes //print their names, bibNumbers, and the location of
		// their race. }
		// createAthlete();
		// createAthlete();

		Marathon marathon = new Marathon("bob", 3);
		nextBibNumber += 1;
		lastBibGivenOut = nextBibNumber;
		System.out.println("--------------------------");
		System.out.println("Name of athlete: " + marathon.name);
		System.out.println("Bib number: " + nextBibNumber);
		System.out.println("Race location: " + raceLocation);

		Marathon marathon2 = new Marathon("jerry", 3);
		nextBibNumber += 1;
		lastBibGivenOut = nextBibNumber;
		System.out.println("--------------------------");
		System.out.println("Name of athlete: " + marathon2.name);
		System.out.println("Bib number: " + nextBibNumber);
		System.out.println("Race location: " + raceLocation);
	}

	static void createAthlete() {

	}

}
