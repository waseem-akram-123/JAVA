import java.util.LinkedList;

public class Using_collection_Frame_Work {
    public static void main(String[] args) {
        
        LinkedList <String> list = new LinkedList<>();

        list.addFirst("a");
        list.addFirst("is");
        list.addFirst("this");
        list.addLast ("list");

        // OR way to use addLast

        list.add ("of");
        list.add ("waseem");
        System.out.println(list);

        // size
        System.out.println(list.size());

        // get the values at each indices
        for (int i=0; i<list.size(); i++){
            System.out.print(list.get(i) + "->");
        }
        System.out.println("null");

        // delete first
        list.removeFirst();
        list.removeLast();
        System.out.println(list);

        list.remove(2);  // starts with 0 base index
        System.out.println(list);
    }
}
