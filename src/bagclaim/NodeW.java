package bagclaim;

import java.util.ArrayList;
import java.util.List;

public class NodeW {
	private String Label;
	private List<EdgeW> edges = new ArrayList<EdgeW>();

	public String getLabel() {
		return Label;
	}

	public void setLabel(String label) {
		Label = label;
	}

	public List<EdgeW> getEdges() {
		return edges;
	}

	public void addEdge(EdgeW e) {
		this.edges.add(e);

	}
}
