package org.simpleprograms;

public class NumberProgramming {
    public static void main(String[] args) {
        var numberProgramming=new NumberProgramming();
        System.out.println(numberProgramming.perfectNumber(9));
        System.out.println(numberProgramming.primeNumber(7));
        numberProgramming.factorial(5);
        System.out.println(numberProgramming.fibonaciSeries(10));
    }
    public boolean perfectNumber(int number){
        int sum=0,i =0;
        while(number/2>i){
            i++;
            if(number%i==0){
                sum=sum+i;
            }
        }
        return number==sum;
    }
    public boolean primeNumber(int number) {
        int primeNumber = 2;
        while (primeNumber<=number/2) {
            if (number % primeNumber == 0) {
                break;
            }
            primeNumber++;
        }
        return primeNumber > number / 2;
    }
    public void factorial(int num){
        if(num!=0){
            int fact=1;
            while (num>0){
                fact=fact*num;
                num--;
            }
            System.out.println(fact);
        }
        else{
            int fact=1;
            System.out.println(fact);
        }
    }
    public int fibonaciSeries(int numberLimit){
        int first=0,second=1;
        int third=first+second;
        while (numberLimit>0){
            first=second;
            second=third;
            third=first+second;
            numberLimit--;
        }
        return first;
    }

}
