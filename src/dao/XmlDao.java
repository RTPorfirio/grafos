/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package dao;

import com.thoughtworks.xstream.XStream;
import com.thoughtworks.xstream.io.xml.DomDriver;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Data;
import model.Edge;
import model.Graph;
import model.Graphml;
import model.Node;

/**
 *
 * @author ricardo
 */
public class XmlDao {
    protected static XStream iniciaXstream() {
        XStream xstream = new XStream(new DomDriver("UTF-8"));
        xstream.autodetectAnnotations(true);
        xstream.setMode(XStream.NO_REFERENCES);
        xstream.processAnnotations(Graph.class);
        xstream.processAnnotations(Node.class);
        xstream.processAnnotations(Edge.class);
        xstream.processAnnotations(Graphml.class);
        xstream.processAnnotations(Data.class);
        return xstream;
    }

    public static void salvaXML(Graphml g,String nome) {
        XStream xstream = iniciaXstream();
        try {
            File xmlFile = new File(nome);
            xstream.toXML(g, new FileWriter(xmlFile));
        } catch (IOException ex) {
            Logger.getLogger(XmlDao.class.getName()).log(Level.SEVERE, null, ex);
        }
    }

    public static Graphml leGrafo(String nome) {
        XStream xstream = iniciaXstream();
        File xmlFile = new File(nome);
        Graphml grafo = (Graphml) xstream.fromXML(xmlFile);

        Node source;
        Node target;
        String namesource;
        String nametarget;
        for(int i=0;i<grafo.getGraph().getEdge().size();i++){
            namesource=grafo.getGraph().getEdge().get(i).getSourceName();
            nametarget=grafo.getGraph().getEdge().get(i).getTargetName();
            for(int j=0;j<grafo.getGraph().getNode().size();j++){
                if(namesource.equals(grafo.getGraph().getNode().get(j).getId())){
                    grafo.getGraph().getEdge().get(i).setSource(grafo.getGraph().getNode().get(j));
                }
                if(nametarget.equals(grafo.getGraph().getNode().get(j).getId())){
                    grafo.getGraph().getEdge().get(i).setTarget(grafo.getGraph().getNode().get(j));
                }
                
            }
        }
        
        return grafo;
    }

}
