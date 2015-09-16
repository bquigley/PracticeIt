import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.NoSuchElementException;

public class HeapIntPriorityQueue {
	private int[] elementData;
	private int size;

	public HeapIntPriorityQueue() {
		elementData = new int[10];
		size = 0;
	}
	
	public HeapIntPriorityQueue(int[] elements) {
		this();
		for (int n : elements) {
			add(n);
		}
	}
	
	public void add(int value) {
		size++;
		if (size >= elementData.length) {
			elementData = Arrays.copyOf(elementData, 2 * elementData.length);
		}
		elementData[size] = value;
		bubbleUp(size, false);
	}
	
	public boolean equals(Object o) {
		if (o instanceof HeapIntPriorityQueue) {
			// they need to have same size and same overall element values,
			// but order doesn't matter
			HeapIntPriorityQueue other = (HeapIntPriorityQueue) o;
			if (other.size != size || other.elementData == null || other.elementData.length < size + 1) {
				return false;
			}
			
			int[] mycopy = new int[size];
			for (int i = 0; i < mycopy.length; i++) {
				mycopy[i] = elementData[i + 1];
			}
			Arrays.sort(mycopy);
			
			int[] othercopy = new int[size];
			for (int i = 0; i < othercopy.length; i++) {
				othercopy[i] = other.elementData[i + 1];
			}
			Arrays.sort(othercopy);
			
			return Arrays.equals(mycopy, othercopy);
		} else {
			return false;
		}
	}
	
	public boolean isEmpty() {
		return size == 0;
	}

	public int peek() {
		if (isEmpty()) {
			throw new NoSuchElementException("queue is empty");
		}
		return elementData[1];
	}

	public int remove() {
		int result = peek();
		elementData[1] = elementData[size];
		elementData[size] = 0;
		size--;
		bubbleDown(1);
		return result;
	}

	public int size() {
		return size;
	}
	
	public String toString() {
		StringBuilder sb = new StringBuilder();
		sb.append('[');
		if (!isEmpty()) {
			sb.append(elementData[1]);
			for (int i = 2; i <= size; i++) {
				sb.append(", ");
				sb.append(elementData[i]);
			}
		}
		sb.append(']');
		return sb.toString();
	}
	
	private void bubbleUp(int index) {
		bubbleUp(index, false);
	}
	
	private void bubbleUp(int index, boolean allTheWayUp) {
		boolean found = false;
		while (!found && hasParent(index)) {
			int parent = parent(index);
			
			if (allTheWayUp || elementData[index] < elementData[parent]) {
				swap(elementData, index, parent(index));
				index = parent(index);
			} else {
				found = true;  // found proper location; stop the loop
			}
		}
	}
	
	private void bubbleDown(int index) {
		boolean found = false;
		while (!found && hasLeftChild(index)) {
			int left = leftChild(index);
			int right = rightChild(index);
			int child = left;
			if (hasRightChild(index) && elementData[right] < elementData[left]) {
				child = right;
			}

			if (elementData[child] < elementData[index]) {
				swap(elementData, index, child);
				index = child;
			} else {
				found = true;  // found proper location; stop the loop
			}
		}
	}

	// Returns the index of the parent node of the given element in the heap.
	private int parent(int index) {
		return index / 2;
	}
	
	// Returns the index of the left child of the given index in the heap.
	private int leftChild(int index) {
		return index * 2;
	}

	// Returns the index of the right child of the given index in the heap.
	private int rightChild(int index) {
		return index * 2 + 1;
	}

	// Returns true if the given index has a parent in the heap (true for all elementData above 1).
	private boolean hasParent(int index) {
		return index > 1;
	}

	// Returns true if the given index has a left child element in the heap.
	private boolean hasLeftChild(int index) {
		return leftChild(index) <= size;
	}

	// Returns true if the given index has a right child element in the heap.
	private boolean hasRightChild(int index) {
		return rightChild(index) <= size;
	}
	
	// Swaps the elementData at the two given indexes in the array.
	private void swap(int[] a, int index1, int index2) {
		int temp = a[index1];
		a[index1] = a[index2];
		a[index2] = temp;
	}
	
// YOUR CODE GOES HERE

}
