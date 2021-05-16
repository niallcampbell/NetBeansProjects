package linkedListFunctionality;

public class Node {
    
    private static int numberOfNodes;
    private int id;
    private String data;
    private Node next;
    
    static {
        numberOfNodes = 0;
    }
    
    public Node(String data) {
    
        numberOfNodes++;
        id = numberOfNodes;
        this.data = data;
    }
    
    public void setNextNode(Node next) {
        this.next = next;
    }
    
    public String getData() {
        return data;
    }
    
    public int getID() {
        return id;
    }
    
    public Node getNextNode() {
        return next;
    }
    
    public void printNode() {
    
        System.out.println("Node ID: " + id);
        System.out.println("Data: " + data);
        System.out.println();
    }
}
