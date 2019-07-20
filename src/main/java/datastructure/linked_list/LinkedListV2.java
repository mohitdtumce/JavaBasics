package datastructure.linked_list;

/*
 * Implementation of linked-list with pointer both at the beginning as well as end
 */
public class LinkedListV2 extends LinkedListV1 {

    protected Node tail;

    public LinkedListV2() {
        super();
        this.tail = null;
    }

    // Method to push element to the front of the linked-list
    @Override
    public void pushFront(int data) {
        Node newNode = new Node(data);
        if (this.head == null) {
            this.head = this.tail = newNode;
        } else {
            newNode.next = this.head;
            this.head = newNode;
        }
    }

    // Method to push element to the back of the linked-list
    @Override
    public void pushBack(int data) {
        Node newNode = new Node(data);
        if (this.tail == null) {
            this.head = this.tail = newNode;
        } else {
            this.tail.next = newNode;
            this.tail = this.tail.next;
        }
    }

    @Override
    public void popFront() {
        if (this.head == null)
            return;

        if (this.head.next == null) {
            this.head = this.tail = null;
        }
        this.head = this.head.next;
    }

    @Override
    public void popBack() {
        if (this.head == null)
            return;

        if (this.head.next == null) {
            this.head = this.tail = null;
        }

        Node ptr = this.head;
        while (ptr.next != this.tail) {
            ptr = ptr.next;
        }

        this.tail = ptr;
    }
}
