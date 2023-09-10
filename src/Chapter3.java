public class Chapter3 {
    public static void main(String[] args) {

    }

}
class ExampleStack<T>{
    private static class Node<T>{
        private final T data;
        private Node<T> next;

        public Node(T data){
            this.data=data;
        }
    }
    private Node<T> top;
    void push(T data){
        Node<T> tNode = new Node<>(data);
// memorise
        tNode.next = top;
        top = tNode;
    }
    boolean isEmpty(){
        return top==null;
    }
    T pop(){
        T element = null;
        if (top!= null){
            element = top.data;
            top=top.next;
        }
        return element;
    }
    T peek(){
        if (top!= null) {
            return top.data;
        }
        else {
            return null;
        }
    }
}
class ExampleQueue<T>{
    private static class Node<T>{
        private final T data;
        private Node<T> next;

        public Node(T data){
            this.data=data;
        }
    }
    private Node<T> first;
    private Node<T> last;

    void queue(T data){
        Node <T> tNode = new Node<>(data);

    }
    boolean isEmpty(){
        return first==null;
    }
    T dequeue(){
        T element = null;
        if (first!= null){
            element = last.data;
            last=null;
        }
        return element;
    }
    T peek(){
        if (first!= null) {
            return first.data;
        }
        else {
            return null;
        }
    }
}