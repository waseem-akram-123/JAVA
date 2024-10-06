public class LL {
    Node head;

    class Node {
        String data;
        Node next;

        Node (String data){
            this.data = data;
            this.next = null;
        }
    }
    // add first

    public void addFirst (String data){
        Node newNode = new Node (data);

        if (head == null){
            head = newNode;
            return;
        }
        newNode.next = head;
        head = newNode;
    }
    // add last

    public void addLast (String data){
        Node newNode = new Node (data);

        if (head == null){
            head = newNode;
            return;
        }
        Node currNode = head;
        while (currNode.next != null){
            currNode = currNode.next;
        }
        currNode.next = newNode;
    }
    // print list
    public void printList (){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node currNode = head;
        while (currNode != null){
            System.out.print(currNode.data + "->");
            currNode = currNode.next;
        }
        System.out.println("null");
    }
    // delet first

    public void removeFirst (){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        head = head.next;
    }
    // delete last

    public void removeLast (){
        if (head == null){
            System.out.println("list is empty");
            return;
        }
        Node secondLast = head;
        Node lastNode = head.next;

        if (head.next == null){
            head = null;
        }

        while (lastNode.next != null){
            lastNode = lastNode.next;
            secondLast = secondLast.next;
        }
        secondLast.next = null;
    }
    // reverse the linked list

    public void reverseIterate (){
        if (head == null || head.next == null){
            return;
        }
        Node prevNode = head;
        Node currNode = head.next;

        while (currNode != null){
            Node nextNode = currNode.next;

            currNode.next = prevNode;

            // update
            prevNode = currNode;
            currNode = nextNode;
        }
        head.next = null;
        head = prevNode;
    }
    public static void main(String[] args) {
        
        LL list = new LL();

        list.addFirst("a");
        list.addFirst("is");
        list.addLast("Linked");
        list.addFirst("this");
        list.addLast("List");
        list.printList();

        list.reverseIterate();
        list.printList();



    }
}
