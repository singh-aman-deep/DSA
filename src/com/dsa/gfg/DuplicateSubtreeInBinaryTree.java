package com.dsa.gfg;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

/**
 *
 * 12 Oct 2023
 *
 * Duplicate subtree in Binary Tree
 *
 * Given a binary tree, find out whether it contains a duplicate sub-tree of size two or more, or not.
 *
 * Note: Two same leaf nodes are not considered as subtree as size of a leaf node is one.
 */
public class DuplicateSubtreeInBinaryTree {


    public static void main(String[] args) throws IOException {
        Node root = new Node('A');
        root.left = new Node('G');
        root.right = new Node('C');
        root.left.left = new Node('H');
        root.left.right = new Node('E');
        root.right.right = new Node('F');
        root.right.right.right = new Node('J');
        root.right.right.left= new Node('D');
        root.right.right.left.left= new Node('G');

        System.out.print(dupSub(root));

    }


    public static int dupSub(Node root) {
        String str = dup(root);

        if (str.equals("#"))
            return 1;
        else
            return 0;
    }

    static char MARKER = '$';
    private static Set<String> subtree = new HashSet<>();

    private static String dup(Node root) {
        String s = "";
        if (root == null)
            return s + MARKER;

        String lstr = dup(root.left);
        if (lstr.equals("#"))
            return "#";

        String rstr = dup(root.right);
        if (rstr.equals("#"))
            return "#";

        s = s + root.data + lstr + rstr;
        if (s.length() > 3 && subtree.contains(s))
            return "#";

        subtree.add(s);
        return s;
    }
}

