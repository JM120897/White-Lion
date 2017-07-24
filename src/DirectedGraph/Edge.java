package white.lion.DirectedGraph;

public class Edge {
    
    private Vertex originVertex;
    private Vertex destinationVertex;
    private Double probability;

    public Edge(Vertex originVertex, Vertex destinationVertex, Double probability) {
        this.originVertex = originVertex;
        this.destinationVertex = destinationVertex;
        this.probability = probability;
    }

    public Vertex getOriginVertex() {
        return originVertex;
    }

    public void setOriginVertex(Vertex originVertex) {
        this.originVertex = originVertex;
    }

    public Vertex getDestinationVertex() {
        return destinationVertex;
    }

    public void setDestinationVertex(Vertex destinationVertex) {
        this.destinationVertex = destinationVertex;
    }

    public Double getProbability() {
        return probability;
    }

    public void setProbability(Double probability) {
        this.probability = probability;
    }
    
}
