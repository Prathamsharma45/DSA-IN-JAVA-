class stack {
    int top = -1;
    int n;
    int[] arr;

    public stack(int n) {
        this.n = n;
        arr = new int[n];
    }

    public void push(int data) {
        if (top == n - 1) {
            System.out.println("stack overflow ");
        } else {
            arr[++top] = data;
        }
    }

    public void pop() {
        if (top == -1) {
            System.out.println("data is not there ");
        } else {
            top--;
        }
    }

    public void display() {
        int t = top;
        while (t != -1) {
            System.out.println(arr[t]);
            t--;
        }
    }
}

public class index {
    public static void main(String[] args) {
        stack data = new stack(5);
        data.push(10);
        data.push(20);
        data.push(30);
        data.push(40);
        data.display();
        System.out.println("--------remaining element of pop----------");
        data.pop();
        data.pop();
        data.display();
    }
}