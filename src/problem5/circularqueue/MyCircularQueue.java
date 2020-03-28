/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.circularqueue;

import problem5.student.Student;

//to implement circular queue
public class MyCircularQueue {
    private int size;
    private int beginning;
    private int top;
    private int maxSize;
    private Student[] circularQueue;
    private boolean isFull(){
        return size==maxSize;
    }

    public MyCircularQueue(int maxSize){
        this.maxSize=maxSize;
        circularQueue=new Student[maxSize];
        this.beginning=0;
        this.top=0;
        this.size=0;
    }
    public void enqueue(Student element){
        if(!isFull()){
            circularQueue[top]=element;
            top=(top+1)%maxSize;
            size++;
        }
        else{
            System.out.println("Queue is full.");
        }
    }

}
