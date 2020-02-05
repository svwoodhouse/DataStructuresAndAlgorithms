package binarysearchtrees;

public class Tree {
    
    private TreeNode root;
    
    public void insert(int value) {
        if(root == null)
            root = new TreeNode(value);
        
        else
            root.insert(value);
    }
    
    public void traverseInOrder() {
        if(root!=null)
            root.traverseInOrder();
    }
    
    public int min() {
        if(root == null)
            return Integer.MIN_VALUE;
        else
            return root.min();
    }
    
    public int max() {
        if(root == null)
            return Integer.MAX_VALUE;
        else
            return root.max();
    }
    
    public TreeNode get(int value) {
        if(root!= null) 
            return root.get(value);
        
        return null;  
    }
    
    public void delete(int value) {
        root = delete(root, value);
    }
    
    private TreeNode delete(TreeNode subtreeRoot, int value) {
        if(subtreeRoot == null)
            return subtreeRoot;
        
        if(value < subtreeRoot.getData()) {
            subtreeRoot.setLeftChild(delete(subtreeRoot.getLeftChild(), value));
        }
        
        else if(value > subtreeRoot.getData()) {
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), value));
        }
        
        // If the value we were searching for is found
        else {
            // Cases 1 and 2: node to delete has 0 or 1 child(ren)
            // If the node has only the right child, the right child will replace the node
            // Can also be used if the node is a leaf meaning it has no right or left child
            if(subtreeRoot.getLeftChild() == null) {
                return subtreeRoot.getRightChild();
            }
            // If the node only has the left child, then the left child will replace the node
            else if(subtreeRoot.getRightChild() == null) {
                return subtreeRoot.getLeftChild();
            }
            
            // Case 3: Node to delete has two children
            // Replaces the int value to the value of the smallest value in the right subtree
            subtreeRoot.setData(subtreeRoot.getRightChild().min());
            
            // This deletes the node that had the smallest value in the right subtree
            subtreeRoot.setRightChild(delete(subtreeRoot.getRightChild(), subtreeRoot.getData()));
        }
        
        // If we make it to this statement it means this node is not the node needed for 
        // deletion
        return subtreeRoot;
    }
}
