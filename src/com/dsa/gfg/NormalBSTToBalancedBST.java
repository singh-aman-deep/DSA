package com.dsa.gfg;

import java.util.ArrayList;

/**
 *15 Oct 2023
 *
 * Normal BST to Balanced BST
 *
 * Given a Binary Search Tree, modify the given BST such that it is balanced and has minimum possible height.
 * Return the balanced BST.
 *
 * Input:
 *        30
 *       /
 *      20
 *     /
 *    10
 * Output:
 *      20
 *    /   \
 *  10     30
 *
 */
public class NormalBSTToBalancedBST {

    public static void main(String[] args) {
        Node root = new Node(30);
        root.left = new Node(20);
        root.left.left = new Node(10);

        System.out.println(new GfG().buildBalancedTree(root));
    }

}

class GfG
{
    ArrayList<Node> al;
    Node buildBalancedTree(Node root)
    {
        //Add your code here.
        al = new ArrayList<>();
        in(root);
        return toBalance(0, al.size()-1);


    }
    Node toBalance( int l, int r)// binary search
    {
        if(l>r) return null;

        int m =(l+r)/2;
        Node root = al.get(m);

        root.right = toBalance(m+1, r);
        root.left = toBalance(l,m-1);

        return root;
    }
    void in(Node root)
    {
        if(root!=null)
        {
            in(root.left);
            al.add(root);
            in(root.right);
        }
    }
}
