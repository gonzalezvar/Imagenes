/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc.controladores;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import mvc.modelos.Modelo;
import mvc.vistas.Vista;

/**
 *
 * @author 505
 */
public class Controlador implements ActionListener{
    
    Modelo modelo = new Modelo();
    Vista vista = new Vista();

    public Controlador() {
    }
    
    public Controlador(Modelo modelo,Vista vista) {
        this.modelo = modelo;
        this.vista = vista;
        
        vista.jButton1.addActionListener(this);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
       
        modelo.setNumero1(Integer.parseInt(vista.cajaNum1.getText()));
        modelo.setNumero2(Integer.parseInt(vista.cajaNum2.getText()));
        
        
        vista.cajaNum3.setText(String.valueOf(modelo.sumar()));
    }
}
