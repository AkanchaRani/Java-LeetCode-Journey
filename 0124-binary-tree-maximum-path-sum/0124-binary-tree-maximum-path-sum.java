class Solution {

    int maxSum = Integer.MIN_VALUE;

    public int maxPathSum(TreeNode root) {
        findMax(root);
        return maxSum;
    }

    int findMax(TreeNode root) {

        if (root == null) {
            return 0;
        }

        // Ignore negative paths
        int left = Math.max(0, findMax(root.left));
        int right = Math.max(0, findMax(root.right));

        // Path passing through current node
        int currentPath = root.val + left + right;

        // Update global maximum
        maxSum = Math.max(maxSum, currentPath);

        // Return the best one-side path to parent
        return root.val + Math.max(left, right);
    }
}