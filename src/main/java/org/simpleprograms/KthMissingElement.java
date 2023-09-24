package org.simpleprograms;

import java.util.Arrays;

public class KthMissingElement {
    public static void main(String[] args) {
        int arr[]={-1,3,0,2,4,6,8}; //missing array[1,4,5,6,7]
        Arrays.sort(arr);
        int k=5;
        int[] anotherArray=new int[5];
//        int minValue=0;
        for (int l=0;l<arr.length;l++){
            System.out.println("index "+l+": "+arr[l]);
        }
        int test=-1;
        System.out.println(++test);
        int firstVal=0;
        if (arr[0]>0){
            firstVal=--arr[0];
        }
        else {
            firstVal=arr[0];
        }
        anotherArray[0]=firstVal;
        boolean isElementFound=false;
        for (int i=0;i< arr.length;i++){
           for (int j=i;j<k;j++){
               if (arr[i]==arr[j]){
                   anotherArray[i]=firstVal+1;
                   isElementFound=true;
               }
               else {
                   anotherArray[i]=arr[i]+1;
               }
           }
        }
        if (isElementFound!=true){
            firstVal=-1;
        }
//        int nextValue=arr[0];
//        boolean atleastOneMatchingElement=false;
//        //System.out.println(nextValue);
//        int anotherArray[]=new int[k];
//        for (int i=0;i<arr.length;i++){
//            if (arr[i]==nextValue){
//                    anotherArray[i]=nextValue+1;
//                    atleastOneMatchingElement=true;
//            }
//            else{
//                anotherArray[i]=arr[i]+1;
//            }
//            //minValue++;
//        }
//        if (atleastOneMatchingElement!=true){
//            minValue=-1;
//        }
//        System.out.println();
//        for(int j=0;j<anotherArray.length;j++){
//            System.out.println(anotherArray[j]);
//        }

    }
}
