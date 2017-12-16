package bagclaim;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<NodeW> nodes = new ArrayList<NodeW>();

	public List<NodeW> getNodes() {
		return nodes;
	}

	public void setNodes(List<NodeW> nodes) {
		this.nodes = nodes;
	}

	public void addNode(NodeW n) {
		this.nodes.add(n);

	}

}
