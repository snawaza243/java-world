public class B_AddFirst {
    public static class Node {
        int data;
        Node next;

        public Node(int data) {
            this.data = data;
            this.next = null;
        }
    }

    public static Node head;
    public static Node tail;

    public static void addFirst(int data) {
        Node newNode = new Node(data);
        if (head == null) {
            head = tail = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }

    // TC = O(1)

    public static void main(String[] args) {
        B_AddFirst ll = new B_AddFirst();
        ll.addFirst(1);
        ll.addFirst(2);


    }
}
