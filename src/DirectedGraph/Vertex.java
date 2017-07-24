package white.lion.DirectedGraph;

import java.util.ArrayList;
import java.util.List;
import white.lion.Word;

public class Vertex {
    
    private Word element;
    private List<Vertex> adjacentVertices;
    private List<Edge> adjacentEdges;

    public Vertex(Word element) {
        this.element = element;
        adjacentVertices = new ArrayList<>();
        adjacentEdges = new ArrayList<>();
    }
    
    public Word getElement() {
        return element;
    }

    public void setElement(Word element) {
        this.element = element;
    }

    public List<Vertex> getAdjacentVertices() {
        return adjacentVertices;
    }

    public void setAdjacentVertices(List<Vertex> adjacentVertices) {
        this.adjacentVertices = adjacentVertices;
    }

    public List<Edge> getAdjacentEdges() {
        return adjacentEdges;
    }

    public void setAdjacentEdges(List<Edge> adjacentEdges) {
        this.adjacentEdges = adjacentEdges;
    }
   
}
