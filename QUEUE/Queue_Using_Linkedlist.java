public class Queue_Using_Linkedlist {
    static class Node {
        int data;
        Node next;

        public Node (int data){
            this.data = data;
            this.next = null;
        }
    }
    static class Queue {
        static Node head = null;
        static Node tail = null;

        public static boolean isEmpty (){
            return head == null && tail == null;
        }

        // enqueue
        public static void add (int data){
            Node newNode = new Node (data);
            
            if (tail == null){
                head = tail = newNode;
                return;
            }
            tail.next = newNode;
            tail = newNode;
        }

        // dequeue
        public static int remove (){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            if (head == tail){
                tail = null;
            }
            int front = head.data;
            head = head.next;
            return front;
        }

        //peek
        public static int peek (){
            if (isEmpty()){
                System.out.println("queue is empty");
                return -1;
            }
            return head.data;
        }
    }


    public static void main(String[] args) {

        Queue q = new Queue ();
        q.add (1);
        q.add (2);
        q.add (3);

        while (!q.isEmpty()){
            System.out.println(q.peek());
            q.remove();
        }
        
    }
}
