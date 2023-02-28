package com.algorithm.cn.linktable;

public class SLList<T> {

    private T value;

    private SLList next;

    private SLList head,tail;

    private int size;

    public boolean isEmpty(){
        return head == null;
    }

    public int getSize(){
        return this.size;
    }

    /**
     * 1、需要重写泛型T的equals方法
     * */
    public boolean isSLList(T value){
        SLList tmp = null;
        for(tmp = head; tmp != null && tmp.value.equals(value); tmp = tmp.next);
        return tmp != null;
    }

    public void addToHead(T value){
        SLList node = new SLList();
        node.setValue(value);
        node.setNext(head);
        head = node;
    }

    public void addToTail(T value){
        SLList node = new SLList();
        node.setValue(value);
        if(head == null){
            head = node;
        }else{
            if(tail == null){
                tail = node;
                head.setNext(node);
            }else{
                tail.setNext(node);
                tail = node;
            }
        }

    }

    public SLList delFromHead(){
        return null;
    }
    public SLList delFromTail(){
        return null;
    }
    public void delete(T value){
        if(!isEmpty()){
            SLList tmp = null,preTmp = null;
            if(tail == null && head.value.equals(value)){
                head = null;
            }else{
                for(tmp = head; tmp != null && !tmp.value.equals(value); preTmp = tmp,tmp = tmp.next);
                if(tmp != null){
                    preTmp.next = tmp.next;
                }
            }
        }
    }

    public T getValue() {
        return value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public SLList getNext() {
        return next;
    }

    public void setNext(SLList next) {
        this.next = next;
    }




    public String toString(){
        StringBuilder sb = new StringBuilder("queue:");
        for(SLList tmp = head; tmp != null;tmp = tmp.next)
            sb.append(tmp.value+",");

        return sb.toString();
    }

    public static void main(String[] args){
        SLList slList = new SLList();

        for(int i = 0; i < 10; i++){
            slList.addToHead(i);
            slList.addToTail(i);
        }

        System.out.println(slList.toString());

    }
}
