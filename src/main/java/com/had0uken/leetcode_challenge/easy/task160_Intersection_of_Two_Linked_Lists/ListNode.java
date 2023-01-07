package com.had0uken.leetcode_challenge.easy.task160_Intersection_of_Two_Linked_Lists;

public class ListNode {
    int val;
    ListNode next;


    public ListNode(int val, ListNode next) {
        this.val = val;
        this.next = next;
    }

    ListNode(int x) {
          val = x;
          next = null;
    }

    @Override
    public String toString() {
        return "ListNode{" +
                "val=" + val +
                ", next=" + next +
                '}';
    }
}

