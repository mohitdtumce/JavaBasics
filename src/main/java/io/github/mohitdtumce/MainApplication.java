package io.github.mohitdtumce;

import datastructure.linked_list.*;

import java.lang.*;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        LinkedListV2 a = new LinkedListV2();
        a.pushBack(1);
        a.pushBack(2);
        a.pushBack(3);
        a.pushBack(4);
        a.printList();
        LinkedListV2 b = new LinkedListV2();
        b.pushBack(3);
        b.pushBack(4);
        b.pushBack(5);
        b.printList();
        LinkedListV2 result = LinkedListUtility.intersectionSortedLinkedList(a, b);
        result.printList();
    }
}