/*
  Write a method in the HeapIntPriorityQueue class called merge that accepts another HeapIntPriorityQueue as a parameter and adds all elements from the other queue into the current queue, maintaining proper heap order such that the elements will still come out in ascending order when they are removed. Your code should not modify the queue passed in as a parameter. (Recall that objects of the same class can access each other's private fields.) */

public void merge(HeapIntPriorityQueue hq) {
    for (int i=1; i<= hq.size; i++) {
	add(hq.elementData[i]);
    }
}

