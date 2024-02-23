
//Andres Ramos
//Chpt4 PA
public class LinkedListTester{
    public static void main(String []args){

        //create new Linked List with default constructor
        LinkedList linkedList = new LinkedList();

        //call method to create and initialize nodes 
        initializeNodes(linkedList);

        //call method to run through the linked list executing each instruction
        listOperations(linkedList);

        //display searched nodes 
        displaySearch(linkedList);

        //use sumDataValues to calculat the sum of the values in list and store in sum 
        int sum = linkedList.sumDataValues();
        System.out.println("The sum of the data values is: " + sum);
    
    }

    //private mehtod to create and initialize nodes in list 
    private static void initializeNodes(LinkedList linkedList){
        Node node1 = new Node(1);
        linkedList.listAppend(node1);

        Node node2 = new Node(2);
        linkedList.listAppend(node2);

        Node node3 = new Node(3);
        linkedList.listPrepend(node3);

        //use .getHead() to insert node4 after the head
        Node node4 = new Node(4);
        linkedList.listInsertAfter(linkedList.getHead(), node4);    

        Node node5 =  new Node(5);
        linkedList.listAppend(node5);

        Node node6 = new Node(6);
        linkedList.listInsertAfter(node4, node6);

        Node node7 = new Node(7);
        linkedList.listInsertAfter(node2, node7);
    }

    //private method to display searched nodes
    private static void displaySearch(LinkedList linkedList){
        //search for node5
        if(linkedList.listSearch(5) != null){
            System.out.println("Node with data 5 was found");
        } else{
            System.out.println("Node with data 5 was not found");
        }

        //search for node2
        if(linkedList.listSearch(2) != null){
            System.out.println("Node with data 2 was found");
        } else{
            System.out.println("Node with data 2 was not found");
        }
    }

    //private mehtod to run through list and execute instructions
    private static void listOperations(LinkedList linkedList){
        //display list 
        linkedList.listTraverse();

        //remove head
        linkedList.listRemoveNodeAfter(null);

        //remove node after node7
        linkedList.listRemoveNodeAfter(linkedList.listSearch(7));   //use listSearch() to find node7

        //display list 
        linkedList.listTraverse();
    }
}
        
        