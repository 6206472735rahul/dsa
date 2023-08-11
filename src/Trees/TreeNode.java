package Trees;

import java.util.ArrayList;

public class TreeNode<T> {
    T data;
    ArrayList<TreeNode<T>>children;

    //create a constructor
    public TreeNode(T data){
        this.data=data;
        this.children= new ArrayList<>();//arraylist is denoted  empty not null
    }
}
