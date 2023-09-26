package org.DataStructureConcepts;

public class Recursion {
    public static void main(String[] args) {
        int first=0,second=1;
        int third=first+second;
        int num=5;
        while (num>0){
            first=second;
            second=third;
            third=first+second;
            num--;
        }
        System.out.println(first);
        System.out.println(fibonacci(5));
    }

    private static int fibonacci(int num){
        if (num<=1){
            return num;
        }
        return fibonacci(num-1)+fibonacci(num-2);
    }
}
