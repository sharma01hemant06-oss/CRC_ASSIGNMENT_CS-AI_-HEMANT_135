class DoublyLL{
    static class Node{
        int data;
        Node prev,next;
        Node(int d){data=d;}
    }
    public static void main(String[] args){
        Node head=new Node(1);
        Node n2=new Node(2);
        head.next=n2;
        n2.prev=head;
        Node t=head;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }
}
