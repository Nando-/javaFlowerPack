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

public class Fungus extends Plant implements Serializable {
private String Color;
public String getColor() {
	return Color;
}
public void setColor(String color) {
	Color = color;
}
public String getPoisonous() {
	return Poisonous;
}
public void setPoisonous(String poisonous) {
	Poisonous = poisonous;
}
private String Poisonous;
}
