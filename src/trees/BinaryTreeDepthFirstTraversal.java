package trees;

import trees.Node;

public class BinaryTreeDepthFirstTraversal {

	public static void main(String[] args) throws Queue.QueueUnderflowException, Queue.QueueOverflowException {
		Node<Character> a = new Node<>('A');
		Node<Character> b = new Node<>('B');
		Node<Character> c = new Node<>('C');
		Node<Character> d = new Node<>('D');
		Node<Character> e = new Node<>('E');
		Node<Character> f = new Node<>('F');
		Node<Character> g = new Node<>('G');
		Node<Character> h = new Node<>('H');
		Node<Character> i = new Node<>('I');

		a.setLeftChild(b);
		a.setRightChild(c);
		c.setLeftChild(d);
		c.setRightChild(e);
		d.setLeftChild(f);
		d.setRightChild(h);
		e.setRightChild(g);
		e.setLeftChild(i);

		preOrder(a);
		System.out.println();
		inOrder(a);
		System.out.println();
		postOrder(a);
	}

	public static void print(Node node) {
		System.out.print(node.getData() + "->");
	}

	public static void preOrder(Node<Character> root) {
		if (root == null) {
			return;
		}
		print(root);
		preOrder(root.getLeftChild());
		preOrder(root.getRightChild());

	}
	
	public static void inOrder(Node<Character> root) {
		if (root == null) {
			return;			
		}
		inOrder(root.getLeftChild());
		print(root);
		inOrder(root.getRightChild());
	}
	
	public static void postOrder(Node<Character> root) {
		if (root == null) {
			return;
		}
		postOrder(root.getLeftChild());
		postOrder(root.getRightChild());
		print(root);
	}
	
}
