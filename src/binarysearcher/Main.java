package binarysearcher;

public class Main {

	public static void main(String[] args) {
		int[] orderedList = {1,2,3,4,5,6,7,8,9,10};
		int itemPosition = BinarySearcher.activateSearch(orderedList, 9);
		System.out.println("Item position in the list: " + itemPosition);
		
		int nonExistentItem = BinarySearcher.activateSearch(orderedList, 33);
		System.out.print("Item not found in list: " + nonExistentItem);
	}
}
