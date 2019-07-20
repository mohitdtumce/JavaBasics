package datastructure.linked_list;

public interface LinkedList {

    static class Node {
        int data;
        Node next;

        Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public void pushFront(int data);

    public void pushBack(int data);

    public void popFront();

    public void popBack();

    public int length();

    public void printList();
}
