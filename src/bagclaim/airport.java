package bagclaim;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// // Section 1: A weighted bi-directional graph describing the conveyor system.
		// // Format: <Node 1> <Node 2> <travel_time>
		//
		// // Section 2: Departure list Format:
		// // <flight_id> <flight_gate> <destination> <flight_time>
		// // Section 3: Bag list Format:
		// // <bag_number> <entry_point> <flight_id>
		//
		// // Concourse_A_Ticketing A5 5
		// // A5 BaggageClaim 5
		// // A5 A10 4
		// // A5 A1 6
		// // A1 A2 1
		// // A2 A3 1
		// // A3 A4 1
		// // A10 A9 1
		// // A9 A8 1
		// // A8 A7 1
		// // A7 A6 1
		//
		// // Sample Input :
		//
		// // Concourse_A_Ticketing A5 5
		// // A5 BaggageClaim 5
		// // A5 A10 4
		// // A5 A1 6
		// // A1 A2 1
		// // A2 A3 1
		// // A3 A4 1
		// // A10 A9 1
		// // A9 A8 1
		// // A8 A7 1
		// // A7 A6 1
		// // # Section: Departures
		// // UA10 A1 MIA 08:00
		// // UA11 A1 LAX 09:00
		// // UA12 A1 JFK 09:45
		// // UA13 A2 JFK 08:30
		// // UA14 A2 JFK 09:45
		// // UA15 A2 JFK 10:00
		// // UA16 A3 JFK 09:00
		// // UA17 A4 MHT 09:15
		// // UA18 A5 LAX 10:15
		// // # Section: Bags
		// // 0001 Concourse_A_Ticketing UA12
		// // 0002 A5 UA17
		// // 0003 A2 UA10
		// // 0004 A8 UA18
		// // 0005 A7 ARRIVAL
		//
		// // Example Output:
		// // ```
		// // 0001 Concourse_A_Ticketing A5 A1 : 11
		// // 0002 A5 A1 A2 A3 A4 : 9
		// // 0003 A2 A1 : 1
		// // 0004 A8 A9 A10 A5 : 6
		// // 0005 A7 A8 A9 A10 A5 BaggageClaim : 12
		//
		// // Departure List
		//
		// // UA10 A1 MIA 08:00
		// // UA11 A1 LAX 09:00
		// // UA12 A1 JFK 09:45
		// // UA13 A2 JFK 08:30
		// // UA14 A2 JFK 09:45
		// // UA15 A2 JFK 10:00
		// // UA16 A3 JFK 09:00
		// // UA17 A4 MHT 09:15
		// // UA18 A5 LAX 10:15
		//
		// // departures
		// List<departure> departures = new ArrayList<departure>();
		// departures.add(new departure("UA10", "A1", "MIA", "08:00"));
		// departures.add(new departure("UA11", "A1", "LAX", "09:00"));
		// departures.add(new departure("UA12", "A1", "JFK", "09:45"));
		// departures.add(new departure("UA13", "A2", "JFK", "08:30"));
		// departures.add(new departure("UA14", "A2", "JFK", "09:45"));
		// departures.add(new departure("UA15", "A2", "JFK", "10:00"));
		// departures.add(new departure("UA16", "A3", "JFK", "09:00"));
		// departures.add(new departure("UA17", "A4", "MHT", "09:15"));
		// departures.add(new departure("UA18", "A5", "LAX", "10:15"));
		//
		// // System.out.println(departures.get(0).getDepature());
		// // System.out.println(departures.get(1).getDepature());
		//
		// // bags
		// List<bag> bags = new ArrayList<bag>();
		// bags.add(new bag("0001", "Concourse_A_Ticketing", "UA12"));
		// bags.add(new bag("0002", "A5", "UA17"));
		// bags.add(new bag("0003", "A2", "UA10"));
		// bags.add(new bag("0004", "A8", "UA18"));
		// bags.add(new bag("0005", "A7", "ARRIVAL"));
		//
		// // conveyor system
		// // Concourse_A_Ticketing A5 5
		// // A5 BaggageClaim 5
		// // A5 A10 4
		// // A5 A1 6
		// // A1 A2 1
		// // A2 A3 1
		// // A3 A4 1
		// // A10 A9 1
		// // A9 A8 1
		// // A8 A7 1
		// // A7 A6 1
		//
		// // conveyor system graph
		//
		// NodeW n1 = new NodeW();
		// NodeW n2 = new NodeW();
		// NodeW n3 = new NodeW();
		// NodeW n4 = new NodeW();
		// NodeW n5 = new NodeW();
		// NodeW n6 = new NodeW();
		// NodeW n7 = new NodeW();
		// NodeW n8 = new NodeW();
		// NodeW n9 = new NodeW();
		// NodeW n10 = new NodeW();
		// NodeW n11 = new NodeW();
		// NodeW n12 = new NodeW();
		//
		// // Nodes
		//
		// n1.setLabel("A1");
		// n2.setLabel("A2");
		// n3.setLabel("A3");
		// n4.setLabel("A4");
		// n5.setLabel("A5");
		// n6.setLabel("A6");
		// n7.setLabel("A7");
		// n8.setLabel("A8");
		// n9.setLabel("A9");
		// n10.setLabel("A10");
		// n11.setLabel("Concourse_A_Ticketing");
		// n12.setLabel("BaggageClaim");
		//
		// // Edges
		// EdgeW e1 = new EdgeW();
		// EdgeW e2 = new EdgeW();
		// EdgeW e3 = new EdgeW();
		// EdgeW e4 = new EdgeW();
		// EdgeW e5 = new EdgeW();
		// EdgeW e6 = new EdgeW();
		// EdgeW e7 = new EdgeW();
		// EdgeW e8 = new EdgeW();
		// EdgeW e9 = new EdgeW();
		// EdgeW e10 = new EdgeW();
		// EdgeW e11 = new EdgeW();
		// EdgeW e12 = new EdgeW();
		//
		// // 1 Edge
		// e1.setDestination(n2);
		// e1.setWeight(1);
		// n1.addEdge(e1);
		//
		// // 2 Edge
		// e2.setDestination(n3);
		// e2.setWeight(1);
		// n2.addEdge(e2);
		//
		// // 3 Edge
		// e3.setDestination(n4);
		// e3.setWeight(1);
		// n3.addEdge(e3);
		//
		// // 4 Edge
		// e4.setDestination(n1);
		// e4.setWeight(6);
		// n5.addEdge(e4);
		//
		// // 5 Edge
		// e5.setDestination(n9);
		// e5.setWeight(4);
		// n10.addEdge(e5);
		//
		// // 6 Edge
		// e6.setDestination(n12);
		// e6.setWeight(5);
		// n5.addEdge(e6);
		//
		// // 7 Edge
		// e7.setDestination(n9);
		// e7.setWeight(1);
		// n10.addEdge(e7);
		//
		// // 8 Edge
		// e8.setDestination(n8);
		// e8.setWeight(1);
		// n9.addEdge(e8);
		//
		// // 9 Edge
		// e9.setDestination(n7);
		// e9.setWeight(1);
		// n8.addEdge(e9);
		//
		// // 10 Edge
		// e10.setDestination(n6);
		// e10.setWeight(1);
		// n7.addEdge(e10);
		//
		// e11.setDestination(n5);
		// e11.setWeight(5);
		// n11.addEdge(e11);
		//
		// // Create list of nodes
		//
		// Graph g = new Graph();
		//
		// g.addNode(n1);
		// g.addNode(n2);
		// g.addNode(n3);
		// g.addNode(n4);
		// g.addNode(n5);
		// g.addNode(n6);
		// g.addNode(n7);
		// g.addNode(n8);
		// g.addNode(n9);
		// g.addNode(n10);
		// g.addNode(n11);
		// g.addNode(n12);
		//
		// // Output Bag # <point1> <point2> .. <pointn> : travel time
		//
		// // From bags, you need Bag # and Entry Point.
		// // join bag.flight_id with departure.flight_id
		// // join departure.flight_gate with conveyor system gate.
		// int edgeweightsum = 0;
		// String outputline = null;
		//
		// for (bag b : bags) {
		//
		// String b_flightid = b.getFlight_id();
		// String b_number = b.getBag_number();
		// String b_entrypoint = b.getEntry_point();
		//
		// for (departure d : departures) {
		// String d_flightid = d.getFlight_id();
		// String d_flightgate = d.getFlight_gate();
		//
		// if (b_flightid.equals(d_flightid)) {
		//
		// // iterate over coveyor system
		// for (NodeW n : g.getNodes()) {
		// for (EdgeW ew : n.getEdges()) {
		// if (b_entrypoint.equals(n.getLabel())) {
		//
		// System.out.println("DEBUG :: b_entrypoint : " + b_entrypoint + "d_flightgate
		// :: " + d_flightgate);
		//
		// //System.out.println("DEBUG:: Node : " + n.getLabel() + "Edge : " +
		// ew.getDestination().getLabel() );
		// outputline = b_number + " " + n.getLabel() + " " +
		// ew.getDestination().getLabel();
		// edgeweightsum = edgeweightsum + ew.getWeight();
		//
		// int edgeid = g.getNodeIdByLabel(ew.getDestination().getLabel());
		// if (edgeid != -1) {
		// for (EdgeW ex : g.getNodes().get(edgeid).getEdges()) {
		//
		// if (d_flightgate.equals(ex.getDestination().getLabel())) {
		//
		// outputline += " " + ex.getDestination().getLabel();
		// edgeweightsum = edgeweightsum + ex.getWeight();
		//
		// } else {
		//
		// }
		//
		// }
		// }
		//
		// }
		// }
		//
		// }
		//
		// }
		// }
		// System.out.println(outputline + ":" + edgeweightsum);
		// edgeweightsum = 0;
		// }

		// Bi-directional graph test.
		Node<String> node1 = new Node<String>("A1");
		Node<String> node2 = new Node<String>("A2");
		Node<String> node3 = new Node<>("A3");
		Node<String> node4 = new Node<>("A4");
		node3.addAdjacent(node1);
		node3.addAdjacent(node2);
		// node2.addAdjacent(node3);
		// node1.addAdjacent(node3);
		// node1.addAdjacent(node4);

		// Set<Node<?>> nodes = new HashSet<>();
		// nodes.add(node1);
		// nodes.add(node2);
		// node3.addAdjacents(nodes);

		HashMap<Node<?>, String> hm = new HashMap();
		hm.put(node1, "3");
		hm.put(node2, "4");

		node3.addAdjacentsHM(hm);
		// System.out.println(node3.getAdjacentHM().get(node1));
		// System.out.println(node3.getAdjacentHM().get(node2));

		// get node keys
		// for ( Node key : node3.getAdjacentHM().keySet()) {
		// System.out.println( "Node :: " + node3.getData() + " Edge ::" + key.getData()
		// + " Weight :: " + node3.getAdjacentHM().get(key) );
		// }

		// Graph Search : Given a source and destination gate, return the shortest path

		Graph g = new Graph();
		g.addNode(node1);
		g.addNode(node2);
		g.addNode(node3);

		String source = "A3";
		String dest = "A1";

		// Direct Path
		System.out.println(pathExistsBidirectional(g.getNodeIdByLabel(source), g.getNodeIdByLabel(dest)));

		// If direct match found in the graph, save it

		if (g.getNodeIdByLabel(source).getAdjacentHM().containsKey(g.getNodeIdByLabel(dest))) {

			System.out.println(
					" Path Found : " + g.getNodeIdByLabel(source).getAdjacentHM().get(g.getNodeIdByLabel(dest)));

		}

		// for (Node<?> node : g.getNodes()) {
		// for (Node<?> edge : node.getAdjacentHM().keySet()) {
		// System.out.println("Node ::" + node.getData() + " Edge :: " + edge.getData()
		// + " Weight :: " + node.getAdjacentHM().get(edge));
		// }
		// }

		// System.out.println(node3.getAdjacent().remove(node2));
		// System.out.println(node3.getAdjacent().contains(node2));
		// System.out.println(node3.getAdjacent().contains(node4));

		// System.out.println(pathExistsBidirectional(node1, node3));
		// System.out.println(pathExistsBidirectional(node2, node3));

		// System.out.println(pathExistsBidirectional(node1, node2));
		// System.out.println(pathExistsBidirectional(node2, node3));
		// System.out.println(pathExistsBidirectional(node1, node4));

	}

	public static boolean pathExistsBidirectional(Node<?> a, Node<?> b) {
		// BFS on both nodes at the same time
		Queue<Node<?>> queueA = new LinkedList<Node<?>>();
		Queue<Node<?>> queueB = new LinkedList<Node<?>>();
		Set<Node<?>> visitedA = new HashSet<Node<?>>();
		Set<Node<?>> visitedB = new HashSet<Node<?>>();

		visitedA.add(a);
		visitedB.add(b);
		queueA.add(a);
		queueB.add(b);

		while (!queueA.isEmpty() && !queueB.isEmpty()) {

			if (pathExistsBidirectionalHelper(queueA, visitedA, visitedB)) {
				// System.out.println("Queue A, Visited A, Visited B");
				return true;
			}
			if (pathExistsBidirectionalHelper(queueB, visitedB, visitedA)) {
				// System.out.println("Queue B, Visited B, Visited A");
				return true;
			}
		}

		return false;
	}

	private static boolean pathExistsBidirectionalHelper(Queue<Node<?>> queueA, Set<Node<?>> visitedA,
			Set<Node<?>> visitedB) {
		if (!queueA.isEmpty()) {
			// System.out.println("Queue A Size :"+queueA.size());

			Node<?> next = queueA.remove();
			// System.out.println("Queue A Size :"+queueA.size());

			for (Node<?> adjacent : next.getAdjacent()) {
				if (visitedB.contains(adjacent)) {
					return true;
				} else if (visitedA.add(adjacent)) {
					queueA.add(adjacent);
				}
			}
		}
		return false;
	}

}
