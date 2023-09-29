package com.brayanvargas.app;

import javax.swing.*;

public class App {
    public static void main(String[] args) {

        ImageIcon icon = new ImageIcon("C:\\Users\\Usuario\\IdeaProjects\\JOptionPane\\src\\main\\java\\com\\brayanvargas\\resources\\icon.png");

        int resp1 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el primer numero"));
        int resp2 = Integer.parseInt(JOptionPane.showInputDialog(null, "Digite el segundo numero"));
        String[] operadores = {"Sumar", "Restar", "Multiplicar", "Dividir"};
        int operador = Integer.parseInt(String.valueOf(JOptionPane.showOptionDialog(null, "Elija la operacion que quiere hacer", "POO",
                JOptionPane.DEFAULT_OPTION, JOptionPane.INFORMATION_MESSAGE, icon, operadores, operadores[0])));
        System.out.println(operador);

        int resultado = 0;
        if (operador == 0) {
           resultado = resp1 + resp2;
        } else if (operador == 1) {
            resultado = resp1 - resp2;
        } else if (operador == 2) {
            resultado = resp1 * resp2;
        } else if (operador == 3) {
            resultado = resp1 / resp2;
        }
        JOptionPane.showMessageDialog(null, "Su resultado es " + resultado);
    }
}
