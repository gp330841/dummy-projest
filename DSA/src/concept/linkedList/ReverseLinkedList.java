package concept.linkedList;

public class ReverseLinkedList {

    public static void main(String[] args) {
        Node head = new Node(0, null);
        Node curr = head;
        for (int i = 1; i <= 10; i++) {
            Node next = new Node(i, null);
            curr.next = next;
            curr = next;
        }
        Node reversedHead = reverse(head);
        LinkedListMain.printList(reversedHead);
    }

    static Node reverse(Node head) {
        Node prev = null;
        Node curr = head;
        while (curr != null) {
            Node next = curr.next;
            curr.next = prev;
            prev = curr;
            curr = next;
//            LinkedListMain.printList(prev);
//            LinkedListMain.printList(curr);
        }
        return prev;
    }
}
