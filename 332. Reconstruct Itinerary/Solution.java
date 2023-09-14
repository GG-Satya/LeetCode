// 332. Reconstruct Itinerary
// ==========================

class Solution {
    public List<String> findItinerary(List<List<String>> tickets) {
        Map<String, LinkedList<String>> graph = new HashMap<>();
        LinkedList<String> itinerary = new LinkedList<>();

        // Build the graph
        for (List<String> ticket : tickets) {
            String from = ticket.get(0);
            String to = ticket.get(1);
            graph.putIfAbsent(from, new LinkedList<>());
            graph.get(from).add(to);
        }

        // Sort the destinations lexicographically
        for (List<String> destinations : graph.values()) {
            Collections.sort(destinations);
        }

        Stack<String> stack = new Stack<>();
        stack.push("JFK");

        while (!stack.isEmpty()) {
            String from = stack.peek();
            LinkedList<String> destinations = graph.get(from);

            if (destinations != null && !destinations.isEmpty()) {
                stack.push(destinations.poll());
            } else {
                itinerary.addFirst(stack.pop());
            }
        }

        return itinerary;
    }
}