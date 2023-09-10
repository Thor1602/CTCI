public class Chapter4 {
    public static void main(String[] args) {

    }

}

class Graph {
    public Node[] nodes;
}

class tNode {
    public String name;
    public tNode[] children;

    tNode(tNode left, tNode right){
        children = new tNode[]{left, right};
    }
}
