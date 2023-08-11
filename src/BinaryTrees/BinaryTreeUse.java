package BinaryTrees;

import java.util.ArrayList;
import java.util.Scanner;

public class BinaryTreeUse {

//    //print binary tree using recursion approach 1
//    public static void printTree(BinaryTreeNode<Integer>root){
//        //base case
//        if(root==null){
//            return;
//        }
//        System.out.println(root.data);
//        //call recursive for left side
//        printTree(root.left);
//        //call recursive for right side
//        printTree(root.right);
//    }

    //print binary tree using recursion approach 2 (good as compared to approach 1)
    public static void printTree(BinaryTreeNode<Integer>root){
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
        //call recursive for left side
        printTree(root.left);
        //call recursive for right side
        printTree(root.right);
    }

    //taking input from users first approach
//    public static BinaryTreeNode<Integer> TakingInputTree(){
//        System.out.println("Enter root data");
//        Scanner sc= new Scanner(System.in);
//        int rootData= sc.nextInt();
//        if(rootData==-1){
//            return null;
//        }
//        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
//        BinaryTreeNode<Integer> leftChild= TakingInputTree();
//        BinaryTreeNode<Integer> rightChild= TakingInputTree();
//        //connect all node to each other
//        root.left=leftChild;
//        root.right=rightChild;
//        return root;
//
//    }

    //taking input from users 2nd approach(better)
    public static BinaryTreeNode<Integer> TakingInputTree(boolean isRoot,int parentData,boolean isLeft){
        if(isRoot){
            System.out.println("Enter root data");
        }
        else if(isLeft){
            System.out.println("Enter left child of "+ parentData);
        }
        else{
            System.out.println("Enter right child of "+ parentData);
        }
        Scanner sc= new Scanner(System.in);
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(rootData);
        BinaryTreeNode<Integer> leftChild= TakingInputTree(false,rootData,true);
        BinaryTreeNode<Integer> rightChild= TakingInputTree(false,rootData,false);
        //connect all node to each other
        root.left=leftChild;
        root.right=rightChild;
        return root;

    }

    //print numbers of node in tree
    public static int countNodeTree(BinaryTreeNode<Integer> root){
        //base case
        if(root==null){
            return 0;
        }
        //recursive call for leftChild
     int leftCount= countNodeTree(root.left);
     int rightCount=   countNodeTree(root.right);
     //small calculation
        return 1+leftCount+rightCount;
    }

    //sum of nodes
    public static int sumNodes(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return  0;
        }
        //recursive call for left child
      int sumLeft=  sumNodes(root.left);
        //recursive call for right child
      int sumRight =sumNodes(root.right);
      //small calculation
      int sum= root.data+sumLeft+sumRight;
      return sum;

    }
    //pre order traversal
    public static void preOrder(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return;
        }
        //small calculation
        System.out.println(root.data);
        //recursive call for left child
        preOrder(root.left);
        //recursive call for right child
        preOrder(root.right);

    }
    //post order traversal
    public static void postOrder(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return;
        }
        //recursive call for left child
        preOrder(root.left);
        //recursive call for right child
        preOrder(root.right);
        //small calculation
        System.out.println(root.data);


    }

    //In order traversal
    public static void InOrder(BinaryTreeNode<Integer>root){
        //base case
        if(root==null){
            return;
        }
        //recursive call for left child
        preOrder(root.left);
        //small calculation
        System.out.println(root.data);
        //recursive call for right child
        preOrder(root.right);

    }

    //return path from root to x using binary tree
    public static ArrayList<Integer> pathTox(BinaryTreeNode<Integer>root,int x){
        //base case
        if(root==null){
            return null;
        }
        if(root.data==x){
            ArrayList<Integer>output=new ArrayList<>();
            output.add(root.data);
            return output;
        }
        //recursive call for left child as well as add the root.data into arraylist
          ArrayList<Integer>left=pathTox(root.left,x);
        if(left!=null){
            left.add(root.data);
            return  left;
        }
        //recursive call for right child as well as add the root.data into arraylist
   ArrayList<Integer>right= pathTox(root.right,x);
        if(right!=null){
            right.add(root.data);
            return right;
        }
        return null;

    }



    public static void main(String[] args) {
//        BinaryTreeNode<Integer> root= new BinaryTreeNode<>(1);
//        BinaryTreeNode<Integer> root_left= new BinaryTreeNode<>(2);
//        BinaryTreeNode<Integer> root_right= new BinaryTreeNode<>(3);
//        //connect all node to each other
//        root.left=root_left;
//        root.right=root_right;
//        BinaryTreeNode<Integer> two_right= new BinaryTreeNode<>(4);
//        BinaryTreeNode<Integer> three_left= new BinaryTreeNode<>(5);
//        //connect next node data to each other
//        root.left.right=two_right;
//        root.right.left=three_left;
       // BinaryTreeNode<Integer>root= TakingInputTree(true,0,true);
        //call countNodeTree
     //   System.out.println("numbers of node="+countNodeTree(root));
        //call sum of nodes
       // System.out.println(sumNodes(root));
        //call preorder
     //  preOrder(root);
        //call post order
     //   postOrder(root);
        // call in order
       // InOrder(root);
      BinaryTreeNode<Integer> root= TakingInputTree(true,0,true);
        ArrayList<Integer>path= pathTox(root,1);
        if(path==null){
            System.out.println("not found");
        }
        else{
            for(int i:path){
                System.out.print(i);
            }
        }
      //  printTree(root);
    }

}
