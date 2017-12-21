package bagclaim;

import java.util.HashSet;
import java.util.Set;

public class Node<T> {
	private final T data;
	private final Set<Node<?>> adjacent = new HashSet<Node<?>>();

	public Set<Node<?>> getAdjacent() {
		return adjacent;
	}

	public Node(T data) {
		this.data = data;
	}

	public T getData() {
		return data;
	}

	// returns if the node was added, false if already there
	public boolean addAdjacent(Node<?> node) {
		return adjacent.add(node);
	}

	// returns true if any were added
	public boolean addAdjacents(Set<Node<?>> nodes) {
		return adjacent.addAll(nodes);
	}
}
