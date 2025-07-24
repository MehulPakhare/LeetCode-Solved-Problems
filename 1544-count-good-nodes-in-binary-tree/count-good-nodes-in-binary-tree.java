/**
 * Definition for a binary tree node.
 * public class TreeNode {
 *     int val;
 *     TreeNode left;
 *     TreeNode right;
 *     TreeNode() {}
 *     TreeNode(int val) { this.val = val; }
 *     TreeNode(int val, TreeNode left, TreeNode right) {
 *         this.val = val;
 *         this.left = left;
 *         this.right = right;
 *     }
 * }
 */
class Solution {
    public int goodNodes(TreeNode root) {
        return dfs(root, Integer.MIN_VALUE);
    }
        public int dfs(TreeNode node,int max_so_far){
            if(node== null){
                return 0;
            }

            int left = dfs(node.left, Math.max(max_so_far, node.val ));
            int right = dfs(node.right, Math.max(max_so_far, node.val));
            int ans = left + right;

            if(node.val >= max_so_far ){
                ans+=1;
            }

            return ans;        
    }
}
