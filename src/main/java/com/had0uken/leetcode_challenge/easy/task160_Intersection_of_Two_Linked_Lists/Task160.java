package com.had0uken.leetcode_challenge.easy.task160_Intersection_of_Two_Linked_Lists;

//https://leetcode.com/problems/intersection-of-two-linked-lists/
public class Task160 {
    public static void main(String[] args) {

    }

    public ListNode getIntersectionNode(ListNode headA, ListNode headB) {
        ListNode tempA = headA;
        ListNode tempB = headB;
        while (tempA!=null){
             while (tempB!=null)
            {
                if(tempA==tempB)return tempA;
                tempB=tempB.next;
            }
            tempA=tempA.next;
            tempB=headB;
        }
        return null;
    }
}
