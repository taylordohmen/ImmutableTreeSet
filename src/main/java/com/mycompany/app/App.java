package com.mycompany.app;

import java.util.Random;
import java.lang.Integer;
import java.lang.System.*;

/**
 * Hello world!
 *
 */
public class App {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        RBTreeSet<Integer> tree = new RBTreeSet<Integer>();
        Random r = new Random();
        for (int j = 1; j < 10; j++) {
            for (int i = 0; i < j; i++) {
                int x = r.nextInt(50);
                tree.add(new Integer(i));
            }
            System.out.print("{");
            tree.print();
            System.out.println("}");

            System.out.println(maxDepth(tree.root));
        }
//        tree.add(new Integer(6));
//        tree.add(new Integer(22));
//        tree.add(new Integer(5));
//        tree.add(new Integer(0));
//        tree.add(new Integer(44));
//        tree.add(new Integer(75));
//        tree.add(new Integer(33));
//        tree.add(new Integer(101));
//        tree.add(new Integer(17));
//        tree.add(new Integer(19));
//            System.out.print("{");
//            tree.print();
//            System.out.println("}");
//
//            System.out.println(maxDepth(tree.root));

    }

    private static int maxDepth(Node<Integer> root) {
        if (root == null) {
            return 0;
        }

        int ldepth = maxDepth(root.left);
        int rdepth = maxDepth(root.right);

        if (ldepth > rdepth) {
            return ldepth + 1;
        } else {
            return rdepth + 1;
        }
    }
}
