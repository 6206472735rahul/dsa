package LinkedList;
import java.util.Scanner;

public class Findlength {

    //create a function for createLinkedlist
    public static Length<Integer> CreateLinkedList(){
        Length<Integer> l1= new Length<>(10);
        Length<Integer> l2= new Length<>(20);
        Length<Integer> l3= new Length<>(30);
        Length<Integer> l4= new Length<>(40);
        //connecting to each other
        l1.next=l2;
        l2.next=l3;
        l3.next=l4;
        return l1;
    }

//    //taking input from users
//    //time complexity o(n^2)
//    public static Length<Integer> TakingInput(){
//        Scanner sc= new Scanner(System.in);
//        int data= sc.nextInt();
//        Length<Integer>head=null;
//        while(data!=-1){ //stop the loop
//            //create node
//            Length<Integer> currentNode= new Length<>(data);
//            if(head==null){
//                //make this node as a head node
//                head= currentNode;
//            }
//            else{
//                Length<Integer>tail=head;
//                while(tail.next!=null){
//                    tail=tail.next;
//                }
//                //tail is refer last node
//                //connect current node after last node
//                tail.next=currentNode;
//            }
//          data= sc.nextInt();
//        }
//
//return head;
//    }

    //2nd method taking input from users
    //time complexity o(n)
    public static Length<Integer> TakingInput(){
        Scanner sc= new Scanner(System.in);
        int data= sc.nextInt();
        Length<Integer>head=null, tail=null;
        while(data!=-1){ //stop the loop
            //create node
            Length<Integer> currentNode= new Length<>(data);
            if(head==null){
                //make this node as a head node and tail node
                head= currentNode;
                tail=currentNode;
            }
            else{
                //tail is refer last node
                //connect current node after last node
                tail.next=currentNode;
               // tail=currentNode;// updated the tail (moving the tail next node)
                //or
                tail=tail.next;

            }
            data= sc.nextInt();
        }

        return head;
    }

    //print the node element using function
    public static void print(Length<Integer> head){
        Length<Integer> temp=head;
        while(temp!=null){
            System.out.print(temp.data+" ");
            temp=temp.next;
        }
    }


//find the length
    public static int length(Length<Integer> head){
        //base case
        if(head==null){
            return 0;
        }
        Length<Integer>temp=head;

        int count=0;
        while(temp!=null){
            count++;
            temp=temp.next;
        }
        return count;
    }

    //print the ith node
    public  static void IthNode(Length<Integer> head,int i){
        if(head==null){
            return;
        }
        Length<Integer>temp=head;
        int count=0;
        while(temp!=null){
            if(count==i){
                System.out.println(temp.data);
                break;
            }
            count++;
            temp=temp.next;
        }
    }

    //Palindrome LinkedList
    public static boolean palindrome(Length<Integer>head){
        if(head==null ||head.next==null){
            return  true;
        }
        //call midElement
        Length<Integer>mid= midElement(head);
        //call reverse
        mid= reverseLinkedList(mid);
        while (mid!=null && head!=null){
            if(!head.data.equals(mid.data)){
                return false;
            }
            mid=mid.next;
            head=head.next;
        }
        return true;

    }

    //reverse
    public static Length<Integer> reverseLinkedList(Length<Integer>head){
        Length<Integer>curr=head;
        Length<Integer>next=null;
        Length<Integer>prev=null;
        while(curr!=null){
            next=curr.next;
            curr.next=prev;
            prev=curr;
            curr=next;
        }
        return prev;
    }

    //find mid element of linkedlist
    public static Length<Integer>midElement(Length<Integer>head){
        Length<Integer>slow=head;
        Length<Integer>first=head;
        while(first.next!=null && first.next.next!=null){
            slow=slow.next;
            first=first.next.next;
        }
        return slow;
    }

    //insert the element in linked list
//    public static Length<Integer> insert(Length<Integer> head, int data, int pos) {
//        //Your code goes here
//        //create new node
//        Length<Integer> newNode= new Length<>(data);
//        int count=0;
//        Length<Integer>prev=head;
//        while(count<pos-1){
//            count++;
//            prev=prev.next;
//        }
//        newNode.next=prev.next;
//        prev.next=newNode;
//return head;
//    }

    //2nd approach

    public static Length<Integer> insert(Length<Integer> head, int data, int pos) {
//check pos 0 if pos is 0 then create a newNode
        Length<Integer> newNode= new Length<>(data);
        if(pos==0){
            newNode.next=head;
            head=newNode;
            return  head;
        }
        //length find and pos check
        Length<Integer>temp=head,prev=null;
        while(temp!=null && pos>1){
            temp=temp.next;
            pos--;
        }
        //add new element in linked list
        if(temp==null){
            return head;
        }
        newNode.next=temp.next;
        temp.next=newNode;
        return head;
    }
    //delete the node in linked list
    public static Length<Integer> delete(Length<Integer>head,int pos){
        if(head==null){
            return  head;
        }
        if(pos==0){
            return  head.next;
        }
        //find the length and target pos
        Length<Integer>currHead= head;
        int count=0;
        while(currHead!=null && count<pos-1){
            currHead=currHead.next;
            count++;
        }
        //delete the node of give pos of element
        if(currHead==null || currHead.next==null){
            return head;
        }
        currHead.next=currHead.next.next;
        return head;
    }

    public static int FindNode(Length<Integer>head,int n){
 int pos=0;
 Length<Integer>currHead=head;
 while(currHead!=null){
     if(currHead.data.equals(n)){
         return pos;
     }
     currHead=currHead.next;
     pos++;
 }
 return -1;
    }

    //Eliminate duplicates from LL
    public static Length<Integer> consecutiveDuplicates(Length<Integer>head){
        if(head==null){
            return head;
        }
        Length<Integer>currHead=head;
        while(currHead.next!=null){
            if(currHead.data.equals(currHead.next.data)){
                currHead.next= currHead.next.next;
            }
            else{
                currHead= currHead.next;
            }
        }
        return  head;

    }

    //Print Reverse LinkedList usin recursion
    public static void reverse(Length<Integer>root){
        //base case
        if(root==null){
            return;
        }
        //recursive call
        reverse(root.next);
        //print
        System.out.print(root.data+"  ");

    }
    //AppendLastNToFirst
    public static Length<Integer> AppendLastTofirst(Length<Integer>head,int n){
        if(n==0){
            return head;
        }
       Length<Integer>node=head,checkNode=null,newHead=null;
        //count the length
        int count=0;
        while(node!=null){
            node=node.next;
            count++;
        }
        if(count<n)
            return head;
            n=count-n;
            node=head;
            for(int i=0;i<n-1;i++) {
                node = node.next;
            }
          checkNode=node.next;
            node.next=null;
            newHead=checkNode;
            while(checkNode.next!=null){
                checkNode=checkNode.next;
            }
checkNode.next=head;
 newHead=head;
 return  head;

    }



    public static void main(String[] args) {
//Length<Integer>head= CreateLinkedList(); this taking input itself.
Length<Integer>head= TakingInput();//this takingInput from users
 //insert(head,200,2);
       // System.out.println(delete(head,3));
       // System.out.println(FindNode(head,4));
       // System.out.println(consecutiveDuplicates(head));
      //  reverse(head);
       // System.out.println(AppendLastTofirst(head,3));
        System.out.println(palindrome(head));
//System.out.println();
//System.out.println(length(head));
//IthNode(head,3)


    }
}
