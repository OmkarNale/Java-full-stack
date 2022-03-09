package com.greatlearningfebweek1.RecordedSession.ArrayOperations;

public class DynamicArrayeDemo {

	int[] array;
	int size;
	int capacity;
	
	public DynamicArrayeDemo(int capacity) {
		// TODO Auto-generated constructor stub
	
		this.capacity = capacity;
		array = new int[capacity];
		size = 0;
		
	}
	
	void insert(int element) {
		if(size == capacity) {
			growarray();
		}
		array[size++] = element;
	}

	public void growarray() {
		
		int[] tempArray = new int[2*size];
		for(int i = 0; i < size; i++) {
			tempArray[i] = array[i];
		}
		
		array = tempArray;
		capacity = 2 * size; 
	}
	
	public static void main(String[] args) {
		
		DynamicArrayeDemo object = new DynamicArrayeDemo(2);
		object.insert(19);
		object.insert(32);
		object.insert(45);
		object.insert(77);
		object.diplay();
		
		System.out.println("Delete Element :"+object.delete(2));
		
		object.diplay();
	}

	public int delete(int index) {
		
		if(index >= size) {
			return -1;
		}
		int deleteElement = array[index];
		for(int i = index + 1; i < size; i++) {
			array[i-1] = array[i];
		}
		size--;
		return deleteElement;
	}

	public void diplay() {

		System.out.println("Array with size :");
		for(int i =0;i < size;i++) {
			System.out.println(array[i]+" ");
		}
		
		System.out.println("Array with Capacity :");
		for(int i =0;i < capacity;i++) {
			System.out.println(array[i]+" ");
		}

		System.out.println();
	}
}
