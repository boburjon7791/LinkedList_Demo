public class Main {
    public static void main(String[] args) {
        LinkedList<Integer> linkedList = new LinkedList<>();
        linkedList.add(45);
        linkedList.add(46);
        linkedList.add(48);
        linkedList.add(44);
        linkedList.add(41);
        linkedList.add(30);
        linkedList.add(42);
        System.out.println(linkedList.size());
        linkedList.remove(41);
        System.out.println(linkedList.size());
        linkedList.remove(42);
        System.out.println(linkedList.size());
        System.out.println(linkedList);
    }
}
