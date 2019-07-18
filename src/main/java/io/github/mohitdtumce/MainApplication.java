package io.github.mohitdtumce;

import leetcode.*;
import datastructure.linked_list.*;

import java.lang.*;

public class MainApplication {

    public static void main(String[] args) throws Exception {
        LinkedList linkedList = new LinkedList();
        int [] nums = {1, 2, 4, 3, 1};
        linkedList.pushFrontList(nums);
        linkedList.printList();
        System.out.println(linkedList.isPalindrome2());
    }
}

