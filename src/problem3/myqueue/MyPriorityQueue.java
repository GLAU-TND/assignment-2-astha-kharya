/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:15 PM
 */
package problem3.myqueue;

import problem3.Student.student;
import problem3.mylinkedlist.MyLinkedList;

public class MyPriorityQueue {
    MyLinkedList linkedList=new MyLinkedList();
    public void enqueue(student stu)
    {
        linkedList.addLast(stu);
    }
}
