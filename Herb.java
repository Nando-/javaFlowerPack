/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

import java.io.Serializable;

/**
 *
 * @author Nando-Main
 */
public class Herb extends Plant implements Serializable {
    
    private String color;
public String getColor() {
	return color;
}
public void setColor(String color) {
	this.color = color;
}
public String getMedicinal() {
	return medicinal;
}
public void setMedicinal(String medicinal) {
	this.medicinal = medicinal;
}
public String getSeasonal() {
	return seasonal;
}
public void setSeasonal(String seasonal) {
	this.seasonal = seasonal;
}
public String getFlavor() {
	return flavor;
}
public void setFlavor(String flavor) {
	this.flavor = flavor;
}
private String medicinal;
private String seasonal;
private String flavor;
}
