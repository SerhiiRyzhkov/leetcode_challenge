package com.had0uken.leetcode_challenge.easy.task160_Intersection_of_Two_Linked_Lists;

import junit.framework.TestCase;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.w3c.dom.NodeList;

import java.util.ArrayList;
import java.util.List;

public class Task160Test extends TestCase {


    private static Task160 task160 = null;
    private static ListNode a1= null;
    private static ListNode a2= null;
    private static ListNode a3= null;
    private static ListNode c1= null;
    private static ListNode c2= null;
    private static ListNode c3 = null;
    private static ListNode b1 = null;
    private static ListNode b2 = null;
    private static ListNode b3 = null;

    private static ListNode result;

    @BeforeAll
    public static void init(){
        task160 = new Task160();
        result = c1;
    }
    @AfterEach
    public  void destroy(){
        a1= null;
        a2= null;
        a3= null;
        c1= null;
        c2= null;
        c3 = null;
        b1 = null;
        b2 = null;
        b3 = null;
    }

    @Test
    public void test1tGetIntersectionNode() {
        c3=new ListNode(5,null);
        c2=new ListNode(4,c3);
        c1=new ListNode(8,c2);
        a2=new ListNode(1,c1);
        a1=new ListNode(4,a2);
        b3=new ListNode(1,c1);
        b2=new ListNode(6,b3);
        b1=new ListNode(5,b2);
        assertEquals(c1,task160.getIntersectionNode(a1,b1));
    }

    @Test
    public void test2tGetIntersectionNode() {
        c2=new ListNode(4,null);
        c1=new ListNode(2,c2);
        a3=new ListNode(1,c1);
        a2=new ListNode(9,a3);
        a1=new ListNode(1,a2);
        b1=new ListNode(3,c1);
        task160 = new Task160();
        assertEquals(c1,task160.getIntersectionNode(a1,b1));
    }

    @Test
    public void test3tGetIntersectionNode() {
        a3=new ListNode(4,null);
        a2=new ListNode(6,a3);
        a1=new ListNode(2,a2);
        b2=new ListNode(5,null);
        b1=new ListNode(1,b2);
        assertEquals(c1,task160.getIntersectionNode(a1,b1));
    }
}