class Solution {

    public ListNode addTwoNumbers(ListNode l1, ListNode l2) {

        ListNode result = new ListNode(0); // dummy head
        ListNode ptr = result;

        int carry = 0;    // Set default carry

        while (l1 != null || l2 != null) {
            int sum = carry;    // Initialize sum with carry

            if (l1 != null) {    // Use number from first list
                sum += l1.val;
                l1 = l1.next;
            }

            if (l2 != null) {    // Use number from 2nd list
                sum += l2.val;
                l2 = l2.next;
            }

            carry = sum / 10;    // Calculate carry
            sum = sum % 10;      // Digit to store

            ptr.next = new ListNode(sum);
            ptr = ptr.next;
        }

        if (carry == 1) {
            ptr.next = new ListNode(1);
        }

        return result.next;
    }
}
