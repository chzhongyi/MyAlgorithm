package com.algorithm.cn.sort;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Test {

    public static void main(String[] args){
        Sort s = new Sort();
        int[] aa = {6,8,9,3,1,0,3};
        System.out.println(Arrays.toString(s.quickSort(aa,0,aa.length-1)));

        List<?> list = new ArrayList<>();
        List<Object> list1 = new ArrayList<Object>();
        list.add(null);
        list1.add(new Sort());

    }
}
