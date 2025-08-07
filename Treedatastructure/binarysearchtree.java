class Node{
  int data;
  Node left;
  Node right;
  Node(int data){
    this.data=data;
    this.left=null;
    this.right=null;
  }
}

class Build{
  static Node Build(Node root, int val){
    if(root==null){
      return new Node(val);
    }
    if (root.data>val) {
        root.left=Build(root.left, val);
    }
    else{
      root.right=Build(root.right, val);
    }
    return root;
  }

  static void Search(Node root, int target){
    if (root == null) {
      System.out.println("No element in the tree");
      return;
    }
    if (root.data == target) {
        System.out.println("Element Found");
    }
    if (target < root.data) {
      Search(root.left, target);
    }
    else{
      Search(root.right, target);
    }
  }

  static void leafCount(){
    
  }
}

class binarysearchtree {
  public static void main(String[] args) {
      int[] arr = {1,24,43,32,5,23,23,4,3};
      Node root = null;
      Build list = new Build();
      for (int val : arr) {
         root= list.Build(root,val);
      }
      int target = 23;
      list.Search(root, target);

  }
}