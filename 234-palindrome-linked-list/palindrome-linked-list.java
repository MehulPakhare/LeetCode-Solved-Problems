/**
 * Definition for singly-linked list.
 * public class ListNode {
 *     int val;
 *     ListNode next;
 *     ListNode() {}
 *     ListNode(int val) { this.val = val; }
 *     ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */
class Solution {
    public boolean isPalindrome(ListNode head) {
        List<Integer> vals = new ArrayList<>();
        List<Integer> revVals = new ArrayList<>();
        boolean result = true;

        ListNode currentNode = head;
        while(currentNode != null){
            vals.add(currentNode.val);
            currentNode = currentNode.next;
        }

        for(int i = vals.size()-1; i>= 0; i--){
            revVals.add(vals.get(i));
        }

        for(int i=0; i < vals.size() -1; i++){
        if(vals.get(i) != revVals.get(i)){
            result = false;
        }   
        }

        return result;     
    }
}