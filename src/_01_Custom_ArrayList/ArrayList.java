package _01_Custom_ArrayList;

@SuppressWarnings("unchecked")

public class ArrayList <T>{
	T[] array;
	public ArrayList() {
		array = (T[]) new Object[0];
	}
	
	public T get(int loc) throws IndexOutOfBoundsException {
		return array[loc];
	}
	
	public void add(T val) {
		T[] arr;
		arr = (T[]) new Object[array.length+1];
		arr[arr.length-1] = val;
		for (int i = 0; i < array.length; i++) {
			arr[i] = array[i];
		}
		array = arr;
	}
	
	public void insert(int loc, T val) throws IndexOutOfBoundsException {
		T[] arr;
		arr = (T[]) new Object[array.length+1];
		for (int i = 0; i < arr.length; i++) {
			if(i<loc) {
				arr[i] = array[i];
			}
			else if(i>loc) {
				arr[i] = array[i-1];
			}
			else {
				arr[i] = val;
			}
		}
		array = arr;
	}
	
	public void set(int loc, T val) throws IndexOutOfBoundsException {
		array[loc] = val;
	}
	
	public void remove(int loc) throws IndexOutOfBoundsException {
		T[] arr;
		arr = (T[]) new Object[array.length-1];
		for (int i = 0; i < array.length; i++) {
			if(i<loc) {
				arr[i] = array[i];
			}
			else if(i>loc) {
				arr[i-1] = array[i];
			}
			else {
				continue;
			}
		}
		array = arr;
	}
	
	public boolean contains(T val) {
		for (int i = 0; i < array.length; i++) {
			if(array[i] == val) {
				return true;
			}
		}
		return false;
	}
	public int size() {
		return array.length;
	}
}