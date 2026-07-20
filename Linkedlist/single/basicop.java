import java.util.*;
public class basicop{

    static class Node{
        int data;
        Node next;

        Node(int data){
            this.data=data;
        }
    }

    Node head;

    void insertatbeggining(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        newnode.next=head;
        head=newnode;
    }

    void insertatend(int data){
        Node newnode=new Node(data);
        if(head==null){
            head=newnode;
            return;
        }
        Node curr=head;
        while(curr.next!=null){
            curr=curr.next;
        }
        curr.next=newnode;

    }

    void inseratpos(int data,int pos){
        Node newnode=new Node(data);
        Node curr=head;
        for(int i=0;i<pos-1;i++){
            curr=curr.next;
        }
        newnode.next=curr.next;
        curr.next=newnode;
    }

    void print(){
        Node curr=head;
        while(curr!=null){
            System.out.print(curr.data+"-->");
            curr=curr.next;
        }

    }
    public static void main(String[] args){
        basicop ll=new basicop();

        ll.insertatbeggining(10);
        ll.insertatend(20);
        ll.insertatend(30);
        ll.inseratpos(25,2);
        ll.print();
    }
}