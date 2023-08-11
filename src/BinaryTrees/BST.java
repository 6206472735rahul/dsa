package BinaryTrees;

public class BST {
  BinaryTreeNode<Integer> root;
 int size;

 //create a Helper function for ispresent
    public static boolean isPresentHelper(BinaryTreeNode<Integer>root,int x){
        //base case
        if(root==null){
            return  false;
        }
        //small calculation
        if(root.data==x){
            return  true;
        }
        if(x>root.data){
            //recursive call for right side
          return   isPresentHelper(root.right,x);
        }
        else{
            //recursive call left side
         return    isPresentHelper(root.left,x);
        }
    }
 public  boolean isPresent(int x){
     return isPresentHelper(root,x);
 }
 //create a insertHelper function for insert
    public static BinaryTreeNode<Integer> insertHelper(BinaryTreeNode<Integer> root,int x){
        if(root==null){
            //then create a new node
            BinaryTreeNode<Integer> newNode= new BinaryTreeNode<Integer>(x);
            return newNode;
        }
        if(x>root.data){
            root.right= insertHelper(root.right,x);
        }
        else{
            root.left= insertHelper(root.left,x);
        }
        return root;

    }
 //create a insert function
    public  void insert(int x){
     root=insertHelper(root,x);
    }

    //create a search function
    public void  search(){

    }

    //create a deleteHelper function (return two things one is newroot data and 2nd one is boolean
    public static deleteReturn deleteHelper(BinaryTreeNode<Integer> root ,int x){
 //base case
        if(root==null){
      return new deleteReturn(null,false);
        }
        if(x>root.data){
            deleteReturn rightOutput=deleteHelper(root.right,x);
            root.right=rightOutput.root;
            rightOutput.root=root;
            return rightOutput;
        }
        if(x<root.data){
            deleteReturn leftOutput=deleteHelper(root.left,x);
            root.left=leftOutput.root;
            leftOutput.root=root;
            return leftOutput;
        }
        //root has 0 children
        if(root.left==null && root.right==null){
            return new deleteReturn(null,false);
        }
        //root has only one left child
        if(root.left!=null && root.right==null){
            return new deleteReturn(root.left,true);
        }
        //root has only one right child
        if(root.left==null && root.right!=null){
            return new deleteReturn(root.right,true);
        }
        //root has both children
        //then find minimum
      int rightMin=  minimum(root.right);
         root.data = rightMin;
         deleteReturn outputRight= deleteHelper(root.right,rightMin);
      root.right= outputRight.root;
      return new deleteReturn(root,true);
    }
    //find minimum
    public static int minimum(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return Integer.MAX_VALUE;
        }
        //recursive call left and right side
     int leftMin=minimum(root.left);
     int rightMin=minimum(root.right);
     return Math.min(root.data,Math.min(leftMin,rightMin));
    }
    //create a delete function
    public boolean delete(int x){
deleteReturn output= deleteHelper(root,x);
 root= output.root;
 if(output.deleted){
     size--;
 }
 return output.deleted;

}

    //create a size function
    public static int size(){
     return  size();
    }

    //create a printTreeHelper function for printTree
    public static void printTreeHelper(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return;
        }
        System.out.print(root.data+":");
        if(root.left!=null){
            System.out.print("L:"+root.left.data+",");
        }
        if(root.right!=null){
            System.out.print("R:"+root.right.data);
        }
        System.out.println();
        printTreeHelper(root.left);
        printTreeHelper(root.right);
    }
    //create a printTree function
    public void printTree(){
        printTreeHelper(root);

    }


}
