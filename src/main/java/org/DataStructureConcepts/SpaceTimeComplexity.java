package org.DataStructureConcepts;

public class SpaceTimeComplexity {
    /*
        We use the big O to describe the performance of an algorithm and how scalable it is when
        large set of inputs added i.e. even though the code works it doesn't mean it will perform when
        huge set of data are been used
     */
    public static void main(String[] args) {

    }
    public void log(int[] numbers){
        //O(1): Represents the constant time since the size of the input doesn't matter
        /*
            In the below code snippet, we have created a method which takes in integer array as argument
            and we're always printing the numbers[0] meaning the first index of the array is always get accessed and printed
            so it doesn't matter if we use the same line over and over again, since it is a single operation and takes constant amount of
            time to run, it is O(1) .
         */
        System.out.println(numbers[0]);
        //O(n): Linear growth in time with relation to the size
        /*
        In the below code snippet, we have a simple for loop which iterates over the entire array and prints them in the console.
            size of the input used matters, consider the input of array is 1 million, since it is in a for loop it will get printed a million
             time, in such scenarios, we can observe cost of the algorithm grows linearly with size of the input, the run time
             complexity would be O(n)
             Let assume we have another similar for loop in the method, if we add them O(n+n), we would get O(2n), we usually
             drop the constant at the start, because if we have a 1 million inputs, adding just two operation doesn't impact the
             cost of the algorithm but what matters whether the cost of the algorithm linear in proportion to the input size
             Real time example will be a Linear search
         */
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]); //O(n)
        }
        for (int i=0;i<numbers.length;i++){
            System.out.println(numbers[i]); //O(n)
        }

        //O(n^2): Runs in quadratic time meaning it gets slower and slower as the inputs grows larger and larger
        /*
            In the below code snippet, we have used a nested for each loop, we are using to print all possible combination
            of inputs, so the run time complexity will be O(n*n) or O(n^2). As the algorithm running with O(n^2), will get
            slower and slower as more input and more inputs have been used
         */
        for (int first:numbers) //O(n)
            for (int second: numbers)  //O(n)
                System.out.println(first+" "+second);

        //o(log n): it starts off growing but at some point in time, it stops growing and plateaued. This is more efficient and
        //scalable for algorithm compared to O(n) and O(n^2)
        /*
        Real time example would be binary search
         */

        //O(2^n): This is an opposite of logarithm growth, unlike logarithm, it grows exponential as more input been used
        //This sort of algorithms are not scalable and will become slower at some point

    }
    private void greet(String[] names){
        //O(x): How much space an algorithm requires
        /*
            Usually there will be trade off between space and time, If there's more space we can try to optimise the
            algorithm to make it for scalable, but sometimes we may have limited space, then scalability and optimization
            is not a factor
         */

        /*
        If you look at the below code snippet, the variable (i) is independent of the size of the input (names), so this
        method (greet) will only allocate some memory for the variable (i), so the space complexity will be O(1)
         */
        for (int i=0;i<names.length;i++){
            System.out.println("Hi "+names[i]);
        }
        /*
        In the below example, we have the variable (anotherString) has the same size as the input, if the input size is a thousand,
        then the variable size will also be thousand, this space complexity is O(n)
         */
        String anotherString[]=new String[names.length];
    }
}
