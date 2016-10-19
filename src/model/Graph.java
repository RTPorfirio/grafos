/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamImplicit;
import java.util.ArrayList;

/**
 *
 * @author ricardo
 */
@XStreamAlias("graph")
public class Graph {
    
    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;

    @XStreamAsAttribute
    @XStreamAlias("edgedefault")
    private String edgedefault;

    @XStreamImplicit(itemFieldName = "node")
    private ArrayList<Node> node;

    @XStreamImplicit(itemFieldName = "edge")
    private ArrayList<Edge> edge;

    public Graph() {
        node = new ArrayList();
        edge = new ArrayList();
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getEdgedefault() {
        return edgedefault;
    }

    public void setEdgedefault(String edgedefault) {
        this.edgedefault = edgedefault;
    }

    public ArrayList<Node> getNode() {
        return node;
    }

    public void setNode(ArrayList<Node> node) {
        this.node = node;
    }

    public ArrayList<Edge> getEdge() {
        return edge;
    }

    public void setEdge(ArrayList<Edge> edge) {
        this.edge = edge;
    }



}
