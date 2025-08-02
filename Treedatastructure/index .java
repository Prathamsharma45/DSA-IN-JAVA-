

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
}

public class index {
    public static void main(String[] args) {
        int[] arr = {1, 2, 4, -1, -1, -1, 3, -1, -1};
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
    }
}
