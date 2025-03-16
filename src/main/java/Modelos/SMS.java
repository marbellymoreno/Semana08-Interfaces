/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Modelos;

import Interfaces.Notificacion;

/**
 *
 * @author marbellymoreno
 */
public class SMS implements Notificacion<String> {

    @Override
    public String EnviarNotificacion() {
        return "El usuario ha enviado un SMS.";
    }
}
