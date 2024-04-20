public class M_deleteNthFromEnd {

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
    public static int size;

    public void addFirst(int data) {
        Node newNode = new Node(data);
        size++;
        if (head == null) {
            head = tail = newNode;
            return;
        }

        newNode.next = head;
        head = newNode;
    }

    public void addLast(int data) {
        Node newNode = new Node(data);
        size++;

        if (head == null) {
            head = tail = newNode;
            return;
        }
        tail.next = newNode;
        tail = newNode;
    }

    public void print() {
        Node temp = head;

        if (temp == null) {
            System.out.println("LL is empty");
            return;
        }

        while (temp != null) {
            System.out.print(temp.data + " -> ");
            temp = temp.next;

        }
        System.out.println("null");
    }

    public void add(int idx, int data) {
        if (idx == 0) {
            addFirst(data);
            return;
        }

        Node newNode = new Node(data);
        size++;

        Node temp = head;

        int i = 0;

        while (i < idx - 1) {
            temp = temp.next;
            i++;
        }
        newNode.next = temp.next;
        temp.next = newNode;
    }

    public int removeFirst() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        int val = head.data;
        head = head.next;
        size--;
        return val;
    }

    public int removeLast() {
        if (size == 0) {
            System.out.println("LinkedList is empty");
            return Integer.MIN_VALUE;
        } else if (size == 1) {
            int val = head.data;
            head = tail = null;
            size = 0;
            return val;
        }

        Node prev = head;
        for (int i = 0; i < size - 2; i++) {
            prev = prev.next;
        }
        int val = prev.next.data;
        prev.next = null;
        tail = prev;
        size--;
        return val;
    }

    public void deleteAtIndex(int index) {
        if (index < 0 || index >= size)
            return;

        if (index == 0) {
            head = head.next;
            size--;
            if (head == null)
                tail = null;
            return;
        }

        Node temp = head;
        for (int i = 0; temp != null && i < index - 1; i++) {
            temp = temp.next;
        }

        if (temp == null || temp.next == null)
            return;

        Node nextNode = temp.next.next;
        temp.next = nextNode;
        size--;
        if (nextNode == null)
            tail = temp;
    }

    public int searchIterative(int key) {
        Node temp = head;
        int i = 0;

        while (temp != null) {
            if (temp.data == key) {
                return i;
            }
            temp = temp.next;
            i++;
        }

        return -1;
    }

    // Search recursive
    public int helper(Node head, int key) {
        if (head == null) {
            return -1;
        }
        if (head.data == key) {
            return 0;
        }
        int idx = helper(head.next, key);
        if (idx == -1) {
            return -1;
        }
        return idx + 1;
    }

    public int searchRecursive(int key) {
        return helper(head, key);
    }

    // reverse linked list

    public void reverseLinkedList() {
        Node prev = null;
        Node cur = tail = head;
        Node next;

        while (cur != null) {
            next = cur.next;
            cur.next = prev;
            prev = cur;
            cur = next;
        }
        head = prev;
    }

    public void deleteNthFrom(int n) {
        // calculate size
        int sz = 0;
        Node temp = head;
        while (temp != null) {
            temp = temp.next;
            sz++;
        }

        // delete head if one element
        if (n == sz) {
            head = head.next;
            return;
        }

        // find nth node from the end of the list

        // sn - n
        int i = 1;
        int iToFind = sz - n;
        Node toDelete = head; // toDelete or prev
        while (i < iToFind) {
            toDelete = toDelete.next;
            i++;
        }
        // set next of previous node as the
        toDelete.next = toDelete.next.next;
        return;
    }

    public static void main(String[] args) {
        M_deleteNthFromEnd ll = new M_deleteNthFromEnd();
        ll.addFirst(1);
        ll.addFirst(0);
        ll.print();

        ll.addLast(4);
        ll.addLast(6);
        ll.addLast(11);
        ll.addLast(47);

        ll.print();

        ll.add(2, 15);
        ll.print();

        System.out.println(ll.size);

        ll.removeFirst();
        ll.print();
        ll.removeLast();
        ll.print();
        ll.deleteAtIndex(1);
        ll.print();

        // Searching
        System.out.println("Searching with iterative: " + ll.searchIterative(4));
        System.out.println("Searching with recursive: " + ll.searchIterative(11));
        ll.print();
        ll.reverseLinkedList();
        ll.print();

        System.out.println("delete 2nd element");
        ll.deleteNthFrom(2);
        ll.print();
    }
}