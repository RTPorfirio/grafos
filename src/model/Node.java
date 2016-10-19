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
public class Node {
    
    @XStreamAsAttribute
    @XStreamAlias("id")
    private String id;
    
    private Data data;

    public Node(String id, Data data) {
        this.id = id;
        this.data = data;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public Data getData() {
        return data;
    }

    public void setData(Data data) {
        this.data = data;
    }
    
    @Override
    public String toString(){
        return this.id;
    }
}
