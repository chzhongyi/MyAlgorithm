package com.algorithm.cn.queue;
/**
 * 1、使用链表实现队列
 * 2、队列的增删改查
 * */
public class QueueWithLink {

    private int size;

    private ListNode head;

    private ListNode tail;


    public void offer(int data){
        ListNode node = new ListNode(data);
        if(head == null){
            head = node;
            tail = node;
            size++;
            return;
        }
        tail.next = node;
        tail = node;
        size++;
        return;
    }
    public int poll(){
        if(empty()){
            throw new NullPointerException("栈为空");
        }
        if(head.next == null){
            int tmp = head.value;
            head = null;
            tail = null;
            size = 0;
            return tmp;
        }
        int temp = head.value;
        head = head.next;
        size--;
        return temp;
    }
    public int size(){
        return this.size;
    }
    public boolean empty(){
        return this.size == 0;
    }

    static class ListNode{
        int value;
        ListNode next;
        public ListNode(int value){
            this.value = value;
        }
    }
}
