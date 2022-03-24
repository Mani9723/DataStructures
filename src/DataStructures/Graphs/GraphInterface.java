package DataStructures.Graphs;

/**
 * Graph Interface
 *
 * The basic operations provided by a graph data structure G usually include:
 *
 * adjacent(G, x, y): tests whether there is an edge from the vertex x to the vertex y;
 * neighbors(G, x): lists all vertices y such that there is an edge from the vertex x to the vertex y;
 * add_vertex(G, x): adds the vertex x, if it is not there;
 * remove_vertex(G, x): removes the vertex x, if it is there;
 * add_edge(G, x, y): adds the edge from the vertex x to the vertex y, if it is not there;
 * remove_edge(G, x, y): removes the edge from the vertex x to the vertex y, if it is there;
 * get_vertex_value(G, x): returns the value associated with the vertex x;
 * set_vertex_value(G, x, v): sets the value associated with the vertex x to v.
 */
public interface GraphInterface
{
	boolean adjacent(Graph G, Vertex x, Vertex y);
	Vertex[] neighbors(Graph G, Vertex x);
	void addVertex(Graph G, Vertex x);
	Vertex removeVertex(Graph G, Vertex x);
	void addEdge(Graph G, Vertex x, Vertex y);
	Edge removeEdge(Graph G, Vertex x, Vertex y);
	int getVertexValue(Graph G, Vertex x);
	void setVertexValue(Graph G, Vertex x, Vertex v);



}
