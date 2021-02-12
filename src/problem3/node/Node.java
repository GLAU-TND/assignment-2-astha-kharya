/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:13 PM
 */
package problem3.node;


import problem3.Student.student;

public class Node {
    private student data;
    private Node next;

    public Node(student data) {
        this.data = data;
        this.next = next;
    }

    public student getData() {
        return data;
    }

    public void setData(student data) {
        this.data = data;
    }

    public Node getNext() {
        return next;
    }

    public void setNext(Node next) {
        this.next = next;
    }
}
