package org.simpleprograms;

import java.util.ArrayList;

public class Test {
    public static void main(String[] args) {
        // if value%3==0, include arr[0], for first tile, exclude first value and take other two, second tile include first value and exclude third value and so on
        // else exclude arr[0] and arr[arr.length], for first tile, exclude first value and take other two, second tile include first value and exclude third value and so on
        int a = 9;
        System.out.println(a / 3);
        int totalTile = 3;
        //int arr[] = {2, 3, 5, 2, 3, 4, 6, 4, 1, 6};
        int arr[]={5,3,2,6,6,10,7,2,1};
        var tile1 = new ArrayList<Integer>(2);
        var tile2 = new ArrayList<Integer>(2);
        var tile3 = new ArrayList<Integer>(2);
        int A[];
        int set = 2;
        if (arr.length % 3 == 0) {
            int i = 1;
            while (set > 0) {
                tile1.add(arr[i]);
                i++;
                set--;
            }
            set = set + 2;
            i = ++i;
            while (set > 0) {
                tile2.add(arr[i]);
                i++;
                set--;
            }
            set = set + 2;
            while (set > 0) {
                tile3.add(arr[i]);
                i++;
                set--;
            }
        } else {
            int i = 1;
            while (set > 0) {
                tile1.add(arr[i]);
                i++;
                set--;
            }
            set = set + 2;
            i = ++i+1;
            while (set > 0) {
                tile2.add(arr[i]);
                i++;
                set--;
            }
            set = set + 2;
            while (set > 0) {
                tile3.add(arr[i]);
                i++;
                set--;

            }
        }
        System.out.println("tile1:"+tile1);
        System.out.println("tile2:"+tile2);
        System.out.println("tile3:"+tile3);
        var bigArrayList = new ArrayList<Integer>();
        bigArrayList.addAll(tile1);
        bigArrayList.addAll(tile2);
        bigArrayList.addAll(tile3);
        int sum = 0;
        for (Integer integer : bigArrayList) {
            sum = sum + integer;
        }
        System.out.println(sum);
    }

}
