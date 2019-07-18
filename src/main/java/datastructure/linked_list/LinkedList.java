package datastructure.linked_list;

import java.util.Stack;

public class LinkedList {

    Node head;

    public LinkedList() {
        this.head = null;
    }

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public int getData(Node node) {
        return node.data;
    }

    // Method to print linked-list
    public void printList() {
        Node temp = head;
        while (temp != null) {
            System.out.print(temp.data + " ");
            temp = temp.next;
        }
        System.out.println();
    }

    // Method to insert element at the front of linked-list
    public void pushFront(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    public void pushFrontList(int[] nums) {
        for (int num : nums) {
            pushFront(num);
        }
    }

    // Method to insert element at the back of linked-list
    public void pushBack(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = newNode;
        } else {
            Node temp = this.head;
            while (temp.next != null) {
                temp = temp.next;
            }
            temp.next = newNode;
        }
    }

    // Method to insert element at a given position
    public void insertion(int data, int position) {

        Node newNode = new Node(data);

        if (this.head == null) {
            this.head = newNode;
        } else {
            if (position <= 0)
                return;
            else if (position == 1) {
                newNode.next = this.head;
                this.head = newNode;
            } else {
                Node p = this.head;
                Node q = p;
                int count = 1;
                while (p != null && count < position) {
                    q = p;
                    p = p.next;
                    count++;
                }

                if (p == null) {
                    q.next = newNode;
                } else {
                    newNode.next = p;
                    q.next = newNode;
                }
            }
        }
    }

    // Method to delete element from the front of linked-list
    public void popFront() {
        if (this.head != null)
            this.head = this.head.next;
    }

    // Method to delete element from the back of linked-list
    public void popBack() {
        if (this.head == null)
            return;
        else if (this.head.next == null)
            this.head = null;
        else {
            Node p = this.head;
            Node q = p;
            while (p.next != null) {
                q = p;
                p = p.next;
            }

            q.next = null;
        }
    }

    // Method to delete a node by given key
    public void deletionByGivenKey(int data) {
        Node p = this.head;
        Node q = p;
        while (p != null && p.data != data) {
            q = p;
            p = p.next;
        }

        if (p == null)
            return;
        else if (p == this.head) {
            this.head = this.head.next;
        } else {
            q.next = p.next;
        }
    }

    // Method to delete a node by given position
    public void deletionByGivenPosition(int position) {
        if (this.head == null)
            return;
        else {
            if (position <= 0)
                return;
            else if (position == 1) {
                this.head = this.head.next;
            } else {
                int count = 1;
                Node p = this.head;
                Node q = p;
                while (p != null && count < position) {
                    q = p;
                    p = p.next;
                    count++;
                }

                if (p != null) {
                    q.next = p.next;
                }
            }
        }
    }

    // Method to delete linked-list
    public void deleteLinkedList() {
        this.head = null;
    }

    // Method (iterative) to find the length of linked-list
    public int length() {
        Node ptr = this.head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    // Method (recursive) to find the length of linked-list
    public int lengthRecursive() {
        Node p = this.head;
        return lengthRecursiveHelper(p);
    }

    private int lengthRecursiveHelper(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + lengthRecursiveHelper(node.next);
    }

    // Method to search for an element in linked-list
    public boolean search(int data) {
        Node p = this.head;
        while (p != null && p.data != data)
            p = p.next;

        return (p != null);
    }

    // Method (recursive) to search for an element in linked-list
    public boolean searchRecursive(int data) {
        Node p = this.head;
        return searchRecursiveHelper(p, data);
    }

    private boolean searchRecursiveHelper(Node node, int data) {
        if (node == null)
            return false;
        return ((node.data == data) || searchRecursiveHelper(node.next, data));
    }

    // Method to get nth node of linked-list
    public Node getNthNode(int n) {
        if (this.head == null)
            throw new RuntimeException("LinkedList Empty");
        else {
            Node ptr = this.head;
            int count = 1;
            while (ptr != null && count < n) {
                ptr = ptr.next;
                count++;
            }

            if (ptr == null)
                throw new IllegalArgumentException(n + "th element doesn't exist");
            else
                return ptr;
        }
    }

    // Method to get nth node from the end of linked-list
    public Node getNthNodeFromEnd(int n) {
        if (n <= 0)
            throw new IllegalArgumentException("n should always be > 0");

        Node fastPtr = this.head;
        int count = 0;
        while (fastPtr != null && count < n) {
            fastPtr = fastPtr.next;
            count++;
        }

        if (count < n)
            throw new IllegalArgumentException("No such element exists");

        Node slowPtr = this.head;
        while (fastPtr != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next;
        }
        return slowPtr;
    }

    // Method to find the middle node of linked-list
    public Node getMiddleNode() {
        if (this.head == null)
            throw new RuntimeException("LinkedList Empty");
        if (this.head.next == null)
            return this.head;
        Node fastPtr = this.head;
        Node slowPtr = fastPtr;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;
        }

        return slowPtr;
    }

    // Method (iterative) to count the frequency of an element in linked-list
    public int count(int data) {
        Node ptr = this.head;
        int count = 0;
        while (ptr != null) {
            count++;
            ptr = ptr.next;
        }
        return count;
    }

    // Method (recursive) to count the frequency of an element in linked-list
    public int countRecursive() {
        Node ptr = this.head;
        return countRecursiveHelper(ptr);
    }

    private int countRecursiveHelper(Node node) {
        if (node == null)
            return 0;
        else
            return 1 + countRecursiveHelper(node.next);
    }

    public void createLoop(int position) {
        Node ptr = this.head;
        int count = 1;
        while (ptr != null && count < position) {
            ptr = ptr.next;
            count++;
        }
        Node qtr = ptr;
        while (ptr.next != null) {
            ptr = ptr.next;
        }
        ptr.next = qtr;
    }

    // Method to detect a loop in linked-list
    public boolean detectLoop() {
        Node fastPtr = this.head;
        Node slowPtr = fastPtr;
        while (slowPtr != null && fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr)
                return true;
        }
        return false;
    }

    // Method to find the length of loop in linked-list
    public int findLengthOfLoop() {
        Node fastPtr = this.head;
        Node slowPtr = fastPtr;
        boolean present = false;
        while (fastPtr != null && fastPtr.next != null) {
            slowPtr = slowPtr.next;
            fastPtr = fastPtr.next.next;

            if (slowPtr == fastPtr) {
                present = true;
                break;
            }
        }

        if (!present)
            return 0;
        else {
            int count = 1;
            slowPtr = slowPtr.next;
            while (slowPtr != fastPtr) {
                System.out.print(slowPtr.data + " ");
                slowPtr = slowPtr.next;
                count++;
            }
            return count;
        }
    }

    // Method (recursive) to check if linked-list is palindrome
    Node left;

    public boolean isPalindrome() {
        left = this.head;
        Node right = this.head;
        return isPalindromeHelper(right);
    }

    private boolean isPalindromeHelper(Node right) {
        if (right == null)
            return true;
        boolean flag = isPalindromeHelper(right.next);
        if (!flag)
            return false;
        if (left.data != right.data)
            return false;
        else {
            left = left.next;
            return true;
        }
    }

    // Method (Stack) to check if linked-list is palindrome
    public boolean isPalindrome1() {
        Stack<Integer> S = new Stack<>();
        Node ptr = this.head;
        while (ptr != null) {
            S.push(ptr.data);
            ptr = ptr.next;
        }

        ptr = this.head;
        while (ptr != null) {
            if (S.size() == 0)
                return false;
            if (S.peek() != ptr.data)
                return false;
            S.pop();
            ptr = ptr.next;
        }
        return true;
    }

////    Method (reverse ll) to check if linked-list is palindrome
//    public boolean isPalindrome2() {
//        Node ptr = this.head;
//        Node qtr = ptr;
//        Node str = ptr;
//        while (ptr != null) {
//            ptr = ptr.next;
//            if (ptr != null) {
//                qtr = qtr.next;
//                ptr = ptr.next;
//            }
//        }
//        qtr.next = reverse(qtr.next);
//        ptr = qtr;
//        while (ptr != null && str != qtr) {
//            if (ptr.data != str.data)
//                return false;
//
//            ptr = ptr.next;
//            str = str.next;
//
//            if (ptr == null && str == null)
//                return true;
//        }
//        return false;
//    }

    private Node reverse(Node ptr) {
        Node curr = ptr;
        Node next = null;
        Node prev = null;

        while (ptr != null) {
            next = ptr.next;
            ptr.next = prev;
            prev = curr;
            curr = next;
        }
        return prev;
    }
}
