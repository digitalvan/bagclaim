package bagclaim;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Set;

public class Node<T> {
	private final T data;
	private final Set<Node<?>> adjacent = new HashSet<Node<?>>();
	private final HashMap hm = new HashMap();

	public Set<Node<?>> getAdjacent() {
		return adjacent;
	}

	public HashMap<Node<?>, String> getAdjacentHM() {
		return hm;
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

	// returns if the node was added, false if already there
	public boolean addAdjacentHM(Node<?> node, String weight) {
		hm.putIfAbsent(node, weight);
		return true;
	}

	// returns true if any were added
	public boolean addAdjacentsHM(HashMap<Node<?>, String> nodes) {
		hm.putAll(nodes);
		return true;
	}

}
