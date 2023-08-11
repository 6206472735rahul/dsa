package BinaryTrees;

public class BinaryTreeNode<T> {
    //define a data members
    T data;
    BinaryTreeNode<T>left;
    BinaryTreeNode<T>right;
    //implement a constructor
    public BinaryTreeNode(T data){
        this.data= data;
       // this.left= left; // this variable assign its self
      //  this.right=right;

    }
}
