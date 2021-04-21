// for returning a pair of max and min
class Pair<T> {
	T data1;
	T data2;

	Pair(T data1, T data2) {
		this.data1 = data1;
		this.data2 = data2;
	}

}

// o(n)
public static Pair<Integer> maxMin(int[] arr) {

		int max = Integer.MIN_VALUE;
		int min = Integer.MAX_VALUE;

		for (int i = 0; i < arr.length; i++) {
			if (arr[i] > max) {
				max = arr[i];
			}

		}
		for (int i = 0; i < arr.length; i++) {
			if (arr[i] < min) {
				min = arr[i];
			}

		}

		Pair<Integer> pair = new Pair<>(max, min);
		return pair;
	}

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5 };
		Pair<Integer> pair = maxMin(arr);
		System.out.println("Max: " + pair.data1 + "  Min: " + pair.data2);

	}

}
