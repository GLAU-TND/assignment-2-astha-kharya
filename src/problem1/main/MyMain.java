/*
 *  Created by IntelliJ IDEA.
 *  User: Vaibhav
 *  Date: 23-Mar-20
 *  Time: 7:17 PM
 */
package problem1.main;
// executable class

import problem1.mybst.MyBinarySearchTree;

public class MyMain {
    public static void main(String[] args) {
        MyBinarySearchTree BinarySearchTree=new MyBinarySearchTree();
        BinarySearchTree.insert(10);
        BinarySearchTree.insert(20);
        BinarySearchTree.insert(30);
        BinarySearchTree.insert(40);
        BinarySearchTree.insert(50);

        System.out.println("Left children of binary search tree: ");
        BinarySearchTree.Traverse();
        System.out.println("No. of parents not having their child are: ");
        System.out.println(BinarySearchTree.getCountRight());
    }
}
