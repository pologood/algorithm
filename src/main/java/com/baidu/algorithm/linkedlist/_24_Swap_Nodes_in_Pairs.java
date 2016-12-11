/**
 * Copyright (C) 2016 Baidu, Inc. All Rights Reserved.
 */
package com.baidu.algorithm.linkedlist;

import com.baidu.algorithm.ListNode;
import com.baidu.algorithm.Note;
import com.baidu.algorithm.Utils;

/**
 * _24_Swap_Nodes_in_Pairs
 *
 * @author xuhaoran01
 */
public class _24_Swap_Nodes_in_Pairs {

    @Note(desc = "防止环状引用, 先用nextNext保存下步的结果")
    public ListNode swapPairs(ListNode head) {

        if (head == null || head.next == null) {
            return head;
        }

        ListNode dummy = new ListNode(0), tail = dummy;
        while (head != null) {
            ListNode next = head.next;
            ListNode nextNext = null;

            if (next != null) {
                tail.next = next;
                tail = tail.next;
                nextNext = next.next;
            }

            tail.next = head;
            tail = tail.next;

            head = nextNext;
        }

        tail.next = null;

        return dummy.next;
    }

    public static void main(String[] args) {
        ListNode head = Utils.buildListNode(1, 2);
        new _24_Swap_Nodes_in_Pairs().swapPairs(head);
    }
}
