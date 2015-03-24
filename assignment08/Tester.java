package assignment08;

import static org.junit.Assert.*;
import org.junit.Test;

public class Tester {
	@Test
	public void nodeTest() {
		Node a = new Node(1);
		Node b = new Node(1);
		Node c = new Node(3);

		assertTrue(a.compareTo(b) == 0);
		assertTrue(a.compareTo(c) < 0);
		assertTrue(c.compareTo(b) > 0);
	}

	@Test
	public void treeTest() {
		BinarySearchTree tree = new BinarySearchTree();
		assertEquals("", tree.toString());

		tree.insert(new Node(10));
		assertEquals("10", tree.toString());

		tree.insert(new Node(5));
		assertEquals("5 10", tree.toString());

		tree.insert(new Node(20));
		assertEquals("5 10 20", tree.toString());

		tree.insert(new Node(10));
		assertEquals("5 10 10 20", tree.toString());
	}
}
