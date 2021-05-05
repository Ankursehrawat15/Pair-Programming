
class Solution {
	public int rangeSumBST(TreeNode root, int low, int high) {

		if (root == null)
			return 0;

		int sum = 0;
		if (root.val >= low && root.val <= high) {
			sum += root.val;

		}

		int leftSum = rangeSumBST(root.left, low, high);
		sum += leftSum;
		int rightSum = rangeSumBST(root.right, low, high);
		sum += rightSum;

		return sum;

	}
}
