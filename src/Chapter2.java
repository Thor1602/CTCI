public class Chapter2 {
    public static void main(String[] args) {
        linkedList ll = new linkedList();
        ll.add(5);
        ll.add(50);
        ll.add(500);
        ll.add(5000);
        ll.add(50000);
        ll.print();
        ll.removeLast();
        ll.print();
        ll.removeValue(50);
        ll.print();
    }
}
class Node {
    Node prev;
    Node next;
    int data;
    Node(int d){
        data=d;
    }
}
class linkedList{
    Node head = null;
    void add (int d){
        Node nNode = new Node(d);
        if (head == null){
            head = nNode;
        }
        else{
            Node tNode = head;
            while (tNode.next != null){
                tNode = tNode.next;
            }
            tNode.next = nNode;
            tNode.prev = tNode;
        }
    }
    void print (){
            Node tempN = head;
            while (tempN != null){

                System.out.println(tempN.data);
                tempN = tempN.next;
            }
    }
    void removeLast (){

        Node tempN = head;
        while (tempN.next.next != null) {
            tempN = tempN.next;
        }
        tempN.next = null;
    }

    void removeValue (int v){
        if (head == null) {
            return; // Empty list, nothing to remove
        }

        if (head.data == v) {
            head = head.next; // Remove the first node
            return;
        }

        Node tempN = head;
        while (tempN.next != null && tempN.next.data != v) {
            tempN = tempN.next;
        }

        if (tempN.next != null) {
            tempN.next = tempN.next.next; // Update next reference to skip the node
        }
    }
}
