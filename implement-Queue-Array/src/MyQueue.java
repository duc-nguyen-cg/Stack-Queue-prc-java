public class MyQueue {
    private int capacity;
    private int[] queueArr;
    private int head = 0;
    private int tail = -1;
    private int currentSize = 0;

    public MyQueue(int queueSize){
        capacity = queueSize;
        queueArr = new int[capacity];
    }

    public boolean isQueueFull(){
        if (currentSize == capacity){
            return true;
        }
        return false;
    }

    public boolean isQueueEmpty(){
        if (currentSize == 0){
            return true;
        }
        return false;
    }

    //add to tail
    public void enqueue(int item){
        if (isQueueFull()){
            System.out.println("Queue overflow! ");
        } else {
            tail++;
            if (tail == capacity - 1){
                tail = 0;
            }
            queueArr[tail] = item;
            currentSize++;
            System.out.println("Element " + item + " is pushed to Queue !");
        }
    }

    //remove head
    public void dequeue(){
        if (isQueueEmpty()){
            System.out.println("Queue underflow! ");
        } else {
            head++;
            if (head == capacity - 1) {
                System.out.println("Removed " + queueArr[head - 1]);
                head = 0;
            } else {
                System.out.println("Removed " + queueArr[head - 1]);
            }
        }
        currentSize--;
    }
}
