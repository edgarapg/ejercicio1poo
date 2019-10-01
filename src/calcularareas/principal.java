/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package calcularareas;

import javax.swing.JOptionPane;

public class principal {
    calcular ar;
    public static void main(String[] args) {
    principal prin=new principal();
    prin.calculararea();
    }
    public principal(){
        ar=new calcular();
    }
    
    public void calculararea(){
     ar.setRadio(6);  
     double a,b;
     a=4*Math.PI*Math.pow( ar.getRadio(), 2);
     b=(4*Math.PI*Math.pow( ar.getRadio(), 3))/3;
     JOptionPane.showMessageDialog(null,"resultado del area de la esfera= " +a);
     JOptionPane.showMessageDialog(null,"resultado del volumen de la esfera= " +b);
    }
}
