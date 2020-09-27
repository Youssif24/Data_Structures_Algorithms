package com.company.data.structures.structures.LinkedList;

import com.company.data.structures.models.User;

public class Node {

    User value;
    Node next;

    public Node(User value, Node node) {
        this.value = value;
        this.next = node;
    }
}
