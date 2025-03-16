/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progra.semana08;

import Interfaces.Animal;
import Interfaces.Pago;
import Interfaces.Vehiculo;
import Modelos.Bicicleta;
import Modelos.Coche;
import Modelos.Gato;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTarjeta;
import Modelos.Perro;

/**
 *
 * @author marbellymoreno
 */
public class PrograSemana08 {

    public static void main(String[] args) {
        
        //Animal
        Animal<String> perro = new Perro();
        Animal<String> gato = new Gato();
        
        //Vehiculo
        Vehiculo<String> coche = new Coche();
        Vehiculo<String> bicicleta = new Bicicleta();
        
        //Pago
        Pago<String> PagoConEfectivo = new PagoConEfectivo();
        Pago<String> PagoConTarjeta = new PagoConTarjeta();
    }
}
