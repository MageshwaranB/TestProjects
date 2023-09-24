package org.simpleprograms;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Palindrome {
    public static void main(String[] args) {
        var palindromeExamples=new Palindrome();
        System.out.println(palindromeExamples.numberPalindrome(1221));
        System.out.println(palindromeExamples.stringPalindrome("Radar"));
    }
    public String numberPalindrome(int number){
        int temp=number;
        int res=0;
        while(number!=0){
            int t=number%10;
            res=res*10+t;
            number=number/10;
        }
        number=temp;
        WebDriver driver =new ChromeDriver();
        return number == res ? "Palindrome" : "Not a Palindrome";
    }
    public String stringPalindrome(String word){
            String emptyString="";
            for(int i=word.length()-1;i>=0;i--){
                emptyString=word.charAt(i)+emptyString;
            }
            return emptyString.equals(word)?"Palindrome":"Not a palindrome";
        }
}
