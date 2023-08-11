package BinaryTrees;

import java.util.Scanner;

public class Node<T> {
    T data;
    Node<T>left;
    Node<T>right;


    //create a constructor
    public Node(T data){
        this.data=data;
    }

    //create a print()
public static void print(Node<Integer>root){
        //base case
        if(root==null){
            return;
        }
        //small calculation
    System.out.println(root.data);
    //recursive call for left
    print(root.left);
    //recursive call for right
    print(root.right);
}
//or for print
public static void printBinaryTree(Node<Integer>root){
        //base case
    if(root==null){
        return;
    }
    System.out.print(root.data+":");
    if(root.left!=null){
        System.out.print("L"+root.left.data+",");
    }
    if(root.right!=null){
        System.out.print("R"+root.right.data);
    }
    System.out.println();
    //recursive call
    printBinaryTree(root.left);
    //recursive call
    printBinaryTree(root.right);
}


//create a function for TakingInput
    public static Node<Integer> TakingInput(boolean isRoot,int parentData,boolean isLeft) {
        if (isRoot) {
            System.out.println("Enter a root data");
        } else if (isLeft) {
            System.out.println("Enter left child data "+ parentData);
        } else {
            System.out.println("Enter right child data "  + parentData);
        }
        Scanner sc = new Scanner(System.in);
        int rootData = sc.nextInt();
        if(rootData==-1){
            return null;
        }
        Node<Integer> root= new Node<>(rootData);
        Node<Integer> leftchild= TakingInput(false,rootData,true);
        Node<Integer> rightchild= TakingInput(false,rootData,false);
//cannet
root.left=leftchild;
root.right=rightchild;
return root;
    }
    //find a largest node data
    public static int largest(Node<Integer>root){
        //base case
        if(root==null){
            return  -1;
        }
        //recursive call
        int largestLeft= largest(root.left);
        int largestRight= largest(root.right);
    return  Math.max(root.data,Math.max(largestLeft,largestRight));

    }

    //find the height of tree
    public static int height(Node<Integer>root){
        //base case
        if(root==null){
            return  0;
        }
        //recursive call for left
        int Hleft= height(root.left);
        int Hright=height(root.right);
        if(Hleft>Hright){
            return Hleft+1;
        }
        else{
            return Hright+1;
        }
    }

    //find number of leaf/ leaves in binary tree
    public static  int leaves(Node<Integer>root){
        //base case
        if(root==null){
            return 0;
        }
        //small calculation for only one node
        if(root.left==null  && root.right==null){
            return 1;
        }
        //recursive call
        return leaves(root.left)+leaves(root.right);
    }
    //print the nodes at depth of k
    public static void depthK(Node<Integer>root,int k){
        //base case
        if(root==null){
            return;
        }
        if(k==0){
            System.out.println(root.data);
        }
        depthK(root.left,k-1);
        depthK(root.right,k-1);
    }


    public static void main(String[] args) {
        //create a object
//        Node<Integer> root= new Node<>(10);
//        Node<Integer> rootleft= new Node<>(20);
//        Node<Integer> rootright= new Node<>(30);
//        //connect
//        root.left=rootleft;
//        root.right=rootright;
//        Node<Integer> Tworootleft= new Node<>(40);
//        Node<Integer> Tworootright= new Node<>(50);
//        //connect
//        root.left.right=Tworootleft;
//        root.right.left=Tworootright;
        Node<Integer> root= TakingInput(true,0,true);
        System.out.println("largest="+ largest(root));
        System.out.println("height of tree="+height(root));
        System.out.println("how many leaves here="+ leaves(root));
        depthK(root,2);
        printBinaryTree(root);



    }
}
