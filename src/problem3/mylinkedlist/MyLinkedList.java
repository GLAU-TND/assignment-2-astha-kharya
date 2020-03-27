package problem3.mylinkedlist;

import problem3.Student.student;
import problem3.node.Node;


public class MyLinkedList {
    private Node first;
    private Node last;
    public void addLast(student stu){
        Node node=new Node(stu);
        if(first==null){
            first=last=node;
            return;
        }
        last.setNext(node);
        last=node;
        var current=first;
        while(current!=null)
        {
            if(node.getData().getRollno()<current.getData().getRollno()){
                var temp=node.getData();
                node.setData(current.getData());
                node.setData(current.getData());
                current.setData(temp);
            }
            current=current.getNext();
        }
    }
    public void deleteFirst(){
        if(first==null){
            first=last=null;
            return;
        }
        var second=first.getNext();
        first.setNext(null);
        first=second;
    }
}
