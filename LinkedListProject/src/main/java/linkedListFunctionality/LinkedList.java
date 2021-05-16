package linkedListFunctionality;

public class LinkedList {
    
    private Node head;
    
    public Node getHead() {
        return head;
    }
    
    public void insert(Node n) {
        
        if(head == null) {
            head = n;
            return;
        }
        
        Node temp = head;
        
        while(temp.getNextNode() != null) temp = temp.getNextNode();
        
        temp.setNextNode(n);
    }
    
    public boolean deleteNode(int id) {
    
        if(head == null) {
            System.out.println("List is empty, no objects to delete.");
            return false;
        } else if(head.getID() == id) {
            head = head.getNextNode();
            return true;
        }
        
        Node prev = head;
        Node temp = head.getNextNode();
        
        while(temp.getNextNode() != null) {
        
            if(temp.getID() == id) {
                prev.setNextNode(temp.getNextNode());
                return printDeletedNode(temp);
            } else {
                prev = temp;
                temp = temp.getNextNode();
            }
        }
        
        if(temp.getID() == id){
            prev.setNextNode(null);
            return printDeletedNode(temp);
        } 
        
        System.out.println("Could not find node with id " + id);
        return false;
    }
    
    private boolean printDeletedNode(Node temp){
        
        System.out.println("Deleted node:");
        temp.printNode();
        return true;
    }
    
    public void printLinkedList() {
    
        if(head == null) {
            System.out.println("List is empty");
            return;
        }
        
        Node temp = head;
        
        System.out.println("List of People:");
        
        while(temp.getNextNode() != null) {
            temp.printNode();
            temp = temp.getNextNode();
        }
        
        temp.printNode();
    }
    
}
