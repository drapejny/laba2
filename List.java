public class List {
    public Node first;

    public void add(Node node) {
        Node current = first;
        Node prev = null;
        while (current != null && node.getValue() > current.getValue()) {
            prev = current;
            current = current.next;
        }
        if (prev == null)
            first = node;
        else
            prev.next = node;
        node.next = current;
    }

    public void delete(int value) {
        Node prev = null;
        Node current = first;
        while (current != null && value != current.getValue()) {
            prev = current;
            current = current.next;
        }
        if (prev == null)
            first = first.next;
        else
            prev.next = current.next;
    }

    public Node find(int value) {
        Node current = first;
        while (current != null && current.getValue() <= value) {
            if (current.getValue() == value)
                return current;
            current = current.next;
        }
        return null;
    }
    public void print(){
        Node current = first;
        while(current != null){
            System.out.print(current.getWord() + " ");
            current = current.next;
        }
    }
}
