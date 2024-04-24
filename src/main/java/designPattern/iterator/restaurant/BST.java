package designPattern.iterator.restaurant;

import java.util.Iterator;
import java.util.Stack;

public class BST<E extends Comparable<E>> implements Iterable<E> {
    private class Node {
        E e;
        Node left, right;

        Node(E e) {
            this.e = e;
            this.left = null;
            this.right = null;
        }
    }

    private Node root;
    private int size;

    public BST(){
        root = null;
        size = 0;
    }

    public int size(){
        return size;
    }

    public boolean isEmpty(){
        return size == 0;
    }

    // 向二分搜索树中添加新的元素e
    public void add(E e){
        root = add(root, e);
    }

    // 向以node为根的二分搜索树中插入元素e，递归算法
    // 返回插入新节点后二分搜索树的根
    private Node add(Node node, E e){
        if(node == null){
            size ++;
            return new Node(e);
        }

        if(e.compareTo(node.e) < 0)
            node.left = add(node.left, e);
        else if(e.compareTo(node.e) > 0)
            node.right = add(node.right, e);

        return node;
    }

    // 看二分搜索树中是否包含元素e
    public boolean contains(E e){
        return contains(root, e);
    }

    // 看以node为根的二分搜索树中是否包含元素e, 递归算法
    private boolean contains(Node node, E e){

        if(node == null)
            return false;

        if(e.compareTo(node.e) == 0)
            return true;
        else if(e.compareTo(node.e) < 0)
            return contains(node.left, e);
        else // e.compareTo(node.e) > 0
            return contains(node.right, e);
    }


    @Override
    public Iterator<E> iterator() {
        return new InOrderIterator();
    }

    public Iterator<E> preOrderIterator() {
        return new PreOrderIterator();
    }

    public Iterator<E> postOrderIterator() {
        return new PostOrderIterator();
    }

    private class InOrderIterator implements Iterator<E> {
        private Stack<Node> stack = new Stack<>();

        private InOrderIterator() {
            pushLeft(root);
        }

        private void pushLeft(Node node) {
            while (node != null) {
                stack.push(node);
                node = node.left;
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            Node curr = stack.pop();
            E result = curr.e;
            if (curr.right != null) {
                pushLeft(curr.right);
            }
            return result;
        }
    }

    private class PreOrderIterator implements Iterator<E> {
        private Stack<Node> stack = new Stack<>();

        private PreOrderIterator() {
            if (root != null) {
                stack.push(root);
            }
        }

        @Override
        public boolean hasNext() {
            return !stack.isEmpty();
        }

        @Override
        public E next() {
            Node curr = stack.pop();
            if (curr.right != null) {
                stack.push(curr.right);
            }
            if (curr.left != null) {
                stack.push(curr.left);
            }
            return curr.e;
        }
    }

    private class PostOrderIterator implements Iterator<E> {
        private Stack<Node> stack1 = new Stack<>();
        private Stack<Node> stack2 = new Stack<>();

        private PostOrderIterator() {
            if (root != null) {
                stack1.push(root);
                while (!stack1.isEmpty()) {
                    Node curr = stack1.pop();
                    stack2.push(curr);
                    if (curr.left != null) {
                        stack1.push(curr.left);
                    }
                    if (curr.right != null) {
                        stack1.push(curr.right);
                    }
                }
            }
        }

        @Override
        public boolean hasNext() {
            return !stack2.isEmpty();
        }

        @Override
        public E next() {
            return stack2.pop().e;
        }
    }
}
