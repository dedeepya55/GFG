class Solution {
    // Function to return Breadth First Search Traversal of given graph.
    public ArrayList<Integer> bfs(ArrayList<ArrayList<Integer>> adj) {
        // code here
        boolean[] visited = new boolean[adj.size()];
        Queue<Integer> queue = new LinkedList<>();
        ArrayList<Integer> result = new ArrayList<>();
        
        queue.add(0);
        visited[0] = true;
        while(!queue.isEmpty()){
            int node = queue.poll();
            result.add(node);
            
            for(int neighbour : adj.get(node)){
                if(!visited[neighbour]){
                    visited[neighbour] = true;
                    queue.add(neighbour);
                }
            }
        }
        return result;
    }
}