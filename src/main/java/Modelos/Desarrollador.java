/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Trabajador;

/**
 *
 * @author marbellymoreno
 */
public class Desarrollador implements Trabajador<String> {
    @Override
    public String Trabajar() {
        return "El desarrollador empieza a programa el Backend del proyecto.";
    }
}
