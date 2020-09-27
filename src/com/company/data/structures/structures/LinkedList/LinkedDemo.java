package com.company.data.structures.structures.LinkedList;

import com.company.data.structures.models.User;
import java.util.LinkedList;

public class LinkedDemo {

    public static void main(String[] args) {

        LinkedListImp linkedList=new LinkedListImp(new Node(new User("Eric",20),null));
        linkedList.addNode(new Node(new User("Williams",27),null));
        linkedList.addNode(new Node(new User("Coady",36),null));
        linkedList.addNode(new Node(new User("Garcia",30),null));
        linkedList.displayNodes();

        System.out.println("After Delete an node");
        linkedList.deleteFirst();
        linkedList.displayNodes();


        /*built in linked list

        LinkedList<User> userLinkedList=new LinkedList<>();
        userLinkedList.add(new User("Fladia",23));
        userLinkedList.add(new User("Dest",21));
        userLinkedList.add(new User("Pedri",17));

        for (User user:userLinkedList) {
          System.out.println("username: "+user.getUsername()+", age: "+ user.getAge());
        }

        System.out.println("adding an node with index");
        userLinkedList.add(1,new User("Trincao",20));
        for (int i=0; i<userLinkedList.size(); i++) {
            System.out.println("username: "+userLinkedList.get(i).getUsername()+", age: "+ userLinkedList.get(i).getAge());
        }*/


    }
}
