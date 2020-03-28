/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:11 PM
 */
package problem4.myqueue;
// to create queue to store pre - order successor

import problem4.LinkedList.MyLinkedList;

public class MyQueue {
    MyLinkedList myLinkedList=new MyLinkedList();
    public int peek(int data){
        if(myLinkedList.search(data)==null){
            return -1;
        }
        return myLinkedList.search(data).getData();
    }
    public void enqueue(int data){
        myLinkedList.addLast(data);
    }
    public void dequeue(){
        myLinkedList.deleteFirst();
    }
    public void show(){
        myLinkedList.display();
    }

}
