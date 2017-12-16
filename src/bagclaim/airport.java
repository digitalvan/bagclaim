package bagclaim;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Queue;
import java.util.Set;

public class airport {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		// Section 1: A weighted bi-directional graph describing the conveyor system.
		// Format: <Node 1> <Node 2> <travel_time>

		// Section 2: Departure list Format:
		// <flight_id> <flight_gate> <destination> <flight_time>
		// Section 3: Bag list Format:
		// <bag_number> <entry_point> <flight_id>

		// Concourse_A_Ticketing A5 5
		// A5 BaggageClaim 5
		// A5 A10 4
		// A5 A1 6
		// A1 A2 1
		// A2 A3 1
		// A3 A4 1
		// A10 A9 1
		// A9 A8 1
		// A8 A7 1
		// A7 A6 1

		// Sample Input :

		// Concourse_A_Ticketing A5 5
		// A5 BaggageClaim 5
		// A5 A10 4
		// A5 A1 6
		// A1 A2 1
		// A2 A3 1
		// A3 A4 1
		// A10 A9 1
		// A9 A8 1
		// A8 A7 1
		// A7 A6 1
		// # Section: Departures
		// UA10 A1 MIA 08:00
		// UA11 A1 LAX 09:00
		// UA12 A1 JFK 09:45
		// UA13 A2 JFK 08:30
		// UA14 A2 JFK 09:45
		// UA15 A2 JFK 10:00
		// UA16 A3 JFK 09:00
		// UA17 A4 MHT 09:15
		// UA18 A5 LAX 10:15
		// # Section: Bags
		// 0001 Concourse_A_Ticketing UA12
		// 0002 A5 UA17
		// 0003 A2 UA10
		// 0004 A8 UA18
		// 0005 A7 ARRIVAL

		// Example Output:
		// ```
		// 0001 Concourse_A_Ticketing A5 A1 : 11
		// 0002 A5 A1 A2 A3 A4 : 9
		// 0003 A2 A1 : 1
		// 0004 A8 A9 A10 A5 : 6
		// 0005 A7 A8 A9 A10 A5 BaggageClaim : 12

		// Departure List

		// UA10 A1 MIA 08:00
		// UA11 A1 LAX 09:00
		// UA12 A1 JFK 09:45
		// UA13 A2 JFK 08:30
		// UA14 A2 JFK 09:45
		// UA15 A2 JFK 10:00
		// UA16 A3 JFK 09:00
		// UA17 A4 MHT 09:15
		// UA18 A5 LAX 10:15

		// departures
		List<departure> departures = new ArrayList<departure>();
		departures.add(new departure("UA10", "A1", "MIA", "08:00"));
		departures.add(new departure("UA11", "A1", "LAX", "09:00"));
		departures.add(new departure("UA12", "A1", "JFK", "09:45"));
		departures.add(new departure("UA13", "A2", "JFK", "08:30"));
		departures.add(new departure("UA14", "A2", "JFK", "09:45"));
		departures.add(new departure("UA15", "A2", "JFK", "10:00"));
		departures.add(new departure("UA16", "A3", "JFK", "09:00"));
		departures.add(new departure("UA17", "A4", "MHT", "09:15"));
		departures.add(new departure("UA18", "A5", "LAX", "10:15"));

		// System.out.println(departures.get(0).getDepature());
		// System.out.println(departures.get(1).getDepature());

		// bags
		List<bag> bags = new ArrayList<bag>();
		bags.add(new bag("0001", "Concourse_A_Ticketing", "UA12"));
		bags.add(new bag("0002", "A5", "UA17"));
		bags.add(new bag("0003", "A2", "UA10"));
		bags.add(new bag("0004", "A8", "UA18"));
		bags.add(new bag("0005", "A7", "ARRIVAL"));

		NodeW a = new NodeW();
		a.setLabel("Concourse_A_Ticketing");
		NodeW b = new NodeW();
		b.setLabel("A5");
		EdgeW e = new EdgeW();
		e.setDestination(b);
		e.setWeight(5.0);
		b.addEdge(e);

		NodeW c = new NodeW();
		c.setLabel("A10");
		EdgeW f = new EdgeW();
		f.setDestination(b);
		f.setWeight(4.0);
		c.addEdge(f);

		// Output Bag # <point1> <point2> .. <pointn> : travel time

		// From bags, you need Bag # and Entry Point.
		// join bag.flight_id with departure.flight_id
		// join departure.flight_gate with conveyor system gate.
		Iterator<bag> bagIterator = bags.iterator();
		while (bagIterator.hasNext()) {

			// System.out.println(bagIterator.next().getEntry_point());

			String b_flightid = bagIterator.next().getFlight_id();

			for (departure d : departures) {
				String d_flightid = d.getFlight_id();
				String d_flightgate = d.getFlight_gate();

				if (b_flightid == d_flightid) {

					System.out.println("MATCH");

					System.out.println("d_flightgate : " + d_flightgate + " b.getLabel : " + b.getLabel());
					// join depature.flight gate with bag conveyer gate.

					if (d_flightgate.equals(b.getLabel())) {
					for (EdgeW ew : b.getEdges()) {
						System.out.println(ew.getWeight());

					}
					}

				}

			}
		}

	}

	// System.out.println(a.getEdges().get(0).getDestination().getLabel());
	// System.out.println(a.getEdges().get(0).getWeight());

	// System.out.println(c.getEdges().get(0).getDestination().getLabel());
	// System.out.println(c.getEdges().get(0).getWeight());

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
			for (Node adjacent : (Set<Node>) next.getAdjacent()) {
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
