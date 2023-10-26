package org.simpleprograms;

public class SumCombinationOfMissingNumber {
    public static void main(String[] args) {
        int[] inputArr={4,3,5,2,6,11};
        int foundNum=6;//6

        for (int i=0;i<inputArr.length;i++){
            for(int j=i+1;j<inputArr.length;j++){
                if(inputArr[i]+inputArr[j]==foundNum){
                    System.out.println("Resultant is found by adding "+inputArr[i] +" " +inputArr[j]+ " "+foundNum);//printed
                }
                else if (inputArr[i]==foundNum){
                    System.out.println("Resultant is found without adding two inputs "+inputArr[i]);
                }
            }
        }
    }
}
