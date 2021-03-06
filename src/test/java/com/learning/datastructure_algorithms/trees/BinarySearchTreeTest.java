package com.learning.datastructure_algorithms.trees;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class BinarySearchTreeTest {

    @Test
    public void TestBinarySearchTree_0() {
        BST root = new BST(10);
        root.insert(5).insert(2).insert(1).insert(5).insert(15).insert(13).insert(14).insert(22);

        root.insert(12);
        assertEquals(12, root.right.left.left.value);

        root = root.remove(10);
        assertFalse(root.contains(10));
        assertEquals(12, root.value);

        assertFalse(root.contains(11));
    }

    @Test
    public void TestBinarySearchTree_1() {
        BST root = new BST(10);
        root.insert(5);
        root.insert(15);
        assertTrue(root.contains(10));
        assertTrue(root.contains(5));
        assertTrue(root.contains(15));
        root.remove(10);
        root.remove(5);
        root.remove(15);
        assertFalse(root.contains(10));
        assertFalse(root.contains(5));
        assertTrue(root.contains(15));

    }

    @Test
    public void TestBinarySearchTree_2() {
        BST root = new BST(10);
        root.insert(15);
        root.insert(14);
        root.insert(16);
        assertTrue(root.contains(10));
        assertTrue(root.contains(15));
        assertTrue(root.contains(16));
        assertTrue(root.contains(14));
        root.remove(10);
        assertFalse(root.contains(10));
        assertFalse(root.contains(5));
        assertTrue(root.contains(15));
    }

    @Test
    public void TestBinarySearchTree_3() {
        BST root = new BST(10);
        root.insert(5);
        root.insert(6);
        root.insert(7);
        root.insert(8);
        root.insert(2);
        root.insert(1);
        root.insert(3);
        root.insert(15);
        root.insert(13);
        root.insert(14);
        root.insert(22);
        root.insert(12);

        root.remove(5);
        assertFalse(root.contains(5));
    }

    @Test
    public void isValidTest_1() {
        BST root = new BST(10);
        root.insert(5);
        root.insert(2);
        root.insert(1);
        root.insert(5);
        root.insert(15);
        root.insert(13);
        root.insert(14);
        root.insert(22);

        assertTrue(BST.isValid(root));
    }

    @Test
    public void isValidTest_2() {
        BST root = new BST(10);
        root.left = new BST(5);
        root.left.left = new BST(2);
        root.left.left.left = new BST(1);
        root.left.right = new BST(5);
        root.left.right.right = new BST(11);

        root.right = new BST(15);
        root.right.right = new BST(22);


        assertFalse(BST.isValid(root));
    }

}
