package com.company;

import org.w3c.dom.ls.LSException;

import java.util.List;

public class Main {
//如何反转链表
    public static void main(String[] args) {
	// write your code here
        ListNode head=new ListNode(1);
        head.next=new ListNode(2);
        head.next.next=new ListNode(3);
        ListNode p=reverseListNode(head);
        while(p.next!=null){
            System.out.println(p.val);
            p=p.next;
        }
        System.out.println(p.val);
    }
    public static ListNode reverseList(ListNode head){
        ListNode prev=null;
        ListNode curr=head;
        while(curr!=null){
            ListNode temp=curr.next;
            curr.next=prev;
            prev=curr;
            curr=temp;
        }
        return prev;
    }
    public static ListNode reverseListNode(ListNode head){
        if(head==null||head.next==null)
            return head;
        ListNode p=reverseListNode(head.next);
        head.next.next=head;
        head.next=null;
        return p;
    }
}
