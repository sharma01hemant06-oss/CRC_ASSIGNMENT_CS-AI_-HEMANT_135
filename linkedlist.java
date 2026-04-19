import java.util.*;
class LinkedListDemo{
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }
    static Node head=null;

    static void insert(int d){
        Node n=new Node(d);
        if(head==null) head=n;
        else{
            Node t=head;
            while(t.next!=null) t=t.next;
            t.next=n;
        }
    }

    static void delete(int key){
        Node t=head,prev=null;
        while(t!=null && t.data!=key){
            prev=t;
            t=t.next;
        }
        if(t==null) return;
        if(prev==null) head=head.next;
        else prev.next=t.next;
    }

    static void display(){
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        insert(1);
        insert(2);
        insert(3);
        delete(2);
        display();
    }
}
