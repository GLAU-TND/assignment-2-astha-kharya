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
    private boolean isEmpty(){
        return size==0;
    };

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
    public Student dequeue(){
        Student response= null;
        if(!isEmpty()){
            size--;
            response=circularQueue[beginning];
            beginning=(beginning+1)%maxSize;
            return response;
        }
        else {
            return response;
        }
    }
    public void show() {
        for (int i = 0; i < size; i++) {
            System.out.println(circularQueue[(i + beginning) % maxSize]);
        }
    }


}
