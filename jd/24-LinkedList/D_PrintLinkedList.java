public class D_PrintLinkedList {

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

    public void addFirst(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);

        if (head == null) {
            head = tail = newNode;
            return;
        }

        tail.next = newNode;
        tail = newNode;
    }

    public void printLinkedList() {
        Node temp = head;

        if (temp == null) {
            System.out.println("LinkedList is empty");
            return;
        }
        while (temp != null) {
            System.out.print(temp.data + "->");
            temp = temp.next;

        }
        System.out.println("null");

    }

    public static void main(String[] args) {
        D_PrintLinkedList ll = new D_PrintLinkedList();
        ll.printLinkedList();
        ll.addFirst(1);
        ll.printLinkedList();
        ll.addFirst(4);
        ll.addLast(9);
        ll.addLast(3);
        ll.printLinkedList();

    }
}
