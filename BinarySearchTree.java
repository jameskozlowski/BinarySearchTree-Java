import java.lang.ArrayStoreException;

/**
* The BinarySearchTree class implements an binary search tree(BST)
* 
* This version of a BST is a simple implementation for the purpose of fast binary search
* No logic is added to insure a balanced tree and there is no way to rearrange/delete the tree
*
* All objects add to the tree must Extend Comparable and be unique, any 2 objects that compare equal
* cannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.
*
* @author  James Kozlowski
* @version March 30, 2017
*/
public class BinarySearchTree<T extends Comparable<T>>
{
    /**
    * object stored in this tree node.
    */
    private T value;

    /**
    * Left side child tree
    */
    private BinarySearchTree<T> left;

    /**
    * Right side child tree
    */
    private BinarySearchTree<T> right;
    
    /**
    * This is the constructor that creats the binary tree root
    * @param valueIn the object to store in this tree node
    * @return Nothing.
    */
    public BinarySearchTree(T valueIn)
    {
        value = valueIn;
        left = null;
        right = null;
    }

    /**
    * Returns the object stored in this node 
    * @return the Object stored in this node.
    */
    public T getValue()
    {
        return value;
    }

    /**
    * Adds a object to the correct place in the tree
    *
    * No logic is added to insure a balanced tree  
    * Any 2 objects that compare equal cannot both exist in the tree. 
    * This may require you to implement some sort of hashing to the compareTo.
    *
    * @param valueIn the value to store in this tree node
    * @return Nothing.
    * @throws ArrayStoreException if the object is allready in the tree
    */
    public void add(T valueIn) throws ArrayStoreException
    {
        //if the object is less then this
        if (valueIn.compareTo(value) < 0)
        {
            //if there is no left add this object to the left child
            if (left == null)
            {
                BinarySearchTree<T> newTree = new BinarySearchTree<T>(valueIn);
                left = newTree;
            }
            //otherwise keep going left
            else
                left.add(valueIn);
        }

        //if the object is greater then this
        else if (valueIn.compareTo(value) > 0)
        {
            //if there is no right add this object to the right child
            if (right == null)
            {
                BinarySearchTree<T> newTree = new BinarySearchTree<T>(valueIn);
                right = newTree;
            }
            //otherwise keep going right
            else
                right.add(valueIn);
        }
        //if the object is not less then or greater then this, it must be the same
        //this is not supported so throw an exception
        else
            throw new ArrayStoreException("Object {" + valueIn + "} is allready in the Binary Search Tree");
    }

    /**
    * Finds the given object in the Binary Tree
    * @param valueIn the object to find
    * @return the object if found, or null if the object was not found
    */
    public T find(T valueToFind)
    {
        //if this is the object we are looking for return the value
        if (value.compareTo(valueToFind) == 0)
            return value;
        
        //if the value we are looking for is less then this go left
        else if (value.compareTo(valueToFind) > 0 && left != null)
            return left.find(valueToFind);
        
        //if the value we are looking for is larger then this go right
        else if (value.compareTo(valueToFind) < 0 && right != null)
            return right.find(valueToFind);
        
        //otherwise the object must not be in the list
        else
            return null;
    }

    /**
    * Overrides the toString method, returns the tree as a "in order" list of objects
    * @return a string of the tree.
    */
    public String toString()
    {        
        String s = "";

        if (left != null)
            s = s + left;
        
        s = s + value + "\n";

        if (right != null)
            s = s + right;
        
        return s;
    }
}