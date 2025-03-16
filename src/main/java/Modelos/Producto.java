/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.ComparableObjeto;

/**
 *
 * @author marbellymoreno
 */
public class Producto implements ComparableObjeto<String> {
    private final String nombre;
    private final double precio;

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio;
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    @Override
    public String Comparar(Producto otro) {
        if (this.precio > otro.precio) {
            return this.nombre + " es mas caro que " + otro.nombre;
        } else if (this.precio < otro.precio) {
            return otro.nombre + " es mas caro que " + this.nombre;
        } else {
            return "Ambos productos tienen el mismo precio";
        }
    }
}