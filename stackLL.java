class StackLL{
    static class Node{
        int data;
        Node next;
        Node(int d){data=d;}
    }
    Node top=null;

    void push(int x){
        Node n=new Node(x);
        n.next=top;
        top=n;
    }
    void pop(){
        if(top!=null) top=top.next;
    }
    void display(){
        Node t=top;
        while(t!=null){
            System.out.print(t.data+" ");
            t=t.next;
        }
    }

    public static void main(String[] args){
        StackLL s=new StackLL();
        s.push(1); s.push(2); s.push(3);
        s.pop();
        s.display();
    }
}
