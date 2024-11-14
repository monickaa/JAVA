// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Node{
    int data;
    Node left;
    Node right;
    Node(int val){
        this.data=val;
        this.left=null;
        this.right=null;
    }
}
class Tree{
    public Node root=null;
    public void insert(int val){
        Node don=new Node(val);
        if(root==null){
            root=don;
            return;
        }
        else{
            Node temp=root;
            while(true){
                if(don.data<temp.data){
                    if(temp.left!=null){
                        temp=temp.left;
                        
                    }
                    else{
                    temp.left=don;
                    break;
                    }
                }
                else{
                   if(temp.right!=null){
                        temp=temp.right;
                        
                    }
                    else{
                    temp.right=don;
                    break;
                    }
                }
            }
        }
    }
    public void pre(Node root){
        if(root!=null){
            System.out.print(root.data+" ");
            pre(root.left);
            pre(root.right);
        }
    }
    public void post(Node root){
        if(root!=null){
            pre(root.left);
            pre(root.right);
            System.out.print(root.data+" ");
        }
    }
    public void in(Node root){
         if(root!=null){
            pre(root.left);
            System.out.print(root.data+" ");
            pre(root.right);
        }
    }
}
class Main {
    public static void main(String[] args) {
        Tree t=new Tree();
        t.insert(100);
        t.insert(70);
        t.insert(110);
        t.insert(11);
        t.insert(85);
        t.insert(105);
        t.insert(123);
        t.insert(7);
        t.insert(93);
        t.insert(18);
        t.insert(114);
        t.insert(115);
        t.insert(116);
        
        t.pre(t.root);
        System.out.println();
        t.post(t.root);
        System.out.println();
        t.in(t.root);
    }
}
