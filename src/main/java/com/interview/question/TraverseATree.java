package com.interview.question;

import java.util.Stack;

class Node{
    int data;
    Node leftchild;
    Node rightchild;
    Node(int data)
    {
        this.data=data;
    }
}
class BinaryTree {
    Node rootNode;

    void zigzagTraversal() {
        if (rootNode == null)
            return;
        Stack<Node> currentLevel = new Stack<>();
        Stack<Node> nextLevel = new Stack<>();
        currentLevel.push(rootNode);
        boolean leftToRight = true;
        while (!currentLevel.isEmpty()) {
            Node node = currentLevel.pop();
            System.out.print(node.data + " ");

            if (leftToRight) {
                if (node.leftchild != null) {
                    nextLevel.push(node.leftchild);
                }
                if (node.rightchild != null) {
                    nextLevel.push(node.rightchild);
                }
            } else {
                if (node.rightchild != null) {
                    nextLevel.push(node.rightchild);
                }
                if (node.leftchild != null) {
                    nextLevel.push(node.leftchild);

                }
            }
            if (currentLevel.isEmpty()) {
                leftToRight = !leftToRight;
                Stack<Node> temp = currentLevel;
                currentLevel = nextLevel;
                nextLevel = temp;
            }

        }
    }
}
public class TraverseATree {
public static void main(String[] args)
{

    BinaryTree tree = new BinaryTree();
    tree.rootNode = new Node(1);
    tree.rootNode.leftchild = new Node(2);
    tree.rootNode.rightchild = new Node(3);
    tree.rootNode.leftchild.leftchild = new Node(7);
    tree.rootNode.leftchild.rightchild = new Node(6);
    tree.rootNode.rightchild.leftchild = new Node(5);
    tree.rootNode.rightchild.rightchild = new Node(4);

tree.zigzagTraversal();
}

}
