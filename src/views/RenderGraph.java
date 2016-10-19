/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package views;

import com.mxgraph.model.mxCell;
import com.mxgraph.model.mxGraphModel;
import com.mxgraph.swing.mxGraphComponent;
import com.mxgraph.util.mxConstants;
import com.mxgraph.util.mxUtils;
import com.mxgraph.view.mxGraph;
import java.awt.Dimension;
import java.util.ArrayList;
import java.util.Collection;
import javax.swing.JFrame;
import model.Edge;
import model.Node;

/**
 *
 * @author ricardo
 */
public class RenderGraph extends JFrame {

    private mxGraph graph;
    private mxGraphComponent graphComponent;
    private ArrayList<Node> nodes;
    private ArrayList<Edge> edges;
    private Object parent;
    private ArrayList obj;

    public RenderGraph(ArrayList<Node> nodes, ArrayList<Edge> edges) {
        super("Visualizador do Grafo");
        initGUI();
        graph = new mxGraph();
        graphComponent = new mxGraphComponent(graph);
        graphComponent.setPreferredSize(new Dimension(800, 600));
        getContentPane().add(graphComponent);
        graph.getModel().beginUpdate();
        parent = graph.getDefaultParent();
        this.nodes = nodes;
        this.edges = edges;



        
        
        renderNodes();
        renderEdges();
        
        

        graph.getModel().endUpdate();
        
        
    }

    private void initGUI() {
        setSize(800, 600);
        setLocationRelativeTo(null);
    }

    public void renderNodes() {
        for (int i = 0; i < this.nodes.size(); i++) {
            graph.insertVertex(parent, null, nodes.get(i).getId(), nodes.get(i).getData().getPosX(), nodes.get(i).getData().getPosY(), nodes.get(i).getData().getRadius(), nodes.get(i).getData().getRadius(), "shape=ellipse;fillColor="+nodes.get(i).getData().getColor());

        }
    }

    public void renderEdges() {
        Object[] cells = graph.getChildVertices(graph.getDefaultParent());
        mxCell cell;
        Object source = null;
        Object target = null;
        for (int j = 0; j < edges.size(); j++) {
            for (int i = 0; i < nodes.size(); i++) {
                cell = (mxCell) cells[i];
                if (edges.get(j).getSourceName().equals(cell.getValue())) {
                    source = cell;
                }
                if (edges.get(j).getTargetName().equals(cell.getValue())) {
                    target = cell;
                }
            }
            
            graph.insertEdge(parent, null, "6441", source, target,"STYLE_FONTCOLOR=green");

        }
    }

}
