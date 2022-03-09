package com.greatlearningfebweek1.RecordedSession.ArrayOperations;

public class ArrayOpertionsDemo {

	int[] array;
	int size;
	int capacity;

	public ArrayOpertionsDemo(int capacity) {

		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
	}

	void insertInEnd(int element) {
		array[size++] = element;
	}

	void insertAtIndex(int element, int index) {

		if (size == capacity) {
			return;
		}
		for (int i = index; i < size; i++) {
			array[i + 1] = array[i];
		}

		array[index] = element;
		size++;
	}

	int deleteInEnd() {
		int deletetedElement = array[size - 1];
		array[size - 1] = 0;
		size--;
		return deletetedElement;
	}
	
	int deleteAtIndex(int index) {
	
		if(index >= size) {
			return -1;
		}
		
		int deletedElement = array[index];
		for(int i = index + 1; i < size; i++) {
			array[i-1] = array[i];
		}
		size--;
		
		return deletedElement;
	}
	
	boolean search(int element) {
		
		for(int i = 0; i < size; i++) {
			if(array[i] == element){
				return true;
			}
		}
		return false;
	}
	
	void sort() {
		for(int i = 0; i < size; i++) {
			for(int j = 0; j < size - 1 - i; j++) {
				
				if(array[j] > array[j+1]) {
					int temp =array[j];
					array[j] = array[j+1];
					array[j+1] = temp;
				}
			}
		}
	}
	void traversal() {

		System.out.print("Array by size :");
		for (int i = 0; i < size; i++) {

			System.out.print(array[i] + " ");
		}

		System.out.println();
		
		System.out.print("Array by Capacity :");
		for (int i = 0; i < capacity; i++) {

			System.out.print(array[i] + " ");
		}
		
		System.out.println();
	}

	public static void main(String[] args) {
		
		ArrayOpertionsDemo object = new ArrayOpertionsDemo(10);
	
		object.insertInEnd(20);
		object.insertInEnd(13);
		object.insertAtIndex(15,1);
		object.traversal();
		
		System.out.println("\nDeleted Element is :"+object.deleteAtIndex(1));
		
		object.traversal();
		
		System.out.println("15 is presnt or not ?"+object.search(13));
		System.out.println("14 is presnt or not ?"+object.search(6));
		
		object.sort();
		
		object.traversal();
	}
}
