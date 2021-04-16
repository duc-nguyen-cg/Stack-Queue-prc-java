import com.sun.corba.se.spi.orbutil.threadpool.NoSuchWorkQueueException;

public class Solution {
    private class Node {
        public int data;
        public Node link;

    }

    class Queue {
        public Node front;
        public Node rear;

        Queue(){ front = rear = null; }
    }

    public void enqueue(Queue q, int data){
        Node temp = new Node();
        temp.data = data;
        if (q.front == null){
            q.front = q.rear = temp;
        } else {
            q.rear.link = temp;
        }
        q.rear = temp;
        q.rear.link = q.front;
    }


    public int dequeue(Queue q){
        //if empty
        if (q.front == null){
            System.out.println("Queue is empty!");
            return Integer.MIN_VALUE;
        }
        int holder = q.front.data;
        //delete last node in the queue
        if (q.front == q.rear){
            q.front = q.rear = null;
            //there are more than one node
        } else {
            q.front = q.front.link;
            q.rear.link = q.front;
        }
        return holder;
    }

    public void displayQueue(Queue q){
        Node temp = q.front;
        System.out.print("Queue = ");
        while( temp.link != q.front){
            System.out.print(temp.data + "\t");
            temp = temp.link;
        }
        System.out.print(temp.data+"\n");
    }

    public void test() {
        Queue q = new Queue();

        enqueue(q, 1);
        enqueue(q, 2);
        enqueue(q, 3);
        displayQueue(q);

        System.out.println("Delete value = "+dequeue(q));
        System.out.println("Delete value = "+dequeue(q));
        displayQueue(q);

        enqueue(q, 9);
        enqueue(q, 20);
        displayQueue(q);
    }
}
