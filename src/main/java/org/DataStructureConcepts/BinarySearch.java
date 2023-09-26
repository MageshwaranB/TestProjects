package org.DataStructureConcepts;

public class BinarySearch {
    //In Binary Search
    /*
    1. The array should be in sorted order
    2. We will split the array into two halves
    3. Use the middle value to check if the value to be search is greater or lesser
    4. If its lesser, then the element must be present on the left hand side from middle point
    5. If its greater, then the element must be present on the right hand side
    Time complexity: O(log n)
     */

    public static void main(String[] args) {
        int[] arr={1,2,4,5,6,8,9};
        int element=10;
        System.out.println("Element is found at index: "+binarySearchAlgo(arr,element)+" and it took "+System.currentTimeMillis());
        System.out.println("Element is found at index: "+linearSearch(arr,element)+" and it took "+System.currentTimeMillis());
    }

    private static int binarySearchAlgo(int[] arr, int element) {
        int start=0;
        int last=arr.length-1;
        while (start<=last){
            int middle=(last-start)/2+start;
            if (arr[middle]==element)
                return middle;
            if (arr[middle]<element)
                start=middle+1;
            if (arr[middle]>element)
                last=middle-1;
        }
        return -1;
    }
    private static int linearSearch(int[] arr, int element){
        for (int i=0;i< arr.length;i++){
            if (arr[i]==element){
                return i;
            }
        }
        return -1;
    }
}
