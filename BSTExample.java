public class BSTExample
{
    public static void main(String[] args)
    {
        BinarySearchTree<Integer> root = new BinarySearchTree<Integer>(5);

        root.add(3);
        root.add(4);
        root.add(6);
        root.add(1);
        root.add(9);

        System.out.println(root);

        System.out.println(root.find(3));
        
    }
}