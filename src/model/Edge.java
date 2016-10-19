/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;
import com.thoughtworks.xstream.annotations.XStreamOmitField;




/**
 *
 * @author ricardo
 */

public class Edge {


    @XStreamOmitField
    private Node source;
    @XStreamOmitField
    private Node target;
    
    @XStreamAsAttribute
    @XStreamAlias("source")
    private String sourceName;
    
    @XStreamAsAttribute
    @XStreamAlias("target")
    private String targetName;

    public Edge(Node source, Node target) {
        this.source = source;
        this.target = target;
        this.sourceName = this.source.getId();
        this.targetName = this.target.getId();;
    }

    public Edge(String sourceName, String targetName, Data data) {
        this.sourceName = sourceName;
        this.targetName = targetName;
        this.source = new Node(this.sourceName, data);
        this.target = new Node(this.targetName, data);
        
    }
    
    public Node getSource() {
        return source;
    }

    public void setSource(Node source) {
        this.source = source;
    }

    public Node getTarget() {
        return target;
    }

    public void setTarget(Node target) {
        this.target = target;
    }

    public String getSourceName() {
        return sourceName;
    }

    public void setSourceName(String sourceName) {
        this.sourceName = sourceName;
    }

    public String getTargetName() {
        return targetName;
    }

    public void setTargetName(String targetName) {
        this.targetName = targetName;
    }
    
    
    
    
    
}
