
class stack{
           char top = -1;
    char n;
 char[] arr;

    public stack(char n) {
        this.n = n;
        arr = new char[n];
    }
    
    public void push(char data) {
        if (top == n - 1) {
            System.out.println("(");
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
public class paranthesis {
   public static void main(String[] args) {
     stack data = new stack(5);
        data.push("(");
       
        data.display();
        System.out.println("--------remaining element of pop----------");
        data.pop();
        data.pop();
        data.display();
   }
}