package datastructure.linked_list;

public class LinkedListUtility {
    public static LinkedListV2 intersectionSortedLinkedList(LinkedListV2 linkedList1, LinkedListV2 linkedList2) {
        if (linkedList1.length() == 0)
            return linkedList2;
        else if (linkedList2.length() == 0)
            return linkedList1;
        else {
            LinkedListV2 result = new LinkedListV2();
            LinkedListV2.Node ptr = linkedList1.head;
            LinkedListV2.Node qtr = linkedList2.head;
            while (ptr != null && qtr != null) {
                if (ptr.data < qtr.data) {
                    ptr = ptr.next;
                } else if (ptr.data > qtr.data) {
                    qtr = qtr.next;
                } else {
                    result.pushBack(qtr.data);
                    ptr = ptr.next;
                    qtr = qtr.next;
                }
            }
            return result;
        }
    }
}
