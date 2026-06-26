/*
Definition for a Node.
class Node {
    public int val;
    public List<Node> neighbors;
    public Node() {
        val = 0;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val) {
        val = _val;
        neighbors = new ArrayList<Node>();
    }
    public Node(int _val, ArrayList<Node> _neighbors) {
        val = _val;
        neighbors = _neighbors;
    }
}
*/

class Solution {
    public Node cloneGraph(Node node) {
        if(node == null){
            return node;
        }
        Map<Node, Node> nodeMap = new HashMap<>();

        search(node, nodeMap);

        return nodeMap.get(node);
    }

    public void search(Node node, Map<Node, Node> nodeMap){
        if(!nodeMap.containsKey(node)){
            Node new_node = new Node(node.val);
            nodeMap.put(node, new_node);
            for(Node neighbor : node.neighbors){
                search(neighbor, nodeMap);
                new_node.neighbors.add(nodeMap.get(neighbor));
            }
        }
    }
}