package DataStructures.Graphs;

public class DepthFirstSearch
{
	private boolean[] marked;
	private int count;

	public DepthFirstSearch(Graph G, int S)
	{
		marked = new boolean[G.V()];
		count = 0;
	}

	public void dfs(Graph G, int V)
	{
		marked[V] = true;
		count++;
		for(int w : G.adj(V)){
			if(!marked[w]){
				dfs(G,w);
			}
		}
	}

	public boolean marked(int v)
	{
		return marked[v];
	}

	public int getCount()
	{
		return count;
	}
}
