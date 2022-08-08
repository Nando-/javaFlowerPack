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
public class Weed extends Plant implements Serializable {
    
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
public String getEdible() {
	return edible;
}
public void setEdible(String edible) {
	this.edible = edible;
}
public String getPoisonous() {
	return poisonous;
}
public void setPoisonous(String poisonous) {
	this.poisonous = poisonous;
}
private String medicinal;
private String edible;
private String poisonous;
    
}
