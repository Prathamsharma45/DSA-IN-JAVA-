import java.util.Queue;
import java.util.LinkedList;


class Node {
    int data;
    Node left, right;

    public Node(int data) {
        this.data = data;
        this.left = null;
        this.right = null;
    }
}

class Built {
    static int id = -1;

    public static Node buildNewNode(int[] arr) {
        id++;
        if (id >= arr.length || arr[id] == -1) {
            return null;
        }
        Node newNode = new Node(arr[id]);
        newNode.left = buildNewNode(arr);
        newNode.right = buildNewNode(arr);
        return newNode;
    }

    public static void preorder(Node root) {
        if (root == null) return;
        System.out.print(root.data + " ");
        preorder(root.left);
        preorder(root.right);
    }

    public static void inorder(Node root) {
        if (root == null) return;
        inorder(root.left);
        System.out.print(root.data + " ");
        inorder(root.right);
    }

    public static void postorder(Node root) {
        if (root == null) return;
        postorder(root.left);
        postorder(root.right);
        System.out.print(root.data + " ");
    }
    public static void levelorder(Node root){
        if(root==null){
            return;
        }
      Queue<Node> queue = new LinkedList<>();
      queue.add(root);
      while(!queue.isEmpty()){
          Node current = queue.poll();
          System.out.print(current.data + " ");
          if(current.left != null) {
              queue.add(current.left);
          }
          if(current.right != null) {
              queue.add(current.right);
          }
        
      }

    }
    public static int sum(Node root){
        if(root==null){
            return 0;
        }
        return root.data+sum(root.left)+sum(root.right);
    


    }
    public static int max(Node root){
        if(root == null){
            return 0;
        }
        int leftMax = max(root.left);
        int rightMax = max(root.right);
        return Math.max(root.data, Math.max(leftMax, rightMax));
    }
    public static int min(Node root){
        if(root == null){
            return Integer.MAX_VALUE;
        }
        int leftMin = min(root.left);
        int rightMin = min(root.right);
        return Math.min(root.data, Math.min(leftMin, rightMin));
    }
    public static int height(Node root){
        if(root == null){
            return 0;
        }
        int leftHeight = height(root.left);
        int rightHeight = height(root.right);
        return Math.max(leftHeight, rightHeight) + 1;
    }
    
}
public class queuetree {
    public static void main(String[] args) {
        int[] arr = {1,2,4,-1,-1,-1,3,-1,-1};
        Node root = Built.buildNewNode(arr);

        System.out.print("Preorder: ");
        Built.preorder(root);
        System.out.println();

        System.out.print("Inorder: ");
        Built.inorder(root);
        System.out.println();

        System.out.print("Postorder: ");
        Built.postorder(root);
        System.out.println();
        
        System.out.println("Level Order Traversal: ");
        Built.levelorder(root);
        System.out.println();

        System.out.println("sum of the tree");
          System.out.println(Built.sum(root));
        System.out.println("Maximum value in the tree");
        System.out.println(Built.max(root));
        System.out.println("Minimum value in the tree");
        System.out.println(Built.min(root));
        System.out.println("Height of the tree");
        System.out.println(Built.height(root));
      
    }
}

