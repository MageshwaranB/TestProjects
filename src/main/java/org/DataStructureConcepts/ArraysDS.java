package org.DataStructureConcepts;

import java.util.Arrays;
import java.util.Scanner;

public class ArraysDS {
    /*
    Advantages:
    Accessing an array using an index is faster, and it takes O(1) run time complexity, because the calculation of the memory
    address are very simple and it doesn't require any loops
    Limitation:
    Since array is static and doesn't change the size, and if we need to increase the size of an array we have to copy them
    and add them to a different array, this operation takes O(n) time complexity, since the size of the increase linearly.
    Removing an item: Let's say we have to remove an item in array, we have to iterate and move the items one step to left, it
    takes O(n)

    So in short
    Lookup or Accessing: O(1)
    Insert: O(n)
    Delete: O(n)
     */
   private int[] array;
    private int index;
    public ArraysDS(int size){
        array=new int[size];
        index=0;
    }
    public ArraysDS(){

    }
    public void insert(int value){
        //If the array is full, resize it
        if (array.length==index){
            //Create a new array twice the size of the existing one
            int[] newArray=new int[index*2];
            //copy the values from the old array to the new array
            for (int i=0;i<index;i++){
                newArray[i]=array[i];
            }
            //resize the old array with the new array size
            array=newArray;
        }
        //Add a new item at the end
        array[index]=value;
        index++;

    }
    public void print(){
        for (int i=0;i<index;i++){
            System.out.println(array[i]);
        }
    }
    private void removeAtIndex(int i) {
        //Validate the index
        if (i<0||i>=index){
            throw new IllegalArgumentException();
        }
        //To remove a value from an array, we have shift to the left of the array with a value from the right
        for (int j=i;j<index;j++){
            array[j]=array[j+1];
        }
        //To remove to zero values at the end of the array, we decrement the total value in the array and not the size
        index--;
    }
    private int searchTheElement(int value) {
       //Linear Search - O(n)
        for (int i=0;i<index;i++){
            if (array[i]==value){
                return i;
            }
        }
        //Binary Search: O(log n)
        return -1;
    }

    private static void print2DArray(int[][] arr){
        int rows=arr.length;
        int cols=arr[0].length;
        for (int i = 0; i < rows; i++) {
            for (int j=0;j<cols;j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    private static int getSum(int[] array){
        int sum=0;
        for (int value:array){
            sum=sum+value;
        }
        return sum;
    }

    public static void main(String[] args) {
        ArraysDS arraysDS=new ArraysDS(3);
        arraysDS.insert(2);
        arraysDS.insert(3);
        arraysDS.insert(5);
        arraysDS.insert(6);
        arraysDS.print();
        arraysDS.removeAtIndex(2);
        arraysDS.print();
        arraysDS.insert(8);
        System.out.println(arraysDS.searchTheElement(8));

        //2 Dimensional array
        int[][] arr={{1,3,5,100},{2,4,6,200},{1,3,6,10}};
        //to get the data from the two dimensional array, we will use deepToString method
        System.out.println(Arrays.deepToString(arr));
        print2DArray(arr);

        //Sorting the 2D array using inbuilt function
        Arrays.sort(arr,(int[] o1, int[] o2) -> (getSum(o1)-(getSum(o2)))); //based on the total sum of individual array
        System.out.println(Arrays.deepToString(arr));
        Arrays.sort(arr,(int[] o1,int[] o2)->o1[o1.length-1]-o2[o2.length-1]);//Based on the last element of each individual array
        System.out.println(Arrays.deepToString(arr));
        jaggedArrayExample();
    }

    private static void jaggedArrayExample(){
        //Jagged Array : with varying no of columns in a row
        System.out.println("Enter the total row");
        Scanner scanner=new Scanner(System.in);
        int row=scanner.nextInt();
        int[][] arr=new int[row][];

        for (int i=0;i<row;i++){
            System.out.println("Enter the cols to be present in row "+(1+i));
            int cols=scanner.nextInt();
            System.out.println("Enter the data in the current row");
            arr[i]=new int[cols];
            for (int j=0;j<cols;j++){
                arr[i][j]=scanner.nextInt();
            }
        }
        System.out.println(Arrays.deepToString(arr));
    }




}
