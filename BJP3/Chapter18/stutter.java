/*


Write a method called stutter that accepts a PriorityQueue of integers as a parameter and replaces every value in the queue with two occurrences of that value. For example, if the queue stores [7, 8, 10, 45], your method should modify the queue to store [7, 7, 8, 8, 10, 10, 45, 45]. You may use one stack or queue as auxiliary storage.

*/


public void stutter(PriorityQueue<Integer> pq) {
    Queue<Integer> aux = new LinkedList<Integer>();
    while(!pq.isEmpty()) 
	aux.add(pq.remove());

    while(!aux.isEmpty()) {
	int element = aux.remove();
	pq.add(element);
	pq.add(element);
    }
}
