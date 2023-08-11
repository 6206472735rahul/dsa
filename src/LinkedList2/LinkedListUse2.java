package LinkedList2;

import java.util.Scanner;

public class LinkedListUse2 {
//step3 taking input from users
public static node<Integer> TakingInput(){
    Scanner sc= new Scanner(System.in);
    int data= sc.nextInt();
    node<Integer>head=null,tail=null;
    while(data!=-1){// stop the loop
        node<Integer>currNode= new node<Integer>(data);
        if(head==null){
            //make  the node as a head and tail
            head=currNode;
            tail=currNode;
        }
        else{
            //moving tail data
            //tail is refer to the last node
            // connecting current node after last node
            tail.next=currNode;
            tail=tail.next;
        }
        data= sc.nextInt();
    }
    return  head;
    }

    //step4 printing linkedlist using recursive
    public static void printRecursive(node<Integer>head){
    //base case
        if(head==null){
            return;
        }
        //print
        System.out.print(head.data+" ");
        //recursive call
        printRecursive(head.next);
    }

    //reverse order print
//    public static void printReverse(node<Integer>head){
//        //base case
//        if(head==null){
//            return;
//        }
//        //recursive call
//        printReverse(head.next);
//        //print
//        System.out.print(head.data+" ");
//    }

    //insert recursive
    public static  node<Integer> insertR(node<Integer>head,int data,int pos){
    if(head==null && pos>0){
        return head;
    }
    if(pos==0){
        node<Integer>newNode= new node<Integer>(data);
        newNode.next=head;
        return newNode;
    }
    else{
        //recursive call
        node<Integer> smallHead= insertR(head.next,data,pos-1);
        head.next=smallHead;
        return head;
    }
    }

    //Delete node Recursively
    public  static node<Integer> deleteNode(node<Integer>head,int pos){
    //base case
    if(pos==0){
        return head.next;
    }
    //recursive call
   node<Integer>smallOutput= deleteNode(head.next,pos-1);
    //attached both small cal and recursive call
    head.next=smallOutput;
    return head;

    }
    //Reverse LL (Recursive)
    public  static node<Integer> reverseLinkedlist(node<Integer>head){
    //base case
        if(head==null || head.next==null){
            return  head;
        }
        //recursive call
       node<Integer>smallHead= reverseLinkedlist(head.next);
        head.next.next=head;
        head.next=null;
        return  smallHead;
    }

    //Merge 2 sorted LL
    public static node<Integer> merge(node<Integer>head1,node<Integer>head2){
    //if head1 is null
        if(head1==null){
            return head2;
        }
        //if head2 null
        if(head2==null){
            return head1;
        }
    node<Integer>t1=head1,t2=head2;
    node<Integer>head=null,tail=null;
    //compare t1 and t2 data
        if(t1.data<=t2.data){
            head=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            head=t2;
            tail=t2;
            t2=t2.next;
        }
       // before using iterative loop one one data store t1 and t2
        while(t1!=null && t2!=null){
            if(t1.data<=t2.data){
                tail.next=t1;
                tail=t1;
                t1=t1.next;
            }
            else{
                tail.next=t2;
                tail=t2;
                t2=t2.next;
            }
        }
        //one list is over
        if(t1!=null){
            //first list is remaining
            tail.next=t1;
        }
        else{
            tail.next=t2;
        }
        return head;
    }

    //merge sort linkedlist
    public static node<Integer> mergeSort(node<Integer>head){
    if(head==null){
        return head;
    }
    if(head.next==null){
        return head;
    }
    //call findMid
        node<Integer>mid= findMid(head);
         node<Integer>h2=mid.next;
         mid.next=null;
         node<Integer>part1=mergeSort(head);
         node<Integer>part2= mergeSort(h2);
         node<Integer>mergelist= mergeTwoList(part1,part2);
         return mergelist;

    }
//divided into parts of linked list (find mid point)
    public static node<Integer>findMid(node<Integer>head){
    if(head==null){
        return head;
    }
    node<Integer>slow=head;
    node<Integer>first=head;
    while(first.next!=null && first.next.next!=null){
        slow=slow.next;
        first=first.next.next;
    }
    return slow;
    }

    // merge to list
    public static node<Integer> mergeTwoList(node<Integer>head1,node<Integer>head2){
    if(head1==null){
        return head2;
    }
    if(head2==null){
        return head1;
    }
    node<Integer>t1=head1,t2=head2;
    node<Integer>head=null,tail=null;
    if(t1.data<=t2.data){
        head=t1;
        tail=t1;
        t1=t1.next;
    }
    else{
        head=t2;
        tail=t2;
        t2=t2.next;
    }
    while(t1!=null && t2!=null){
        if(t1.data<=t2.data){
            tail.next=t1;
            tail=t1;
            t1=t1.next;
        }
        else{
            tail.next=t2;
            tail=t2;
            t2=t2.next;

        }
    }
    if(t1!=null){
        tail.next=t1;
    }
    else{
        tail.next=t2;
    }
    return head;
    }

    //Find a node in LL (recursive)
    public static int FindNodeRecursive(node<Integer>head,int n){
    //.base case
        if(head==null){ //head is empty then return -1
            return -1;
        }
        //small calculation
        if(head.data.equals(n)){
            return 0;
        }
        //recurive call
      int smallIndex= FindNodeRecursive(head.next,n);
        if(smallIndex==-1){
            return smallIndex;
        }
        else{
            return smallIndex+1;
        }
    }

    //Even after Odd LinkedList
    public static node<Integer>EvenAfterOdd(node<Integer>head){
    if(head==null){
        return head;
    }
    //step 1 4 variable declared as requirement
    node<Integer>oddH=null,oddT=null,evenH=null,evenT=null;
    //my head is null or not
    while(head!=null){
        //check head data is even ya  odd
        if(head.data%2==0){
            //check evenH and EvenT is null
            if(evenH==null){
                evenH=head;
                evenT=head;
            }
            else{
                evenT.next=head;
                evenT=evenT.next;
            }
        }
        //else-if-else
        else{
            if(oddH==null){
                oddH=head;
                oddT=head;
            }
            else {
                oddT.next=head;
                oddT=oddT.next;
            }
        }
        head=head.next;
    }
    //break
        if(oddH==null){//oddH empty
            return evenH;
        }
        else{
            oddT.next=evenH;
        }
        if(evenH!=null){
            evenT.next=null;
        }
        return oddH;
    }

    //Delete every N nodes
    public static node<Integer>DeleteEveryNode(node<Integer>head,int M,int N){
    if(M==0){// m indicate skip the data
        return null;
    }
    if(N==0){//n indicate delete the data
        return head;
    }
    node<Integer>node=head,delNode=null;
    while(node!=null){
        for(int i=0;i<M-1 && node!=null;i++){
            node=node.next;
        }
        if(node==null){
            break;
        }
        delNode=node.next;
        for (int j=0;j<N && delNode!=null;j++){
         delNode=delNode.next;
        }
        node.next=delNode;
        node=delNode;
    }
    return head;
    }
    public static void main(String[] args) {
//        node<Integer>head1= TakingInput();
      //  node<Integer>head2= TakingInput();
        node<Integer>head= TakingInput();
       // printReverse(head);//print reverse order element
       // head=insertR(head,100,3);
      //  head= deleteNode(head,3);
       // head= reverseLinkedlist(head);
    // node<Integer> head=merge(head1,head2);
    // node<Integer>newhead= mergeSort(head);
       // printRecursive(newhead);
       // System.out.println(FindNodeRecursive(head,-1));
       // node<Integer>newHead= EvenAfterOdd(head);
       // printRecursive(newHead);
        node<Integer>newHead= DeleteEveryNode(head,2,3);
        printRecursive(newHead);


    }
}
