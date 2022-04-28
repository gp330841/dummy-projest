package concept.linkedList;

import java.util.StringJoiner;

class Node {
    Integer data;
    Node next;

    public Node(Integer data, Node next) {
        this.data = data;
        this.next = next;
    }

    @Override
    public String toString() {
        return new StringJoiner("-> ", "[", "]")
                .add("data=" + data)
                .add("nextNode=" + (next==null?"null": next.hashCode()))
                .toString();
    }
}
