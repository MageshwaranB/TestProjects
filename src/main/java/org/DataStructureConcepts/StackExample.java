package org.DataStructureConcepts;

import java.util.Stack;

public class StackExample {
    public static void main(String[] args) {
        /*
        Stack -LIFO - Last In First Out
        stores object one above the other like a tower
        Push -> To add the objects to the top
        Pull -> To remove from the top
         */

        Stack<String> games=new Stack<>();
        //We use push to add the element into the stack
        games.push("GOW");
        games.push("Cyberpunk2077");
        games.push("RDR2");
        games.push("Judgement");
        games.push("Spiderman");

        System.out.println(games);

        //To check the topmost element, we use peek
        System.out.println(games.peek());

        //To remove the element, we will use pop method
        var poppedElement=games.pop();//will remove the topmost element
        System.out.println(poppedElement);
        System.out.println(games);

        //To search an object whether it is present in the stack, we use search, it is unable to find the element, it will return -1
        System.out.println(games.search("RDR2"));

        //Use of stack
        //1. Undo/Redo features in text editors
        //2. Moving back/forward in browser
        //3. Backtracking algorithms(maze, file directories)
        //4. calling functions (call stack)

    }
}
