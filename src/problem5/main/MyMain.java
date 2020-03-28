/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:06 PM
 */
package problem5.main;

import problem5.circularqueue.MyCircularQueue;
import problem5.student.Student;

//executable class
public class MyMain {
    public static void main(String[] args) {
        MyCircularQueue myCircularQueue=new MyCircularQueue(3);
        myCircularQueue.enqueue(new Student("A",0,0));
        myCircularQueue.enqueue(new Student("S",1,1));
        myCircularQueue.enqueue(new Student("P",1,0));
        for(int i=0;i<myCircularQueue.getSize()+1;i++){
            Student st=myCircularQueue.dequeue();
            if(st.getBacklog()-st.getAppearingCount()!=0){
                myCircularQueue.enqueue(st);
            }
        }
        myCircularQueue.show();
    }
}
