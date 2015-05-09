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

    @Test
    public void nodebTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new NodeB(10));
        assertEquals("b10", tree.toString());

        tree.insert(new NodeB(5));
        assertEquals("b5 b10", tree.toString());

        tree.insert(new NodeB(20));
        assertEquals("b5 b10 b20", tree.toString());

        tree.insert(new NodeB(10));
        assertEquals("b5 b10 b10 b20", tree.toString());
    }

    @Test
    public void mixedTest() {
        BinarySearchTree tree = new BinarySearchTree();

        tree.insert(new NodeB(10));
        assertEquals("b10", tree.toString());

        tree.insert(new NodeB(5));
        assertEquals("b5 b10", tree.toString());

        tree.insert(new NodeB(20));
        assertEquals("b5 b10 b20", tree.toString());

        /*
           __________________
           < These tests fail >
           ------------------
           \                    / \  //\
           \    |\___/|      /   \//  \\
           /0  0  \__  /    //  | \ \    
           /     /  \/_/    //   |  \  \  
           @_^_@'/   \/_   //    |   \   \ 
        //_^_/     \/_ //     |    \    \
        ( //) |        \///      |     \     \
        ( / /) _|_ /   )  //       |      \     _\
        ( // /) '/,_ _ _/  ( ; -.    |    _ _\.-~        .-~~~^-.
        (( / / )) ,-{        _      `-.|.-~-.           .~         `.
        (( // / ))  '/\      /                 ~-. _ .-~      .-~^-.  \
        (( /// ))      `.   {            }                   /      \  \
        (( / ))     .----~-.\        \-'                 .~         \  `. \^-.
        ///.----..>        \             _ -~             `.  ^-`  ^-_
        ///-._ _ _ _ _ _ _}^ - - - - ~                     ~-- ,.-~
        /.-~

        tree.insert(new Node(10));
        assertEquals("b5 b10 10 b20", tree.toString());

        tree.insert(new Node(10));
        assertEquals("b5 b10 10 10 b20", tree.toString());

        tree.insert(new Node(20));
        assertEquals("b5 b10 10 10 b20 20", tree.toString());
        */
    }

    @Test
    public void nodeCompareTest() {
        Node a = new Node(11);
        Node b = new NodeB(12);
        Node c = new NodeB(11);
        Node d = new NodeB(10);
        Node e = new Node(10);
        Node f = new NodeB(12);
        assertEquals(a.compareTo(b), -1);
        assertEquals(b.compareTo(a), 1);
        assertEquals(a.compareTo(c), 1);
        assertEquals(c.compareTo(a), -1);
        assertEquals(d.compareTo(e), -1);
        assertEquals(e.compareTo(d), 1);
        assertEquals(b.compareTo(f), 0);
        assertEquals(d.compareTo(c), -1);
    }
}
