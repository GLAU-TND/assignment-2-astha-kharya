package problem4.LinkedList;

public class Node {
    private int data;
    private Node Next;

    public Node(int data) {
        this.data = data;
        this.Next=Next;
    }

    public int getData() {
        return data;
    }

    public void setData(int data) {
        this.data = data;
    }

    public Node getNext() {
        return Next;
    }

    public void setNext(Node Next){
           this.Next=Next;
    }
}
