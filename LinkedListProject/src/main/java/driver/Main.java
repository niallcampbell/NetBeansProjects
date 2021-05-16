package driver;

import linkedListFunctionality.*;

public class Main {
    
    public static void main(String [] args) {
    
        LinkedList listOfPeople = new LinkedList();
        
        listOfPeople.insert(new Node("Niall"));
        listOfPeople.insert(new Node("John"));
        listOfPeople.insert(new Node("Chris"));
        listOfPeople.printLinkedList();
        
        listOfPeople.deleteNode(2);
        listOfPeople.printLinkedList();
        
        listOfPeople.insert(new Node("Pat"));
        listOfPeople.printLinkedList();
        
        listOfPeople.deleteNode(1);
        listOfPeople.deleteNode(3);
        listOfPeople.deleteNode(4);
        listOfPeople.printLinkedList();
        
    }
    
}
