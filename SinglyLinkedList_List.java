// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class SinglyLinkedList {
    Node head=null;
    class Node{
        List<Integer> data;
        Node next;
        Node(List<Integer> l){
            data=l;
            next=null;
        }
    }
    public void insertatbeg(List<Integer> l){
        Node newnode=new Node(l);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
        System.out.println("List inserted successfully at beginning");
    }
    public void insertatend(List<Integer> l){
        Node newnode=new Node (l);
        
        // Node curr=null;
        if(head==null){
            head=newnode;
        }
        else{
            Node temp=head;
             while(temp !=null && temp.next!=null ){
                temp=temp.next;
            }
            temp.next=newnode;
    }
    System.out.println("List inserted successfully at end");
    }
    public void display(){
        Node temp=head;
        if(head==null){
            System.out.println("List is Empty");
        }
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
        
    }
    public void delete(int pos){
        if(head==null){
            System.out.println("List is empty.Can't delete.");
            return;
        }
            Node temp=head;
            Node curr=null;
            if(pos==1){
                head=temp.next;
                return;
            }
            for(int i=1;i<pos && temp!=null;i++){
                curr=temp;
                temp=temp.next;
            }
            if(temp==null){
                System.out.println("Position out of bounds.");
            }
            curr.next=temp.next;
            System.out.println("List deleted successfully");
        
        
    }
    // public void insertatend(List<Integer> l){
        
    // }
    public static void main(String[] args) {
        Scanner io=new Scanner(System.in);
        SinglyLinkedList sl=new SinglyLinkedList();
        System.out.println("Singly Linked List:");
        System.out.println("You can do any operations given below!");
        System.out.println("1.Insert a list at beginning");
        System.out.println("2.Insert a list at end");
        System.out.println("3.Delete a list at a position");
        System.out.println("4.Display");
        System.out.println("5.Exit");
        int choice=0;
        
        while(choice!=5){
            System.out.print("Enter your choice: ");
            choice=io.nextInt();
            List<Integer>al=new ArrayList<>();
            if(choice==1){
                System.out.print("Enter size of the list: ");
                int n=io.nextInt();
                for(int i=0;i<n;i++){
                    System.out.print("Enter element "+(i+1)+": ");
                    int ele=io.nextInt();
                    al.add(ele);
                }
                sl.insertatbeg(al);
            }
            else if(choice ==2){
                System.out.print("Enter size of the list: ");
                int n=io.nextInt();
                for(int i=0;i<n;i++){
                    System.out.print("Enter element "+(i+1)+": ");
                    int ele=io.nextInt();
                    al.add(ele);
                }
                sl.insertatend(al);
                
               
            }
            else if(choice==3){
                System.out.print("Enter a position to delete a list: ");
                int pos=io.nextInt();
                if(pos<=0){
                    System.out.println("Invalid position");
                }
                sl.delete(pos);
                
                
            }
            else if(choice==4){
                sl.display();
            }
            else if(choice==5){
                System.out.println(".....Exiting.....");
            }
        }
    }
}
