// A HashIntSet object represents a set of integers using a hash table
// as the internal data structure.
// The hash table uses separate chaining (a linked list in each hash bucket
// index) to resolve collisions.

public class HashIntSet {
	private static final double MAX_LOAD = 0.5;   // load factor on which to rehash
	
	private Node[] elementData;
	private int size;
	
	// Constructs a new empty set of integers.
	public HashIntSet() {
		elementData = (Node[]) new HashIntSet.Node[10];
		size = 0;
	}
	
	// Constructs a new set of integers.
	@SuppressWarnings("unchecked")
	public HashIntSet(int... values) {
		this();
		for (int value : values) {
			add(value);
		}
	}
	
	// Adds the given value to this set,
	// if it was not already contained in the set.
	public void add(int value) {
		// linear probing to find proper index
		if (!contains(value)) {
			int h = hash(value);
			Node newNode = new Node(value);
			newNode.next = elementData[h];
			elementData[h] = newNode;
			size++;
		}

		// resize if necessary
		if (loadFactor() > MAX_LOAD) {
			rehash();
		}
	}

	// Returns true if o refers to another HashIntSet with the same elementData as this set.
	public boolean equals(Object o) {
		if (o instanceof HashIntSet) {
			HashIntSet other = (HashIntSet) o;
			for (Node front : elementData) {
				Node current = front;
				while (current != null) {
					if (!other.contains(current.data)) {
						return false;
					}
					current = current.next;
				}
			}
			return size == other.size();
		} else {
			return false;
		}
	}
	
	// Returns true if o refers to another HashIntSet with the same elementData as this set,
	// ignoring the value of the size field.
	public boolean equalsIgnoringSize(Object o) {
		if (o instanceof HashIntSet) {
			HashIntSet other = (HashIntSet) o;
			for (Node front : elementData) {
				Node current = front;
				while (current != null) {
					if (!other.contains(current.data)) {
						return false;
					}
					current = current.next;
				}
			}
			for (Node front : other.elementData) {
				Node current = front;
				while (current != null) {
					if (!this.contains(current.data)) {
						return false;
					}
					current = current.next;
				}
			}
			return true;
		} else {
			return false;
		}
	}
	
	

	// Returns whether the given value is found in this set.
	public boolean contains(int value) {
		// linear probing to find proper index
		int h = hash(value);
		Node current = elementData[h];
		while (current != null) {
			if (current.data == value) {
				return true;
			}
			current = current.next;
		}
		return false;
	}

	// Returns true if there are no elementData in this set.
	public boolean isEmpty() {
		return size == 0;
	}
	
	// Returns the hash table's "load factor", its ratio of size to capacity.
	public double loadFactor() {
		return (double) size / elementData.length;
	}
	
	// Removes the given element value from this set,
	// if it was found in the set.
	public void remove(int value) {
		// linear probing to find proper index
		int h = hash(value);
		
		if (elementData[h] != null) {
			// front case
			if (elementData[h].data == value) {
				elementData[h] = elementData[h].next;
				size--;
			} else {
				// non-front case
				Node current = elementData[h];
				while (current.next != null && 
						current.next.data != value) {
					current = current.next;
				}
				
				// current.next == null 
				// || current.next.data == value
				if (current.next != null) {
					current.next = current.next.next;
					size--;
				}
			}
		}
	}

	// Returns the number of elementData in this set.
	public int size() {
		return size;
	}
	
	// Returns a text representation of this set.
	public String toString() {
		String result = "[";
		boolean first = true;
		for (Node node : elementData) {
			Node current = node;
			while (current != null) {
				if (!first) {
					result += ", ";
				}
				result += current.data;
				first = false;
				current = current.next;
			}
		}
		result += "]";
		return result;
	}
	
	// Debugging helper that prints the inner hash table.
	public void debug() {
		System.out.println("debug() output:");
		System.out.printf("index   data\n");
		for (int i = 0; i < elementData.length; i++) {
			System.out.printf("%5d   ", i);
			Node node = elementData[i];
			if (node == null) {
				System.out.printf("%6s\n", "null");
			} else {
				boolean first = true;
				while (node != null) {
					if (!first) {
						System.out.print("  --> ");
					}
					System.out.printf("%8s", node.data);
					node = node.next;
					first = false;
				}
				System.out.println();
			}
		}
		System.out.printf("size   %d\n\n", size);
	}
	
	// hash function for mapping values to indexes
	private int hash(int value) {
		return Math.abs(value) % elementData.length;
	}

	// Resizes the hash table to twice its original capacity.
	@SuppressWarnings("unchecked")
	private void rehash() {
		Node[] newelementData = (Node[]) new HashIntSet.Node[2 * elementData.length];
		Node[] old = elementData;
		elementData = newelementData;
		size = 0;
		for (Node node : old) {
			while (node != null) {
				add(node.data);
				node = node.next;
			}
		}
	}
	
	
	private class Node {
		public int data;
		public Node next;
		
		public Node(int data) {
			this.data = data;
		}
	}

// YOUR CODE GOES HERE

}
