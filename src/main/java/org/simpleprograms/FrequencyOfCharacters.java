package org.simpleprograms;

import java.util.LinkedList;
import java.util.List;

public class FrequencyOfCharacters {
    public static void main(String[] args) {
        int[] input={0,2,4,1,5,0,1,2,2,2};
        int frequencyCount=1;
        List<Integer> list=new LinkedList<>();
        for (int i=0;i<input.length;i++){
            for (int j=i+1;j<input.length;j++){
                if (input[i]==input[j]&&!list.contains(input[i])){
                    frequencyCount++;
                }
            }
           if (frequencyCount>0){
               list.add(input[i]);
               System.out.println(input[i]+" occurred "+ frequencyCount+" times");
           }
            frequencyCount=0;
        }
    }
}
