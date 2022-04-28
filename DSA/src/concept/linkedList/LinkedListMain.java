package concept.linkedList;

import java.util.StringJoiner;

public class LinkedListMain {

    public static void main(String[] args) {
        Node head = createLinkedList();
        printList(head);
        printMiddleNode(head);
    }

    static Node createLinkedList() {
        Node head = new Node(0, null);
        Node curr = head;
        for (int i = 1; i <= 10; i++) {
            Node next = new Node(i, null);
            curr.next = next;
            curr = next;
        }
        return head;
    }

    static void printList(Node node) {
        StringJoiner stringJoiner = new StringJoiner("->");
        while (node != null) {
            stringJoiner.add(node.toString());
            node = node.next;
        }
        System.out.println(stringJoiner);
    }

    static void printMiddleNode(Node head) {
        Node slow = head;
        Node fast = head;
        while (fast != null && fast.next != null) {
            slow = slow.next;
            fast = fast.next.next;
        }
        System.out.println(slow);
    }
}

