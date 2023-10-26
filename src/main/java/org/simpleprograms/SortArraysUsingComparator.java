package org.simpleprograms;

import java.util.*;

public class SortArraysUsingComparator {
    public static void main(String[] args) {
        List<Integer> list=new ArrayList<>();
        list.add(15);
        list.add(34);
        list.add(3);
        list.add(100);
        list.add(4);
        System.out.println(list);
        Collections.sort(list, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o1-o2;
            }
        });
       // Arrays.sort(list);
    }
}
