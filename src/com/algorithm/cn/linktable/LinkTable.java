package com.algorithm.cn.linktable;

public class LinkTable {

    /**
     * 链表反转
     * */
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

    /**
     * 链表一定范围内反转
     * */
     public ListNode rangeRverseListNode(ListNode head,int left,int right){
         if(left > right || left <= 0 ){
             System.err.println("error");
             return null;
         }
         int i=0;
         ListNode firstNode = head;
         ListNode leftNode = null;
         ListNode rightNode = null;
         ListNode lastNode = null;
         ListNode nextNode = null;
         while(head != null){
             i++;
             if(i == left){
                 leftNode = head;
             }
             if(i< left){
                 lastNode = head;
             }
             if(i == right){
                 rightNode = head;
                 nextNode = head.next;
                 break;
             }
             head = head.next;
         }
         if(i < right){
             System.err.println("error");
             return null;
         }
         rightNode.next = null;
         reverListNode(leftNode);
         if(lastNode == null){
             leftNode.next = nextNode;
             return rightNode;
         }
         lastNode.next = rightNode;
         leftNode.next = nextNode;
         return firstNode;
     }

     /**
      * 单项链表中倒数第K个节点
      * 1、链表反转，求第K个需要O(n)的空间，改变了链表结构
      * 2、遍历找出长度，再次遍历长度-K
      * 3、转为数组，直接取值
      * */
     public ListNode theKth(ListNode head){
         ListNode k = null;
         while(head != null){

         }

         return k;
     }

     /**
      * 从单向链表中删除指定值的节点
      * 1、O(1)空间
      * **/
     public ListNode delValue(ListNode head,int value){
         ListNode listNode = null;
         while(head != null){

         }
         return head;
     }

     /**
      * 两数相加
      * */
     public ListNode add(ListNode l1, ListNode l2){
         ListNode head = null;
         ListNode lastNode = null;
         int carry=0;
         while(l1 != null || l2 != null){
             Integer tmp1 = l1 == null?0:l1.val;
             Integer tmp2 = l2 == null?0:l2.val;
            carry = (tmp1 + tmp2 + carry)/10;
            ListNode tmp = new ListNode((tmp1 + tmp2 + carry)%10);
            if(head == null){
                head = tmp;
            }else {
                lastNode.next = tmp;
            }
             lastNode = tmp;
            if(l1 != null)l1=l1.next;
            if(l2 != null)l2 =l2.next;
         }
         return head;
     }




}
