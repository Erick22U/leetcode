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
    public ListNode middleNode(ListNode head) {
        ListNode middle;
        ListNode curr = head;
        int count = 1;
        int mid;
        
        while(curr.next != null){
            curr = curr.next;
            count++;
        }
        
        curr = head;
        
        if(count % 2 == 0){
            mid = count / 2 + 1;
            for(int i = 1; i < mid; i++){
                curr = curr.next;
            }
        }
        else{
            mid = count / 2;
            for(int i = 1; i <= mid; i++){
                curr = curr.next;
            }
        }
        
        middle = curr;
        
        return middle;
    }
}