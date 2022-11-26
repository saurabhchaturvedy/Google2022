package main.java.Random_Good_Problems.RandomGoodProblems_2.MicrosoftOA.EricProgramming.Backtracking;

class FrogJumps {
	public static int solve(int[] blocks) {
		int maxRange = 0;
		if (blocks == null || blocks.length <= 1) {
			return maxRange;
		}
		int n = blocks.length;
		int[] left = new int[n];
		int[] right = new int[n];

		left[0] = 0;
		for (int i = 1; i < n; i++) {
			if (blocks[i] <= blocks[i - 1]) {
				left[i] = left[i - 1] + 1;
			} else {
				left[i] = 0;
			}
		}
		right[n - 1] = 0;
		for (int i = n - 2; i >= 0; i--) {
			if (blocks[i] <= blocks[i + 1]) {
				right[i] = right[i + 1] + 1;
			} else {
				right[i] = 0;
			}
		}
		for (int i = 0; i < n; i++) {
			maxRange = Math.max(maxRange, left[i] + right[i] + 1);
		}
		return maxRange;
	}

	public static void main(String[] args) {
		int[] A = { 1, 5, 5, 2, 6, 5, 7 };
		System.out.println(solve(A));
	}
}