package com.dsa.gfg;

/**
 * 13 Oct 2023
 * <p>
 * Floor in BST
 * <p>
 * You are given a BST(Binary Search Tree) with n number of nodes and value x. your task is to find the greatest value node of the BST which is smaller than or equal to x.
 * Note: when x is smaller than the smallest node of BST then returns -1.
 */
public class FloorInBST {

    public static void main(String[] args) {

        Node root = new Node(2);
        root.right = new Node(81);
        root.right.left = new Node(42);
        root.right.left.right = new Node(66);
        root.right.left.right.left = new Node(45);
        root.right.right = new Node(87);
        root.right.right.right = new Node(90);


        int number = 87;

        System.out.println(floor(root, number));

    }

    public static int floor(Node root, int x) {
        int output = -1;

        while (root!=null){
            if (root.data==x){
                return root.data;
            }
            if (root.data>x){
                root=root.left;
            }
            else
            {  output=root.data;
                root=root.right;
            }

        }

        return output;
    }

}
