import java.util.Arrays;

public class PracticeProblem {

	public static void main(String args[]) {
		
	}

	public static int[] compareSearch(int[] array, int number) {
		int sequentialLoops = 0;
		for (int i = 0; i < array.length; i++) {
			sequentialLoops++;
			if (array[i] == number) {
				break;
			}
		}

		Arrays.sort(array);
		int binaryLoops = 0;
		int high = array.length - 1;
		int low = 0;
		int mid;

		while (low <= high) {
			binaryLoops++;
			mid = (low + high) / 2;
			if (array[mid] == number) {
				break;
			} else if (array[mid] < number) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return new int[]{sequentialLoops, binaryLoops};
	}

	public static int[] compareStringSearch(String[] array, String word) {
		int sequentialLoops = 0;

		for (int i = 0; i < array.length; i++) {
			sequentialLoops++;
			if (array[i].equals(word)) {
				break;
			}
		}

		Arrays.sort(array);
		int binaryLoops = 0;
		int low = 0;
		int high = array.length - 1;
		int mid;

		while (low <= high) {
			binaryLoops++;
			mid = low + (high - low) / 2;
			int comparison = array[mid].compareTo(word);

			if (comparison == 0) {
				break;
			} else if (comparison < 0) {
				low = mid + 1;
			} else {
				high = mid - 1;
			}
		}

		return new int[]{sequentialLoops, binaryLoops};
	}
}

