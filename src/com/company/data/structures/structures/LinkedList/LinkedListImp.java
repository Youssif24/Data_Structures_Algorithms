package com.company.data.structures.structures.LinkedList;

public class LinkedListImp {

    Node head;

    public LinkedListImp(Node head) {
        this.head = head;
    }

    public void addNode(Node new_node)
    {
        new_node.next=head;
        head=new_node;
    }

    public void deleteFirst()
    {
        head=head.next;
    }

    public void displayNodes()
    {
        Node node=head;
        while (node != null)
        {
            System.out.println("Username: "+node.value.getUsername()+", age: "+node.value.getAge());
            node=node.next;
        }
    }
}
