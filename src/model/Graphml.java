/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package model;

import com.thoughtworks.xstream.annotations.XStreamAlias;
import com.thoughtworks.xstream.annotations.XStreamAsAttribute;

/**
 *
 * @author ricardo
 */
@XStreamAlias("graphml")
public class Graphml {

    @XStreamAlias("xmlns")
    @XStreamAsAttribute
    
    private String titulo;
        
    @XStreamAlias("xmlns:xsi")
    @XStreamAsAttribute
    private String xmlns;
    
    @XStreamAlias("xsi:schemaLocation")
    @XStreamAsAttribute
    private String schemaLocation;
    
    private Graph graph;

    public Graphml(Graph graph) {
        header();              
        this.graph = graph;
    }
    
    public Graphml() {
        header();              
        this.graph = new Graph();
    }
    
    private void header(){
      this.titulo = "http://graphml.graphdrawing.org/xmlns";
      this.xmlns = "http://www.w3.org/2001/XMLSchema-instance";
      this.schemaLocation = "http://graphml.graphdrawing.org/xmlns\n" +
"     http://graphml.graphdrawing.org/xmlns/1.0/graphml.xsd";
    }
    
    

    public Graph getGraph() {
        return graph;
    }

    public void setGraph(Graph graph) {
        this.graph = graph;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }



}
