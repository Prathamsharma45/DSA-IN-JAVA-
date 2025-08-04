class Node{
    int data;
    Node right;
   Node left;
     public Node(int data){
        this.data=data;
        this.left=null;
        this.right=null;

     }
  static class Build {
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
    
     public static void preorder(Node root){
        if(root==null)return;
       System.out.println(root.data+" ");
       preorder(root.left);
       preorder(root.right) ; 
    }
    public static void postorder(Node root){
           if(root==null)return;
           postorder(root.left);
           postorder(root.right);
           System.out.println(root.data+" ");
    }
    public static void inorder(Node root){
        if(root==null)return ;
        inorder(root.left);
        System.out.println(root.data+" ");
        inorder(root.right);
    }

    }

}
class treepractice1{
   public static void main(String[] args) {
       int[] node = {1,2,4,-1,-1,-1,3,-1,-1};
        Node.Build list = new Node.Build();
        Node temp = Node.Build.buildNewNode(node);
        System.out.println("preorder");
        Node.Build.preorder(temp);
        System.out.println();
        System.out.println("postorder");
        Node.Build.postorder(temp);
        System.out.println();
        System.out.println("inorder");
        Node.Build.inorder(temp);

    
    }

}
