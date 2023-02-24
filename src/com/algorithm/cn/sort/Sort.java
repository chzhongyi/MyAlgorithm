package com.algorithm.cn.sort;

public class Sort {

    public int[] quickSort(int[] arr, int start, int end){
        if(end <= start){
            return arr;
        }
        int key = start;
        int j = end;
        int x = arr[key];

        while(end > start){

            while(end > start && arr[end] >= x) {
                end--;
            }
            if(end > start){
                arr[start++] = arr[end];
            }
            while(end > start && arr[start] <= x){
                start++;
            }
            if(end > start){
                arr[end--] = arr[start];
            }
        }
        arr[start] = x;
        quickSort(arr,0,start-1);
        quickSort(arr,start+1,j);
        return arr;

    }
}
