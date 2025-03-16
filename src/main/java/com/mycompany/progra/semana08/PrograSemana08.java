/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.progra.semana08;

import Interfaces.Alimentacion;
import Interfaces.Animal;
import Interfaces.ComparableObjeto;
import Interfaces.Geometrica;
import Interfaces.Notificacion;
import Interfaces.Ordenable;
import Interfaces.Pago;
import Interfaces.Trabajador;
import Interfaces.Vehiculo;
import Modelos.Animales;
import Modelos.Bicicleta;
import Modelos.Circulo;
import Modelos.Coche;
import Modelos.CorreoElectronico;
import Modelos.Desarrollador;
import Modelos.Diseñador;
import Modelos.Gato;
import Modelos.ListaNumeros;
import Modelos.PagoConEfectivo;
import Modelos.PagoConTarjeta;
import Modelos.Perro;
import Modelos.Persona;
import Modelos.Producto;
import Modelos.Rectangulo;
import Modelos.SMS;

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
        
        //Notificacion
        Notificacion<String> correoElectronico = new CorreoElectronico();
        Notificacion<String> sms = new SMS();
        
        //Ordenable
        Ordenable<String> listaNumeros = new ListaNumeros();
        
        //Alimentacion
        Alimentacion<String> persona = new Persona();
        Alimentacion<String> animal = new Animales();

        //Comparable
        ComparableObjeto<String> laptop = new Producto("Laptop", 1200.50);

    }
}