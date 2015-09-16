/*
  Write a method called isConsecutive that accepts a PriorityQueue of integers as a parameter and returns true if the queue contains a sequence of consecutive integers starting from the front of the queue. Consecutive integers are integers that come one after the other, as in 5, 6, 7, 8, 9, etc., so if the queue stores [7, 8, 9, 10, 11], your method should return true. (Also return true if passed an empty queue.) If your method modifies the state of the queue during its computation, it should restore the queue before it returns. You may use one stack or queue as auxiliary storage. 
*/

public boolean isConsecutive(PriorityQueue<Integer> pq) {
    if (pq.isEmpty())
	return true;

    Queue<Integer> aux = new LinkedList<Integer>();
    boolean isConsecutive = true;
    while (!pq.isEmpty()) {
	int element = pq.remove();
	if (isConsecutive && !pq.isEmpty() && element != pq.peek() - 1) {
	    isConsecutive = false;
	}
	aux.add(element);
    }
    while(!aux.isEmpty())
	pq.add(aux.remove());
    return isConsecutive;
}
