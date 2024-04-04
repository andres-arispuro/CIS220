

class BinarySearchTree {
	private Node root;
   
	public BinarySearchTree() {
		root = null;
	}
   
	public Node getRoot() {
		return root;
	}
   
	public Node search(int desiredKey) {
		System.out.println("\nSearching for node " + desiredKey);
		Node currentNode = root;
		while (currentNode != null) {
			// Return the node if the key matches
			if (currentNode.key == desiredKey) {
				return currentNode;
			}
 			// Navigate to the left if the search key is 
			// less than the node's key.
			else if (desiredKey < currentNode.key) {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s left child");   
				currentNode = currentNode.left;
			}
			// Navigate to the right if the search key is 
			// greater than the node's key.
			else {
				System.out.print("\nDid not find node, navigating to node " + currentNode.key + "'s right child");         
				currentNode = currentNode.right;
			}
		}
		// The key was not found in the tree.
		return null;
	}
   
	public void insert(Node node) {
		System.out.println("Inserting node " + node.key);
		// Check if tree is empty
		if (root == null) {
			root = node;
			System.out.println("Inserted node " + node.key + " as the root node.\n");
		} else {
			Node currentNode = root;
			while (currentNode != null) {
				if (node.key < currentNode.key) {
					// If no left child exists, add the new node
					// here; otherwise repeat from the left child.
					System.out.println("Checking node " + currentNode.key + " for left child.");
					if (currentNode.left == null) {
						System.out.println("Inserting node " + node.key + " as left child of node " + currentNode.key +".\n");
						currentNode.left = node;
						currentNode = null;
					} else {
						currentNode = currentNode.left;
						System.out.println("Traversed to left child node " + currentNode.key +".");
					}
				} else {
					// If no right child exists, add the new node
					// here; otherwise repeat from the right child.
					System.out.println("Checking node " + currentNode.key + " for right child.");
					if (currentNode.right == null) {
						System.out.println("Inserting node " + node.key + " as right child of node " + currentNode.key +".\n");  
						currentNode.right = node;
						currentNode = null;
					} else {
						currentNode = currentNode.right;
						System.out.println("Traversed to right child node " + currentNode.key +".");
					}
				}
			}
		}
	}
   
	public boolean remove(int key) {
		// Implement method based on remove algorithm found in Figure 7.6.1
		
		Node parent = null;
		Node current = root;
		Node successor = null;

		while(current != null && current.key != key){
			parent = current;
			if(key < current.key){
				current = current.left;
			} else{
				current = current.right;
			}
		}

		if(current == null){
			System.out.println("Node " + key + " was not found");
			return false;
		}

		//Case 1: 
		if(current.left == null && current.right == null){
			if(current != root){
				if(parent.left == current){
					parent.left =null;
				} else{
					parent.right = null;
				}
			} else{
				root = null;
			} 
			System.out.println("Leaf Node " + key + " was removed");
		}

		//Case 2:
		else if(current.left == null){
			if(current != root){
				if(parent.left == current){
					parent.left = current.right;
				} else{
					parent.right = current.right;
				} 
			}else{
				root = current.right;
			}
			System.out.println("Node " + key + " with a right and a left child was removed");
		}

		//Case 3:
		else if(current.right == null){
			if(current != root){
				if(parent.left == current){
					parent.left = current.left;
				} else{
					parent.right = current.left;
				}
			} else{
				root = current.left;
			}
			System.out.println("Node " + key + " with only left child removed");
		}

		//Case 4:
		else{
			successor = current.right;
			Node successorParent = current;
			while(successor.left != null){
				successorParent = successor;
				successor = successor.left;
			}
			if(successor != current.right){
				successorParent.left = successor.right;
				successor.right = current.right;
			}
			successor.left = current.left;
			if(current != root){
				if(parent.left == current){
					parent.left = successor;
				} else{
					parent.right = successor;
				}
			} else{
				root = successor;
			}
			System.out.println("Node " + key + " with both left and right child removed");
		}

		return true;
	}
		
	 
}
