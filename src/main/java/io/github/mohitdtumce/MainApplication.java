package io.github.mohitdtumce;

import leetcode.*;
import datastructure.linked_list.*;

import java.lang.*;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        linkedList.pushFront(1);
        linkedList.pushFront(2);
        linkedList.pushFront(3);
        linkedList.pushBack(0);
        linkedList.pushBack(-1);
        linkedList.insertion(5, 1);
        linkedList.insertion(-2, 7);
        linkedList.insertion(4, 2);
        linkedList.printList();

    }
}

