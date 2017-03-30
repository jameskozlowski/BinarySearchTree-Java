# Binary Srach Tree #

This Implimentation is a simple example and does not really have a good real world use.

This version of a BST is a simple implementation for the purpose of fast binary search No logic is added to insure a balanced tree and there is no way to rearrange/delete the tree

All objects add to the tree must Extend Comparable and be unique, any 2 objects that compare equalcannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.

# What is a Binary Search Tree (Wikipedia)
This version of a BST is a simple implementation for the purpose of fast binary search No logic is added to insure a balanced tree and there is no way to rearrange/delete the tree

All objects add to the tree must Extend Comparable and be unique, any 2 objects that compare equalcannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.

# Functions

### BinarySearchTree<T>(valueIn) - Constructor
This version of a BST is a simple implementation for the purpose of fast binary search No logic is added to insure a balanced tree and there is no way to rearrange/delete the tree


All objects add to the tree must Extend Comparable and be unique, any 2 objects that compare equalcannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.


parameter|Disc.
---------|----
valueIn|The value you want to store
**RETURNS**|None

Example: 
```java 
BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(5);
```

### BinarySearchTree.add(valueIn)
Adds a object to the correct place in the tree

No logic is added to insure a balanced tree, Any 2 objects that compare equal cannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.

Throws ArrayStoreException if the object is allready in the tree

parameter|Disc.
---------|----
valueIn|The value you want to store
**RETURNS**|None

Example: 
```java 
root.add(3);
```

### BinarySearchTree.find(valueIn)
Finds the given object in the Binary Tree

No logic is added to insure a balanced tree, Any 2 objects that compare equal cannot both exist in the tree. This may require you to implement some sort of hashing to the compareTo.

Throws ArrayStoreException if the object is allready in the tree

parameter|Disc.
---------|----
valueIn|The value you want to store
**RETURNS**|the object if found, or null if the object was not found

Example: 
```java 
root.find(3)
```

### BinarySearchTree.getValue()
Returns the object stored in this node 

parameter|Disc.
---------|----
**RETURNS**|The object stored in this node 

Example: 
```java 
root.getValue();
```

### BinarySearchTree.toString()
Overrides the toString method, returns the tree as a "in order" list of objects as a string

parameter|Disc.
---------|----
**RETURNS**|A string of the tree.

Example: 
```java 
System.out.println(root);
```