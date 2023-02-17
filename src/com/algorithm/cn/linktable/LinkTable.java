package com.algorithm.cn.linktable;

public class LinkTable {

    public ListNode reverListNode(ListNode head){
        ListNode lastNode = null;
        while(head != null){
            ListNode nextNode = head.next;
            head.next = lastNode;
            if(nextNode == null){
                lastNode = head;
                break;
            }
            lastNode = nextNode;
            ListNode next2Node = nextNode.next;
            nextNode.next = head;
            head = next2Node;

        }
        return lastNode;
    }


}
