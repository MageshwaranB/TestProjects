package org.DataStructureConcepts;

import java.util.NoSuchElementException;

public class LinkedListDS {
    public class Node {
        private int value;
        private Node next;

        public Node(int value){
            this.value=value;
        }
    }
    private Node first;
    private Node last;
    private void addFirst(int item) {
        Node node=new Node(item);
        if (isEmpty()){
            first=node;
            last=node;
        }
        else {
            first.next=node;
            first=node;
        }
    }
    private void addLast(int item){
        Node node=new Node(item);
        //If the node is empty, point the first and last node to the same value
        if (isEmpty()){
            first=node;
            last=node;
        }
        //list has at least one node
        else {
            last.next=node; //adding the new node after the last node
            last=node;//pointing the last node to the new node
        }
    }
    private boolean isEmpty(){
        return first==null;
    }
    public int indexOf(int item){
        /*
        Unlike array, in linked list, we don't have index. So lets declare a index as 0
        create a node and assign the first node
        write a while loop until the current is not equal to null
            check if the current value is equal item
                return the index of the item
            increment the index
            reassign the current to next node
        if the item doesn't exist in the linked list return -1
         */
        int index=0;
        var current=first;
        while (current!=null){
            if (current.value==item) {
                return index;
            }
            current=current.next;
            index++;
        }
        return -1;
    }
    public boolean contains(int item){
        return indexOf(item)!=-1;
    }
    public void removeFirst(){
        /*
        Let assume a linked list [10->20->30], if we want to remove the first value 10, we also have to remove the link, so that
        the java's garbage collector will remove the value
        but if we remove the link the second, it will not have reference anymore
         */
        /*
        if we try to remove something from an empty list, we have to throw an exception
         */
        if (isEmpty()){
            throw new NoSuchElementException();
        }
        /*
        There's another scenario where the list has only one element, then we have to remove it
         */
        if (first==last){
            first=null;
            last=null;
            return;
        }
        var second=first.next; //second is now pointing to 20
        //removing the link since we have stored the second to the variable
        first.next=null;
        first=second; //Updating the first node with the second value
    }
    public void removeLast(){
        /*
        Unlike removeFirst, in order to remove the last node, we first have to find out the previous node
        [10->20->30]
        previous->20
        last->20
         */
        /*
        if we try to remove something from an empty list, we have to throw an exception
         */
        if (isEmpty()){
            throw new NoSuchElementException();
        }
          /*
        There's another scenario where the list has only one element, then we have to remove it
         */
        if (first==last){
            first=null;
            last=null;
            return;
        }
        var previous=getPrevious(last);
        last=previous;
        last.next=null;
    }
    private Node getPrevious(Node node){
        /*
        In this method, we first set the current node to the first node, and we are iterating over the list as long as
        the list is not empty,
        if we find the node, then return node
         */
        var current=first;
        while (current!=null){
            if (current==node)
                return current;
            current=current.next;
        }
        return null;
    }

    public static void main(String[] args) {
        LinkedListDS linkedListDS=new LinkedListDS();
        linkedListDS.addLast(6);
        linkedListDS.addLast(5);
        linkedListDS.addLast(3);
        int i = linkedListDS.indexOf(3);
        System.out.println(i);
        System.out.println(linkedListDS.indexOf(10));
        System.out.println(linkedListDS.contains(5));
        linkedListDS.removeFirst();
    }


}
