package com.algorithm.cn.stack;

import java.util.Arrays;

public class Mystack {

    private static final int DEFAULT_SIZE = 16;

    private int[] elem;

    private int top;

    public Mystack(){
        elem = new int[DEFAULT_SIZE];
    }
    public int push(int data){
        if(top == elem.length){
            this.elem = Arrays.copyOf(elem,elem.length*2);
        }
        elem[top] = data;
        top++;
        return data;
    }
    public int pop(){
        if(empty()){
            throw new NullStackException("空栈");
        }
        return elem[--top];
    }
    public int peek(){
        if(empty()){
            throw new NullStackException("空栈");
        }
        return elem[top - 1];
    }

    public int size(){
        return top;
    }
    public boolean empty(){
        return top == 0;
    }
}
