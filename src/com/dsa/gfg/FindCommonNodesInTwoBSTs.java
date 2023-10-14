package com.dsa.gfg;

import java.util.ArrayList;
import java.util.HashSet;

/**
 * 14 Oct 2023
 * <p>
 * Find Common Nodes in two BSTs
 * <p>
 * Given two Binary Search Trees. Find the nodes that are common in both of them, ie- find the intersection of the two BSTs.
 * <p>
 * Note: Return the common nodes in sorted order.
 */
public class FindCommonNodesInTwoBSTs {

    public static void main(String[] args) {
        Node root1 = new Node(10);
        root1.right = new Node(11);
        root1.left = new Node(2);
        root1.left.left = new Node(1);
        root1.left.right = new Node(3);

        Node root2 = new Node(2);
        root2.right = new Node(3);
        root2.left = new Node(1);

        System.out.println(Solution1.findCommon(root1, root2));
    }
}

class Solution1 {
    public static ArrayList<Integer> output;
    public static HashSet<Integer> hashSet;

    //Function to find the nodes that are common in both BST.
    public static ArrayList<Integer> findCommon(Node root1, Node root2) {
        output = new ArrayList<>();
        hashSet=new HashSet<>();
        first(root1);
        second(root2);
        return output;
    }

    private static void first(Node root1) {
        if (root1!=null){
            first(root1.left);
            hashSet.add(root1.data);
            first(root1.right);
        }

    }
    private static void second(Node root2) {
        if (root2!=null){
            second(root2.left);
            if (hashSet.contains(root2.data)){
                output.add(root2.data);
            }
            second(root2.right);
        }
    }



}
