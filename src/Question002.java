/**
 * 给出两个 非空 的链表用来表示两个非负的整数。其中，它们各自的位数是按照 逆序 的方式存储的，并且它们的每个节点只能存储一位数字。
 * 如果，我们将这两个数相加起来，则会返回一个新的链表来表示它们的和。
 * 您可以假设除了数字 0 之外，这两个数都不会以 0 开头。
 * 示例：
 * 输入：(2 -> 4 -> 3) + (5 -> 6 -> 4)
 * 输出：7 -> 0 -> 8
 * 原因：342 + 465 = 807

 * Definition for singly-linked list.
 * public class ListNode {
 * int val;
 * ListNode next;
 * ListNode() {}
 * ListNode(int val) { this.val = val; }
 * ListNode(int val, ListNode next) { this.val = val; this.next = next; }
 * }
 */

public class Question002 {
    public static void main(String[] args) {
        ListNode l1 = new ListNode(1, new ListNode(5));
        ListNode l2 = new ListNode(6, new ListNode(5, new ListNode(6, new ListNode(9))));
        ListNode l3 = new ListNode();
        ListNode l4 = new ListNode();
        l4 = l3;
        boolean signal = false;
        int l1num = 0, l2num = 0;
        while (l1 != null || l2 != null) {
            if (l1 != null) {
                l1num = l1.val;
            } else {
                l1num = 0;
            }
            if (l2 != null) {
                l2num = l2.val;
            } else {
                l2num = 0;
            }
            if (signal) {
                l3.val = (l1num + l2num + 1) % 10;
            } else {
                l3.val = (l1num + l2num) % 10;
            }
            if (signal && l1num + l2num + 1 >= 10) {
                signal = true;
            } else if (!signal && l1num + l2num >= 10) {
                signal = true;
            } else {
                signal = false;
            }
            ListNode tem = new ListNode();
            if (l1 != null)
                l1 = l1.next;
            if (l2 != null)
                l2 = l2.next;
            if (l1 != null || l2 != null) {
                l3.next = tem;
                l3 = tem;
            }


        }
        if (signal) {
            ListNode tem = new ListNode(1);
            l3.next = tem;
        }
        System.out.println(l4.toString());

    }

}