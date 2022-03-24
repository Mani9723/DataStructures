package DataStructures.Trees;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Stack;

public class BinaryTree
{
	static class Node{
		private int data;
		private Node left;
		private Node right;

		public Node(int value){
			data = value;
			left = null;
			right = null;
		}
	}

	private Node root;
	private int numNodes;

	public BinaryTree(){
		root = null;
		numNodes = 0;
	}

	public boolean find(int data){
		return find(root, data);
	}

	private boolean find(Node root, int data){
		if(root == null){
			return false;
		}
		if(root.data == data){
			return true;
		}
		if(data < root.data){
			return find(root.left,data);
		}else{
			return find(root.right, data);
		}
	}

	public void insert(int data){
		root = insert(root,data);
	}

	private Node insert(Node root, int data){
		if(root == null){
			root = new Node(data);
			incNumNodes();
			return root;
		}else{
			if(data < root.data){
				root.left = insert(root.left,data);
			}else if(data > root.data){
				root.right = insert(root.right, data);
			}
		}
		return root;
	}

	public void inorderTraversal()
	{
		inorderTraversal(root);
	}

	public void preorderTraversal()
	{
		preorderTraversal(root);
	}

	public void postOrderTraversal()
	{
		postOrderTraversal(root);
	}

	public void levelOrderTraversal()
	{
		levelOrderTraversal(root);
	}

	public int sumElements()
	{
		return sumElements(root);
	}

	public int sumElements(Node root)
	{
		if(root == null){
			return 0;
		}
		return root.data + sumElements(root.right) + sumElements(root.left);

	}

	private void levelOrderTraversal(Node root)
	{
		if(root == null){
			return;
		}
		Queue<Node> queue = new LinkedList<>();
		queue.add(root);
		while(!queue.isEmpty()){
			Node node = queue.remove();
			System.out.print(node.data + " ");
			if(node.left != null){
				queue.add(node.left);
			}
			if(node.right != null){
				queue.add(node.right);
			}
		}
	}

	public int findMaxValue()
	{
		return findMaxValue(root, -1);
	}

	private int findMaxValue(Node root, int max)
	{
		if(root == null){
			return max;
		}
		if(max < root.data){
			max = root.data;
		}
		return findMaxValue(root.right,max);

	}

	private void postOrderTraversal(Node root)
	{
		if(root == null){
			return;
		}
		postOrderTraversal(root.left);
		postOrderTraversal(root.right);
		System.out.print(root.data + " ");
	}

	private void preorderTraversal(Node root)
	{
		if(root == null){
			return;
		}

		System.out.print(root.data + " ");
		preorderTraversal(root.left);
		preorderTraversal(root.right);

	}

	public void preorderIterative()
	{
		preorderIterative(root);
	}

	private void preorderIterative(Node root)
	{
		if(root == null){
			return;
		}
		Stack<Node> stack = new Stack<>();
		stack.push(root);

		while(!stack.isEmpty()){
			Node node = stack.pop();
			System.out.print(node.data + " ");
			if(node.right != null){
				stack.push(node.right);
			}if(node.left != null){
				stack.push(node.left);
			}
		}

	}

	public int mostExpensivePath()
	{
		return mostExpensivePath(root);
	}

	private int mostExpensivePath(Node root)
	{
		if(root == null){
			return 0;
		}
		return root.data + mostExpensivePath(root.right);
	}

	private void inorderTraversal(Node root)
	{
		if(root == null){
			return;
		}
		inorderTraversal(root.left);
		System.out.print(root.data + " ");
		inorderTraversal(root.right);
	}

	public int getNumNodes()
	{
		return numNodes;
	}

	private void incNumNodes()
	{
		numNodes++;
	}

	public static void main(String[] args)
	{
		BinaryTree binaryTree = new BinaryTree();
		binaryTree.insert(5);
		binaryTree.insert(3);
		binaryTree.insert(9);
		binaryTree.insert(1);
		binaryTree.insert(4);
		binaryTree.insert(6);
		binaryTree.insert(2);

		binaryTree.inorderTraversal();
		System.out.println();
		binaryTree.preorderTraversal();
		System.out.println();
		binaryTree.postOrderTraversal();
		System.out.println();

		System.out.println(binaryTree.find(9));
		binaryTree.levelOrderTraversal();
		System.out.println();
		binaryTree.preorderIterative();

		System.out.println();
		System.out.println(binaryTree.sumElements());
		System.out.println(binaryTree.findMaxValue());

		binaryTree.insert(10);
		System.out.println(binaryTree.findMaxValue());

		System.out.println(binaryTree.mostExpensivePath());
	}

}
