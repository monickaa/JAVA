import java.util.*;
class LList{
    Node node;
    Node head=null;
    class Node{
        int data;
        Node next;
         
        Node(int val){
            data=val;
            next=null;
        }
    }
    public void insert(int val){
        Node newnode=new Node(val);
        if(head==null){
            head=newnode;
        }
        else{
            newnode.next=head;
            head=newnode;
        }
    }
    
    public void display(){
        Node temp=head;
        while(temp!=null){
            System.out.print(temp.data+"--->");
            temp=temp.next;
        }
    }

    public void insertpos(int val,int pos){
        if(pos==0){
            insert(val);
        }
        else{
            Node newnode=new Node(val);
            Node temp=head;
            for(int i=1;i<pos;i++){
                temp=temp.next;
                if(temp==null){
                    // System.out.println("Cant insert");
                    return;
                }
            }
            newnode.next=temp.next;
            temp.next=newnode;
        }
    }
    public void delete(int val){
            Node newnode=new Node(val);
            Node temp=head;
            Node curr=null;
            while(temp!=null){
                if(val==temp.data){
                    curr.next=temp.next;
                }
                curr=temp;
                temp=temp.next;
            }
        }
    
    public static void main(String[] args){
        LList l=new LList();
        l.insert(100);
        l.insert(200);
        l.insert(300);
        l.insert(400);
        l.insert(500);
        // l.display();
        // l.insertpos(150,1);
        l.delete(200);
        l.display();
    }
}
