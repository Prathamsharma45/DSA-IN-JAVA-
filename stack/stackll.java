public class stackll {
    static class Node {
        int data;
        Node next;
        Node(int d) { data = d; next = null; }
    }

    static class MyStack {
        private Node head;

        public void push(int data) {
             
            Node newNode = new Node(data);
            newNode.next = head;
            head = newNode;
        }

        public int pop() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            int top = head.data;
            head = head.next;
            return top;
        }

        public int peek() {
            if (head == null) {
                System.out.println("stack is empty");
                return -1;
            }
            return head.data;
        }

        public boolean isEmpty() {
            return head == null;
        }
    }

    public static void main(String[] args) {
        MyStack s = new MyStack();
        s.push(5);
        s.push(10);
        s.push(15);
        s.push(20);
        System.out.println("Top: " + s.peek());
        System.out.println("Popped: " + s.pop());
        System.out.println("Popped: " + s.pop());
        System.out.println("Empty? " + s.isEmpty());
    }
}
