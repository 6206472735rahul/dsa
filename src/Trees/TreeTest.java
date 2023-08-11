package Trees;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class TreeTest {
//    //create a function for print the generic trees( first approach)
//    public static void printTree(TreeNode<Integer>root){
//        //special case not a base case
//        if(root==null){
//            return;
//        }
//        System.out.print(root.data+" ");
//        for(int i=0;i<root.children.size();i++){
//            TreeNode<Integer> child= root.children.get(i);
//            //recursive call for child
//            printTree(child);
//        }
//create a function for print the generic trees( 2nd approach)
public static void printTree(TreeNode<Integer>root){
    //special case not a base case
    if(root==null){
        return;
    }
    System.out.print(root.data+": ");
    for(int i=0;i<root.children.size();i++){
        System.out.print(root.children.get(i).data+" ");
    }
    System.out.println();
    for(int i=0;i<root.children.size();i++){
        TreeNode<Integer> child= root.children.get(i);
        //recursive call for child
        printTree(child);
    }
    }

    //find the numbers of nodes in trees
    public static int findNode(TreeNode<Integer>root){
    //special case not a base case
    if(root==null){
        return 0;
    }
    int count=1;
    for(int i=0;i<root.children.size();i++){
        //recursive call for child
      int child=findNode(root.children.get(i));
      count=count+child;
    }
    return count;

    }

    //taking the input level wise
    public static TreeNode<Integer> TakingInput(){
        Scanner sc= new Scanner(System.in);
        Queue<TreeNode<Integer>> pendingNodes= new LinkedList<>();
        System.out.println("Enter the root data");
        int rootData= sc.nextInt();
        if(rootData==-1){
            return null;
        }
        TreeNode<Integer> root= new TreeNode<>(rootData);
        pendingNodes.add(root);
        while(!pendingNodes.isEmpty()){
            TreeNode<Integer> front= pendingNodes.poll();
            System.out.println("Enter the number of  children" + front.data);
            int child= sc.nextInt();
            for(int i=0;i<child;i++){
                System.out.println("Enter the "+ i +"th child data for :"+ front.data);
                int childData= sc.nextInt();
                TreeNode<Integer> childNode= new TreeNode<>(childData);
                front.children.add(childNode);
                pendingNodes.add(childNode);
            }
        }
        return root;
    }

    public static void main(String[] args) {
//        TreeNode<Integer> root= new TreeNode<>(4);
//        TreeNode<Integer> node1= new TreeNode<>(2);
//        TreeNode<Integer> node2= new TreeNode<>(3);
//        TreeNode<Integer> node3= new TreeNode<>(1);
//        TreeNode<Integer> node4= new TreeNode<>(5);
//        TreeNode<Integer> node5= new TreeNode<>(6);
//        //connect root and all children to each other
//        root.children.add(node1);
//        root.children.add(node2);
//        root.children.add(node3);
//        node2.children.add(node4);
//        node2.children.add(node5);
//
       TreeNode<Integer>root= TakingInput();
printTree(root);
       // System.out.println("total nodes="+findNode(root));

    }
}
