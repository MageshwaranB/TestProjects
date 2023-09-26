package org.DataStructureConcepts;

import java.util.Random;

public class QuickSort {
    /*
    Quick Sort Algo
    1. Read the inputs
    2. Make random index as the pivot (in this case it is the last index)
    3. Check the values by comparing it with the pivot
        if it lesser than the pivot, move it to the left side of the pivot
        if it is greater than pivot, move it to the right side of the pivot
    4. Once partitioned the array, recursively repeat the step 2 and 3, until the array is sorted completely
     */
    public static void main(String[] args) {
        Random random=new Random();
        int[] arr=new int[10];
        for (int i=0;i<arr.length;i++){
            arr[i]=random.nextInt(100);
        }
        System.out.println("Before sorting: ");
        printArray(arr);

        quickSort(arr,0,arr.length-1);
        System.out.println("After sorting: ");
        printArray(arr);
    }

    private static void quickSort(int[] arr, int lowIndex, int highIndex) {
        /*
        Intially the low index and high index will be 0 and arr.length-1 and later it will be recursively changes
         */
        //Step 1: Choose the pivot
        //Step 2: Move the numbers lower than the pivot to the left side and greater to the right side
        //create two pointers, left pointer starts at the left most part of the array, and right pointer starts at the right most part of the array
        /*
        We will first check whether the left pointer value is less than the pivot, it is less, then the move the pointer to the next element
        if the left pointer value is greater than the pivot value, then we will move the right pointer to the left and
        if the right pointer value is lesser than the pivot value, then swap the right pointer value and left pointer value places, once swapped move the left pointer by one spot
        and repeat the process by moving the left pointer
        At some point, both the left and right pointer points to the same index, then we will swap the pivot and element. This is where the partition stops
         Once partitioned, we will recursively quick sort to the left side of the sub array and right side of the sub array
         */
        //at some point, the array will have only one index, aka it has sorted
        if (lowIndex>=highIndex){
            return;
        }
        int pivot=arr[highIndex];
        int leftPointer=lowIndex;
        int rightPointer=highIndex;
        while (leftPointer<rightPointer){//Looping to check whether both the pointer are matching
            //inner loop to check the left pointer value is less than pivot value and right pointer, move the pointer to the right, if satisfied
            while (arr[leftPointer]<=pivot&&leftPointer<rightPointer){
                leftPointer++;//Increment the left pointer so that the left pointer moves to the right one at a time
            }
            //inner loop to check the right pointer value is greater than pivot value and right pointer, move the pointer to the left, if satisfied
            while (arr[rightPointer]>=pivot&&rightPointer>leftPointer){
                rightPointer--;//decrement the right pointer so the right pointer moves to the right one at a time
            }
            //Implement the swap functionality that takes the array, and the two indexes to be swapped
            swap(arr,leftPointer,rightPointer);
        }
        //swap the pivot
        swap(arr,leftPointer,highIndex);
        //quick sort recursively on the left side
        quickSort(arr,lowIndex,leftPointer-1);
        //quick sort recursively on the right side
        quickSort(arr,leftPointer+1,highIndex);
    }
    private static void swap(int[] arr,int index1, int index2){
        int temp=arr[index1];
        arr[index1]=arr[index2];
        arr[index2]=temp;
    }

    private static void printArray(int[] arr){
        for (int i=0;i< arr.length;i++){
            System.out.println(arr[i]);
        }
    }
}
