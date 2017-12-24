package bagclaim;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<Node<?>> nodes = new ArrayList<Node<?>>();

	public List<Node<?>> getNodes() {
		return nodes;
	}

	public int getNodeIdByLabel(String label) {

		int nodeid = 0;
		int nodeidfound = 0;

		for (Node<?> n : nodes) {

			if (n.getData().equals(label)) {
				nodeidfound = nodeid;
				break;
			} else {

				nodeidfound = -1;
			}

			nodeid = nodeid + 1;

		}
		return nodeidfound;
	}

	public void setNodes(List<Node<?>> nodes) {
		this.nodes = nodes;
	}

	public void addNode(Node<?> n) {
		this.nodes.add(n);

	}

}
