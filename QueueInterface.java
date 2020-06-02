import java.util.LinkedList;
import java.util.Queue;

public class QueueInterface
 {

	public static void main(String [] args){

		Queue<String> q = new LinkedList<>();

		q.add("Ranju");
		q.add("Shruthi");
		q.add("Dilip");

		System.out.println("Removed element " + q.remove());

		System.out.println(q);

		q.add("Aira");

		System.out.println("Top element is " + q.peek());

		System.out.println("Size of Queue is " + q.size());

		System.out.println("Is Queue empty?? " + q.isEmpty());

	}
}

