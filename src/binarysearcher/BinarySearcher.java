package binarysearcher;

public class BinarySearcher {

	public static int activateSearch(int[] orderedList, int searchedItem) {
		int initialPosition = 0;
		int lastPosition = orderedList.length - 1;

		while (initialPosition <= lastPosition) {
			int middlePosition = (initialPosition + lastPosition) / 2;

			if (orderedList[middlePosition] == searchedItem)
				return middlePosition;
			
			if (orderedList[middlePosition] > searchedItem) {
				lastPosition = middlePosition - 1;
			} else {
				initialPosition = middlePosition + 1;
			}
		}
		
		return -1;
	}
}
