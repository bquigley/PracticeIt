/*


Write a method called kthSmallest that accepts a PriorityQueue of integers and an integer k as parameters and returns the kth-smallest integer from the priority queue (where k=1 would represent the very smallest). For example, if the queue passed stores the integers [42, 50, 45, 78, 61] and k is 4, return the fourth-smallest integer, which is 61. If k is 0 or negative or greater than the size of the queue, throw an IllegalArgumentException. If your method modifies the state of the queue during its computation, it should restore the queue before it returns. You may use one stack or queue as auxiliary storage.

*/

public int kthSmallest(PriorityQueue<Integer> pq, int k) {
    if (k <= 0 || k > pq.size())
	throw new IllegalArgumentException();

    Queue<Integer> q = new LinkedList<Integer>();
    int kthValue = 0;
    int i=0;
    while(!pq.isEmpty()) {
	int element = pq.remove();
	if ( ++i == k)
	    kthValue = element;
	q.add(element);
    }

    while(!q.isEmpty())
	pq.add(q.remove());

    return kthValue;
}
