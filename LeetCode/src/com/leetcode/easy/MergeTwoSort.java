// 21. Merge TWO sorted List

package com.leetcode.easy;



class ListNode {
    int val;
    ListNode next;

    ListNode(int val) {
        this.val = val;
        this.next = null;
    }
}

public class MergeTwoSort {

    public static ListNode mergeTwoLists(ListNode list1, ListNode list2) {

        if (list1 == null) return list2;
        if (list2 == null) return list1;

        ListNode head = null, ptr = null;

        while (list1 != null && list2 != null) {

            if (head == null) {
                if (list1.val < list2.val) {
                    head = ptr = list1;
                    list1 = list1.next;
                } else {
                    head = ptr = list2;
                    list2 = list2.next;
                }
                continue;
            }

            if (list1.val < list2.val) {
                ptr.next = list1;
                ptr = list1;
                list1 = list1.next;
            } else {
                ptr.next = list2;
                ptr = list2;
                list2 = list2.next;
            }
        }

        // Attach remaining nodes
        ptr.next = (list1 != null) ? list1 : list2;

        return head;
    }

    // ✅ main method to run in Eclipse
    public static void main(String[] args) {

        // list1 = [1,2,4]
        ListNode list1 = new ListNode(1);
        list1.next = new ListNode(2);
        list1.next.next = new ListNode(4);

        // list2 = [1,3,4]
        ListNode list2 = new ListNode(1);
        list2.next = new ListNode(3);
        list2.next.next = new ListNode(4);

        ListNode result = mergeTwoLists(list1, list2);

        // Print merged list
        while (result != null) {
            System.out.print(result.val + " ");
            result = result.next;
        }
    }
}
