import java.util.ArrayList;

public class array_list {
	public static void main(String[] args) {
		// Declare ArrayList of type String
		ArrayList<String> cars = new ArrayList<>();

		// Add elements
		cars.add("Volvo");
		cars.add("BMW");
		cars.add("Ford");

		// Print ArrayList
		System.out.println(cars);

		String firstElement = cars.get(0);

		cars.set(1, "bmw");

		cars.remove(2);

		cars.size();

		cars.clear();

	}
}
