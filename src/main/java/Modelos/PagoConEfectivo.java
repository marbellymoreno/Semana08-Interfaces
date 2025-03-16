/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Pago;

/**
 *
 * @author marbellymoreno
 */
public class PagoConEfectivo implements Pago<String> {
    @Override
    public String ProcesarPago(Double Cantidad) {
        return "Pago de $" + Cantidad + " procesado a travez de un pago en efectivo.";
    }
}