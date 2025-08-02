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
    public List<Integer> rightSideView(TreeNode root) {
        ArrayList<Integer> result = new ArrayList<>();
        Queue<TreeNode> queue = new LinkedList<>();
        
        

        if(root == null){
            return new ArrayList<>();
        } 

        queue.add(root);


        while(!queue.isEmpty()){
            int currLen = queue.size();
            int lastOne =0;

            for(int i =0; i < currLen; i ++){
                TreeNode node = queue.remove();

                lastOne = node.val;

                if(node.left!= null){
                    queue.add(node.left);
                }
                if(node.right != null){
                    queue.add(node.right);
                }
            }

            result.add(lastOne);

        }
        
        return result;
        
    }
}