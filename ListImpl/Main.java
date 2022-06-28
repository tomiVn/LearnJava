package ListsExc;

public class Main {
    public static void main(String[] args) {

        LinkList n = new LinkList();

        n.insert(23);
        n.insert(7);
        n.insert(22222);
        n.insert(2);
        n.insert(22222);
        n.insert(8);

        n.sort();
        n.pnt();
        n.update(12345, 4);
        n.pnt();
    }
}

