/*
Write a method called removeDuplicates that accepts a PriorityQueue of integers as a parameter and modifies the queue's state so that any element that is equal to another element in the queue is removed. For example, if the queue stores [7, 7, 8, 8, 8, 10, 45, 45], your method should modify the queue to store [7, 8, 10, 45]. You may use one stack or queue as auxiliary storage. 
*/

public void removeDuplicates(PriorityQueue<Integer> pq) {
    Queue<Integer> aux = new LinkedList<Integer>();
    int old = Integer.MAX_VALUE;
    while(!pq.isEmpty()) {
	int element = pq.remove();
	if (element != old) {
	    aux.add(element);
	}
	old = element;
    }
    while(!aux.isEmpty())
	pq.add(aux.remove());
    
}
