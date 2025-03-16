/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progra.semana08;

import Interfaces.Animal;
import Interfaces.Geometrica;
import Interfaces.Pago;
import Interfaces.Trabajador;
import Interfaces.Vehiculo;
import Modelos.Bicicleta;
import Modelos.Circulo;
import Modelos.Coche;
import Modelos.Desarrollador;
import Modelos.Diseñador;
import Modelos.Gato;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTarjeta;
import Modelos.Perro;
import Modelos.Rectangulo;

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
        
        //Geométrica
        double radio = 4;
        Geometrica<Double> circulo = new Circulo(radio);
        double ancho = 5;
        double alto = 3;
        Geometrica<Double> rectangulo = new Rectangulo(ancho, alto);
        
        //Trabajador
        Trabajador<String> desarrollador = new Desarrollador();
        Trabajador<String> diseñador = new Diseñador();
    }
}