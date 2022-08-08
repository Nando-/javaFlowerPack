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
public class Flower extends Plant implements Serializable {
	public String getColor() {
		return Color;
	}
	public void setColor(String color) {
		this.Color = color;
	}
	public String getSmell() {
		return Smell;
	}
	public void setSmell(String smell) {
		this.Smell = smell;
	}
	public String getThorns() {
		return Thorns;
	}
	public void setThorns(String thorns) {
		this.Thorns = thorns;
	}
	private String Color;
	private String Smell;
	private String Thorns;

}
