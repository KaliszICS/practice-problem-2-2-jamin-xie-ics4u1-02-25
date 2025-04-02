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
}

