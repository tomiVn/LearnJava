package ListsExc;

public class LinkList {

    Node head;

    public void insert(int data) {

        Node node = new Node();
        node.data = data;
        node.next = null;

        if (head == null) {
            head = node;
        } else {
            Node n = head;
            while (n.next != null) {
                n = n.next;
            }
            n.next = node;
        }
    }

    public void pnt() {
        Node node = head;
        while (node.next != null) {
            System.out.println(node.data);
            node = node.next;
        }
        System.out.println(node.data);
    }

    public void update(int num, int index) {
        Node node = head;
        int count = -1;
        while (node.next != null) {
            count++;
            if (count == index) {
                node.data = num;
                break;
            }
            node = node.next;
        }
    }

    public void sort() {

        boolean isSorted = false;

        while (!isSorted){
            boolean currentCheck = true;

            Node node = head;
            while (node.next != null) {
                int a = node.data;
                int b = node.next.data;
                if (a > b) {
                    node.data = b;
                    node.next.data = a;
                    currentCheck = false;
                }
                node = node.next;
            }
            isSorted = currentCheck;

        }
    }
}

