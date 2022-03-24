package DataStructures.Graphs;

public class Graph
{
	private int V;
	private int E;
	private Bag<Integer>[] adjList;

	@SuppressWarnings("unchecked")
	public Graph(int v)
	{
		this.V = v;
		this.E = 0;
		adjList = (Bag<Integer>[]) new Bag[V];
		for(int i = 0; i < V; i++){
			adjList[i] = new Bag<>();
		}
	}

	public int V()
	{
		return V;
	}

	public int E()
	{
		return E;
	}

	public void addEdge(int v, int w)
	{
		adjList[v].addItem(w);
		adjList[w].addItem(v);
		E++;
	}

	@SuppressWarnings("unchecked")
	public Iterable<Integer> adj(int v)
	{
		return (Iterable<Integer>) adjList[v];
	}

	public static int degree(Graph G, int v)
	{
		int deg = 0;
		for(int w : G.adj(v)){
			deg++;
		}
		return deg;
	}

	public static int maxDegree(Graph G)
	{
		int max = 0;
		for(int v = 0; v < G.V(); v++){
			max = Math.max(degree(G,v),max);
		}
		return max;
	}

	public static int avgDegree(Graph G)
	{
		return 2*G.E()/G.V();
	}

	public static int countSelfLoops(Graph G)
	{
		int count = 0;
		for(int v = 0; v < G.V(); v++){
			for(int w : G.adj(v)){
				if(v == w) count++;
			}
		}
		return count>>1;
	}

	@Override
	public String toString()
	{
		StringBuilder s = new StringBuilder(V + " vertices, " + E + " edges\n");
		for (int v = 0; v < V; v++)
		{
			s.append(v).append(": ");
			for (int w : this.adj(v))
				s.append(w).append(" ");
			s.append("\n");
		}
		return s.toString();
	}
}
