package Tries;

//create a class for   trieNode
 class TrieNode{
    char data;
    boolean isTerminal;
    TrieNode children[];
    int childCount;

    // create a constructor
    public TrieNode(char data){
        this.data=data;
        this.isTerminal= false;
        this.children=new TrieNode[26];
        this.childCount=0;
    }
}
public class Tries {
     private TrieNode root;
     public Tries(){
         root= new TrieNode('\0');// my root  will have null
     }

     //create a addHelper()
    private void addHelper(TrieNode root,String word){
         //base case
        if(word.length()==0){
            root.isTerminal=true;
            return;
        }
         int childIndex= word.charAt(0)-'A';
         TrieNode child= root.children[childIndex];
         if(child==null){// not exist
             //create a newNode
             child= new TrieNode(word.charAt(0));
             root.children[childIndex]=child;
             root.childCount++;
         }
         //recursive call
        addHelper(child,word.substring(1));

    }
     //create a add()
public void add(String word){
addHelper(root,word);
}

//create a searchHelper()
    private boolean searchHelper(TrieNode root,String word){
         //base case
        if(word.length()==0){
            return root.isTerminal;
        }
         int childIndex= word.charAt(0)-'A';
         TrieNode child= root.children[childIndex];
         if(child==null){// not exist
             return false;
         }
         //recurisve call
         return searchHelper(child,word.substring(1));
    }


//create a search()
    public boolean search(String word){
 return searchHelper(root,word);
    }
   //create a removeHelper()
   private void removeHelper(TrieNode root,String word){
       //base case
       if(word.length()==0){
           root.isTerminal=false;
           return;
       }
       int childIndex= word.charAt(0)-'A';
       TrieNode child= root.children[childIndex];
       if(child==null){
           return;
       }
       //recursive call
       removeHelper(child,word.substring(1));
       //CHECK SOME CONDITION SO THAT REMOVE ALL USELESS CHAR AND STORE ON USELESS PLACE PUT NULL
       //CONDITION 1--> If child is a terminal node then i should not remove them because the word exist
       //CONDITION 2--> If child count is 0 then remove them
       if(!child.isTerminal && child.childCount==0){
           root.children[childIndex]=null;
           root.childCount--;
       }

   }
    //create a remove()
    public void remove( String word){
removeHelper(root,word);

    }

    //create a countWordHelper()
    private  int countWordHelper( TrieNode root){
         int count=0;
         if(root.isTerminal){
             count++;
         }
         for(int i=0;i<26;i++){
             if(root.children[i]!=null){
                 count=count+countWordHelper(root.children[i]);
             }
         }
         return count;
    }
    //create a countWord()
    public int countWord(){
return countWordHelper(root);
    }

}
