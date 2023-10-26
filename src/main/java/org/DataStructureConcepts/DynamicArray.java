package org.DataStructureConcepts;

public class DynamicArray {
    /*
    In order to create something like arraylist where the array grows in size,
    we need to know
        a. what is the current size of the array
        b. what is the capacity
    And things like default capacity
     */
    private int[] arr;
    private int capacity;
    private int currentSize;
    private static final int DEFAULT=10;

    //We should have two constructors, one with a default capacity and another one with user defined capacity

    public DynamicArray(){
        arr=new int[DEFAULT];
        capacity=DEFAULT;
        currentSize=0;
    }

    public DynamicArray(int arrayCapacity){
        arr=new int[arrayCapacity];
        capacity=arrayCapacity;
        currentSize=0;
    }

    public void add(int data){

        //If the current size of the array exceeds the initial capacity, then we have to double the capacity
        if (currentSize==capacity){
            int[] oldArr=arr;
            arr=new int[2*capacity];
            for (int i=0;i<capacity;i++){
                arr[i]=oldArr[i];
            }
            oldArr=null; //setting the oldArr to null, so that we are removing the connection with the array data and also for garbage collector
            capacity=2*capacity;
        }
        arr[currentSize]=data;
        currentSize++;
    }

    public void removeLast(){
        if (arr.length==0){
            throw new ArrayIndexOutOfBoundsException();
        }
        currentSize--; //reducing the size by one
    }
    public int get(int i){
        return arr[i];
    }
    public int getCapacity(){
        return capacity;
    }
    public int size(){
        return currentSize;
    }
}


