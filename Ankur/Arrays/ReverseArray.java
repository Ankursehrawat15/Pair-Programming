package arrays;

public class ReverseArray {

	public static void main(String[] args) {

		// input => 1,2,3,4,5
		// output => 5,4,3,2,1
		int[] arr = { 1, 2, 3 };
		reverse(arr);
		print(arr);

	}

	public static void print(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			System.out.print(arr[i] + " ");
		}

	}

	public static void reverse(int[] arr) {
		int start = 0;
		int end = arr.length - 1;

		while (start < end) {

			int temp = arr[start];
			arr[start] = arr[end];
			arr[end] = temp;
			start++;
			end--;
		}

	}

	public static void recursiveReverse(int[] arr, int start, int end) {

		if (start >= end)
			return;

		int temp = arr[start];
		arr[start] = arr[end];
		arr[end] = temp;
		recursiveReverse(arr, start + 1, end - 1);

	}

	public static void recursiveReverse(int[] arr) {

		recursiveReverse(arr, 0, arr.length - 1);

	}

}
