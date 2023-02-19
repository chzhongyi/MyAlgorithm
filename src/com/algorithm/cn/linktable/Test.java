package com.algorithm.cn.linktable;

public class Test {

    private static final LinkTable linkTable = new LinkTable();

    public static void main(String[] args){
        testReverse();
    }

    public static void testReverse(){
        ListNode head = new ListNode(1);
        ListNode temp = head;
        for(int i = 2; i < 6; i++){
            temp.next = new ListNode(i);
            temp = temp.next;
        }
        temp = head;
        while(temp != null){
            System.out.print(temp.val);
            System.out.print(",");
            temp = temp.next;
        }
        System.out.println("");
        head = linkTable.rangeRverseListNode(head,1,3);
        temp = head;
        while(temp != null){
            System.out.print(temp.val);
            System.out.print(",");
            temp = temp.next;
        }
    }
}
