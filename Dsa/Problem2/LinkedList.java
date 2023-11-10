package Dsa.Problem2;

public class LinkedList {
    private Node first;
    private Node last;

    //addFirst
    //addLast
    public void addLast(int elem){
        var node = new Node(elem);
        if(first == null){
            first = node;
            last = node;
        }else{
            last.setNext(node);
            last = node;
        }
    }
    //deleteFirst
    //deleteLast
    //contains
    //indexOf
}
