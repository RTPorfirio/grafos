/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package grafosdefinicoes;

import com.sun.javafx.font.FontResource;
import dao.XmlDao;
import java.util.Random;
import model.Data;
import model.Edge;
import model.Graph;
import model.Graphml;
import model.Node;

/**
 *
 * @author ricardo
 */
public class GrafosDefinicoes {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        
        Graphml g = XmlDao.leGrafo("arq.xml");
        
        for(int i=0;i<g.getGraph().getEdge().size();i++){
            System.out.println((i+1)+"   =>   "+g.getGraph().getEdge().get(i).getSource());
        }
        
        

        
    }
    
}
