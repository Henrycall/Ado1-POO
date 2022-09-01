/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ado1poo;


/**
 *
 * @author henry
 */
public class Estado {
    private String name;
    private double pib;  

 
    public String getName() {
        return name;
    }

    public Estado(String name, double pib) {
        this.name = name;
        this.pib = pib;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getPib() {
        return pib;
    }

    public void setPib(double pib) {
        this.pib = pib;
    }

    @Override
    public String toString() {
        return " " + "Estado = " + name + ", Pib por estado = " + pib + ""; // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/OverriddenMethodBody
    }
    
    
    
}
