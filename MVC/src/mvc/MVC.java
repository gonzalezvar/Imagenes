/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mvc;

import mvc.controladores.Controlador;
import mvc.modelos.Modelo;
import mvc.vistas.Vista;

/**
 *
 * @author 505
 */
public class MVC {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here  
         Modelo modelo = new Modelo();
         Vista vista = new Vista();
         vista.setVisible(true);
         Controlador controlador = new Controlador(modelo,vista);
         
         

    }
    
}
