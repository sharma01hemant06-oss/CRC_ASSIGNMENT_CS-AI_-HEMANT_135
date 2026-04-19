class QueueArray{
    int front=0,rear=-1;
    int a[]=new int[5];

    void enqueue(int x){
        if(rear<4) a[++rear]=x;
    }
    void dequeue(){
        if(front<=rear) front++;
    }
    void display(){
        for(int i=front;i<=rear;i++)
            System.out.print(a[i]+" ");
    }

    public static void main(String[] args){
        QueueArray q=new QueueArray();
        q.enqueue(1); q.enqueue(2); q.enqueue(3);
        q.dequeue();
        q.display();
    }
}
