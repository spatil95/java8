package collectionEx;

import java.util.PriorityQueue;

public class QueueDequeEx {
	//queue and dequeue un-order format
	public static void main(String[] args) {

		//PriorityQueue pq1 = new PriorityQueue();

		PriorityQueue<Integer> pq2 = new PriorityQueue<Integer>();

		// add values
		pq2.add(1);
		pq2.add(5);
		pq2.add(3);
		pq2.offer(4);
		pq2.offer(6);
		pq2.offer(2);
		System.out.println("All values: " + pq2);

		// peek will return the value from the head of the queue but does not remove the
		// element
		Object o1 = pq2.peek();
		System.out.println("Head of queue: " + o1);
		System.out.println("Size after after peek: " + pq2.size());
		System.out.println("All values after peek: " + pq2);
		System.out.println("***********************");
		int i = pq2.peek();
		System.out.println("Head of queue: " + i);
		System.out.println("Size after after peek: " + pq2.size());
		System.out.println("All values after peek: " + pq2);

		// poll will return the value from the head of the queue and will remove the
		// element
		int x = pq2.poll();
		System.out.println("Head of queue: " + x);
		System.out.println("Size after after poll: " + pq2.size());
		System.out.println("All values after poll: " + pq2);

		// element() returns the element at the head of the queue. The element is not

		// removed.
		Object o2 = pq2.element();
		System.out.println(o2);
		System.out.println("Size after after element: " + pq2.size());
		// remove() removes the element at the head of the queue, returning the element
		// in the process.
		Object o3 = pq2.remove();
		System.out.println(o3);
		System.out.println("Size after after remove: " + pq2.size());
	}
	
	//methods
	//peek- retrive head data
	//poll-remove head data
	//Element- retrive head data and exception when data no available
	//Remove- remove head data and exception when data no available
}
