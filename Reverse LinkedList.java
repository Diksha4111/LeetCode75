class Solution {
    public ListNode reverseList(ListNode head) {
        ListNode t1 = null;
        while(head!=null){
            ListNode t2 = head.next;
            head.next = t1;
            t1 = head;
            head = t2;
        }
        return t1;
    }
}
