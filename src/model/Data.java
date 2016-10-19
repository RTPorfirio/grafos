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
public class Data {
    
    @XStreamAsAttribute
    @XStreamAlias("posX")
    private double posX;
    
    @XStreamAsAttribute
    @XStreamAlias("posY")
    private double posY;
    
    @XStreamAsAttribute
    @XStreamAlias("radius")
    private double radius;
    
    @XStreamAsAttribute
    @XStreamAlias("color")
    private String color;

    public Data() {
    }

    public Data(double posX, double posY, double radius, String color) {
        this.posX = posX;
        this.posY = posY;
        this.radius = radius;
        this.color = color;
    }

    public double getPosX() {
        return posX;
    }

    public void setPosX(double posX) {
        this.posX = posX;
    }

    public double getPosY() {
        return posY;
    }

    public void setPosY(double posY) {
        this.posY = posY;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }
    
}
