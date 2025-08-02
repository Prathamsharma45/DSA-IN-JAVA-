 class Queue {
  
    int front, rear, size;
    int[] arr;

    Queue(int size) {
        this.size = size;
        arr = new int[size];
        front = 0;
        rear = -1;
    }

    public void enqueue(int data) {
        if (rear == size - 1) {
            System.out.println("Queue is full (overflow)");
        } else {
            arr[++rear] = data;
            System.out.println("Enqueued: " + data);
        }
    }

    public void dequeue() {
        if (front > rear) {
            System.out.println("Queue is empty (underflow)");
        } else {
            System.out.println("Dequeued: " + arr[front++]);
        }
    }

    public void display() {
        if (front > rear) {
            System.out.println("Queue is empty");
        } else {
            System.out.print("Queue elements: ");
            for (int i = front; i <= rear; i++) {
                System.out.print(arr[i] + " ");
            }
            System.out.println();
        }
    }
}


public class Queue1 {
    public static void main(String[] args) {
        Queue d = new Queue(5);
        d.enqueue(56);
        d.enqueue(45);
        d.enqueue(69);
        d.enqueue(96);
        d.dequeue();
        d.display();
    }
}


