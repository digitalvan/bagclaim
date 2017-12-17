package bagclaim;

import java.util.ArrayList;
import java.util.List;

public class Graph {

	private List<NodeW> nodes = new ArrayList<NodeW>();

	public List<NodeW> getNodes() {
		return nodes;
	}

	public int getNodeIdByLabel(String label) {

		int nodeid = 0;
		int nodeidfound = 0;

		for (NodeW n : nodes) {
			

			if (n.getLabel().equals(label)) {				
				nodeidfound = nodeid;
				break;
			} else {

				nodeidfound = -1;
			}

			nodeid = nodeid + 1;

		}
		return nodeidfound;
	}

	public void setNodes(List<NodeW> nodes) {
		this.nodes = nodes;
	}

	public void addNode(NodeW n) {
		this.nodes.add(n);

	}

}
