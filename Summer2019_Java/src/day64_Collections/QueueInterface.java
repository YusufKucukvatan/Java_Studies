package day64_Collections;

import java.util.Collections;
import java.util.PriorityQueue;
import java.util.Queue;

public class QueueInterface {
	public static void main(String[] args) {
		Queue<Integer> q1=new PriorityQueue<>();
		q1.add(3);
		q1.add(1);
		q1.add(5);
		q1.add(9);
		q1.add(7);
		q1.add(4);
		q1.add(2);
		System.out.println(q1);
		Integer x=q1.poll();
		System.out.println(x);
		q1.poll();
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
		q1.poll();
		System.out.println(q1);
	}
	

}
