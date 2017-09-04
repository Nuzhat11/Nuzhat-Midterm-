package datastructure;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Queue;

public class UseQueue {

	public static void main(String[] args) {
		Queue<String> queue = new LinkedList<String>();
		queue.add("New Jersey");
		queue.add("Illinois");
		queue.add("New York");
		queue.add("Florida");
		queue.add("California");
		queue.add("Texas");

		System.out.println(queue.peek());
		System.out.println(queue.element());
		System.out.println(queue.poll());



		//Iterator
		Iterator<String> state = queue.iterator();
		while (state.hasNext()) {
			System.out.println(state.next());

		}

		queue.remove();
		System.out.println("After removing two elements:");
		for (String st: queue) {
			System.out.println(st);

		}
	}
}
