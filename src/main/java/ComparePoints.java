
public class ComparePoints {

	public String findDirections(String input) {
		String[] direction = input.split(",");
		// now we have an array of 4 things, first two are O P and second two
		// are Q R
		String result = null;
		String fromX = direction[0];
		String toX = direction[2];
		String fromY = direction[1];
		String toY = direction[3];
		if (fromX.equals(toX) && fromY.equals(toY)) {
			// if O equals Q and P equals R
			result = "Here"; // then we're already Here!
		} else if (fromX.compareTo(toX) < 0 && fromY.equals(toY)) {
			// if O is less than Q and P equals R
			result = "E"; // then we need to go East!
		} else if (fromX.compareTo(toX) > 0 && fromY.equals(toY)) {
			// if O is greater than Q and P equals R
			result = "W"; // then we need to go West!
		} else if (fromX.equals(toX) && fromY.compareTo(toY) > 0) {
			// if O is equal to Q and P is greater than R
			result = "S"; // then we need to go South!
		} else if (fromX.equals(toX) && fromY.compareTo(toY) < 0) {
			// if O is equal to Q and P is less than R
			result = "N"; // then we need to go North!

		} else if (fromX.compareTo(toX) < 0 && fromY.compareTo(toY) > 0) {
			// if O is less than Q and P is greater than R
			result = "SE"; // then we need to go SouthEast!
		} else if (fromX.compareTo(toX) > 0 && fromY.compareTo(toY) > 0) {
			// if O is greater than Q and P is greater than R
			result = "SW"; // then we need to go SouthWest!
		} else if (fromX.compareTo(toX) < 0 && fromY.compareTo(toY) < 0) {
			// if O is less than Q and P is less than R
			result = "NE"; // then we need to go NorthEast!
		} else if (fromX.compareTo(toX) > 0 && fromY.compareTo(toY) < 0) {
			// if O is greater than Q and P is less than R
			result = "NW"; // then we need to go NorthWest!

		}
		return result;

	}
}