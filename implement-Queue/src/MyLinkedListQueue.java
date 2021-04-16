public class MyLinkedListQueue<T> {
    private Node head;
    private Node tail;

    private class Node{
        public T key;
        public Node next;

        public Node(T key){
            this.key = key;
        }

        public String toString(){
            return "" + key;
        }
    }

    MyLinkedListQueue(){
        head = tail = null;
    }

    public void enqueue(T key){
        Node temp = new Node(key);
        if (tail == null){  //if there is no elements
            head = tail = temp;
            return;
        }
        tail.next = temp;
        tail = temp;
    }

    public Node dequeue(){
        if (head == null){
            return null;
        }
        Node temp = head;
        head = head.next;
        if (head == null) {
            tail = null;
        }
        return temp;
    }
}
