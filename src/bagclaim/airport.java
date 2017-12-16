package bagclaim;

import java.util.HashSet;
import java.util.LinkedList;
import java.util.Queue;
import java.util.Set;

public class airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.out.println("TEST");

	}

	public static boolean pathExistsBidirectional(Node a, Node b) {
		// BFS on both nodes at the same time
		Queue<Node> queueA = new LinkedList<Node>();
		Queue<Node> queueB = new LinkedList<Node>();
		Set<Node> visitedA = new HashSet<Node>();
		Set<Node> visitedB = new HashSet<Node>();

		visitedA.add(a);
		visitedB.add(b);
		queueA.add(a);
		queueB.add(b);

		while (!queueA.isEmpty() && !queueB.isEmpty()) {
			if (pathExistsBidirectionalHelper(queueA, visitedA, visitedB)) {
				return true;
			}
			if (pathExistsBidirectionalHelper(queueB, visitedB, visitedA)) {
				return true;
			}
		}

		return false;
	}

	private static boolean pathExistsBidirectionalHelper(Queue<Node> queue, Set<Node> visitedFromThisSide,
			Set<Node> visitedFromThatSide) {
		if (!queue.isEmpty()) {
			Node next = queue.remove();
			for (Node adjacent : (Set<Node>)next.getAdjacent()) {
				if (visitedFromThatSide.contains(adjacent)) {
					return true;
				} else if (visitedFromThisSide.add(adjacent)) {
					queue.add(adjacent);
				}
			}
		}
		return false;
	}

}
