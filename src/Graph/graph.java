package Graph;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Scanner;

public class graph {

    public static void dfs1(int matrix[][],int currentVertex,boolean visited[]){
        visited[currentVertex]=true;
        System.out.print(currentVertex+" ");
        for(int i=0;i<matrix.length;i++){
            if(matrix[currentVertex][i]==1 && visited[i]==false){
                dfs1(matrix,i,visited);
            }
        }
    }

    // find the depth first search
    public  static void dfs(int matrix[][]){
        boolean visited[]= new boolean[matrix.length];
        dfs1(matrix,0,visited);
    }

    //create a printBfsHelper()
    public static void printBfsHelper(int adjMatrix[][], int currentVertex, boolean visited[]){
        Queue<Integer> pendingVertex= new LinkedList<>();
        visited[currentVertex]=true;
        pendingVertex.add(currentVertex);
        while(!pendingVertex.isEmpty()){
            int front= pendingVertex.poll();
            System.out.print(front+" ");
            for(int i=0;i<adjMatrix.length;i++){
                if(adjMatrix[front][i]==1 && !visited[i]){
                    // i is unvisited neighbor of front
                    visited[i]=true;
                    pendingVertex.add(i);
                }
            }
        }

    }


    //find the breadth first search
    public  static void  printBfs(int adjMatrix[][]){
        boolean visited[]= new boolean[adjMatrix.length];
        for(int i=0;i<visited.length;i++){
            if(!visited[i]){
                printBfsHelper(adjMatrix, i, visited);
            }
        }

    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        int n= sc.nextInt(); //its work for vertex
        int e= sc.nextInt();// its work for edges
        //use 2d matrix to implement graph(adjacent matrix)
        int adjacMatrix[][]= new int[n][n];
        for(int i=0;i<e;i++){
            int src= sc.nextInt(); // source
            int destin= sc.nextInt(); // destination
            adjacMatrix[src][destin]=1;
            adjacMatrix[destin][src]=1;
        }
        //dfs(adjacMatrix);
        printBfs(adjacMatrix);
        //print the graph
//        for(int i=0;i<n;i++){
//            for(int j=0;j<n;j++){
//                System.out.print(adjacMatrix[i][j]+" ");
//            }
//            System.out.println();
//        }
    }
}
