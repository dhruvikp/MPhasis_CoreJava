package com.simplilean.datastruture.linkedList;

import java.util.Scanner;

public class SinglyLinkedList {

	Node head;

	static class Node {
		int data;
		Node next;

		public Node(int data) {
			this.data = data;
			next = null;
		}
	}

	// Inserting node in the linked list
	public static SinglyLinkedList insert(SinglyLinkedList list, int data) {

		Node new_node = new Node(data);
		// First element in the node
		if (list.head == null) {
			list.head = new_node;
		} else {

			Node last = list.head;

			while (last.next != null) {
				last = last.next;
			}
			last.next = new_node;
		}
		return list;
	}

	// Printing linked list
	public static void printList(SinglyLinkedList list) {

		Node temp = list.head;

		while (temp != null) {
			System.out.print(temp.data + " ");
			temp = temp.next;
		}
	}

	public static SinglyLinkedList deleteByKey(SinglyLinkedList list, int key) {

		Node curr_node = list.head;
		Node prev_node = null;

		// STEP 1: Checking if head node to be deleted, if yes then just change head
		// pointer
		if (curr_node != null & curr_node.data == key) {
			// just shifting head pointer
			list.head = curr_node.next;
			System.out.println(key + " found and deleted from linkedList");
			return list;
		}

		// STEP 2: Iterate untill we get node to be deleted
		// Maintaining previousNode while iteration, reason, we will need it when node
		// to be deleted.
		while (curr_node != null && curr_node.data != key) {
			prev_node = curr_node;
			curr_node = curr_node.next;
		}

		// STEP 3: If found currentNode (Which is to be deleted), just assigning
		// previous node
		// next reference to currentNode next reference.
		// If we iterated and didn't find any solution, then currentNode will be null.
		if (curr_node != null) {
			prev_node.next = curr_node.next;
			System.out.println(key + " found and deleted from linkedlist");
		} else {
			System.out.println(key + " Not found in linkedlist");
		}
		return list;
	}

	public static void main(String[] args) {

		SinglyLinkedList list = new SinglyLinkedList();

		int count = 5;
		
		while(count!=0) {
			Scanner scanner = new Scanner(System.in);
			int element = scanner.nextInt();
			list.insert(list, element);
			count--;
		}
		
		list.printList(list);
		
		System.out.println("=============");
		System.out.println("Please enter element to be deleted:");
		Scanner scanner = new Scanner(System.in);
		int element = scanner.nextInt();
		list.deleteByKey(list, element);
		System.out.println("List after deletion");
		list.printList(list);
		
		
		
		
	}

}
