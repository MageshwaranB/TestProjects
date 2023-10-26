package org.DataStructureConcepts;

public class DynamicArrayExecution {
    public static void main(String[] args) {
        DynamicArray dynamicArray=new DynamicArray();
        System.out.println(dynamicArray.getCapacity());
        for (int i = 0; i < 11; i++) {
            dynamicArray.add(i+10);
        }
        System.out.println(dynamicArray.get(6));
        System.out.println(dynamicArray.size());
        System.out.println(dynamicArray.getCapacity());
        System.out.println(dynamicArray.get(10));
        dynamicArray.removeLast();
        System.out.println(dynamicArray.size());
    }
}
