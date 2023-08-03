import java.util.Objects;

public class LinkedList<T> {
    Node node = new Node();
    private int size=0;
    private class Node{
        Node() {}
        Node(T t) {
            this.val=t;
        }
        private T val;
        public Node prev;
        public Node next;
    }

    private void setSize(int size) {}

    public int size() {
        return size;
    }

    public LinkedList() {}
    public boolean add(T t){
        Node add = new Node(t);
        if(node.val==null){
            node=add;
            size++;
        }else {
            Node cur = node;
            while (true) {
                if(cur.next==null){
                    cur.next=add;
                    add.prev=cur;
                    size++;
                    return true;
                }else {
                    cur=cur.next;
                }
            }
        }
        return false;
    }
    public boolean remove(T t){
        if(node.val.equals(t)){
            node.next.prev=null;
            size--;
        }else {
            Node cur=node.next;
            while (true){
                if(cur.val.equals(t)){
                    if(cur.next==null){
                        cur.prev.next=null;
                    }else {
                        cur.prev.next=cur.next;
                    }
                    size--;
                    return true;
                }else {
                    cur=cur.next;
                }
            }
        }
        return false;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        Node tos = new Node();
        tos=node;
        while (true) {
            if(tos != null) {
                sb.append(tos.val).append(", ");
                tos = tos.next;
            }else {
                break;
            }
        }
        return "["+sb+"]";
    }
}
