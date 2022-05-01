/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import DATA.Control;
import DATA.Matriz;
import GUI.Interfaz;
import java.util.ArrayList;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

/**
 *
 * @author usuario
 */
public class Validaciones {

    private ArrayList<Control> sudokus;

    public Validaciones() {
        Interfaz interfaz = new Interfaz(this);
        sudokus = new ArrayList<Control>();
        Control primero = new Control();
        primero.cargarMatriz();
        sudokus.add(primero);
    }

    public void mostrarNumeros(JTextField[][] jtextfields, int posicion) {
        System.out.println("posicion = " + posicion);
        Control control = this.sudokus.get(posicion);
        Matriz matriz = control.getMatrizOriginal();

        for (int i = 0; i < control.getSIZE(); i++) {
            for (int j = 0; j < control.getSIZE(); j++) {
                if (matriz.getMatriz()[i][j] > 0) {
                    String numero = String.valueOf(matriz.getMatriz()[i][j]);
                    jtextfields[i][j].setText(numero);
                } else {

                }
            }
        }
    }

    public boolean capturarNumero(int i, int j, int numero) {
        boolean validar = false;

        Control old = this.sudokus.get(this.sudokus.size() - 1);

        validar = old.posicionCorrecta(old.getMatrizOriginal().getMatriz(), numero, j, i);

        if (validar) {

            Control nuevo = old.clone();
            System.out.println("new");
            nuevo.getMatrizOriginal().toStringMatriz();
            
            nuevo.ingresarNumero(i, j, numero);
//            System.out.println("numero validado es correcto");
            System.out.println("old");
            old.getMatrizOriginal().toStringMatriz();

            this.sudokus.add(nuevo);

            boolean resuelto = this.sudokus.get(this.sudokus.size() - 1).validarResultador();

            if (resuelto) {
                JOptionPane.showMessageDialog(null, "a resuelto el sudoku, felicitaciones");
            }
        }
        return validar;
    }

    public void deshacer(int posicion) {
        System.out.println(posicion);
        Control control = this.sudokus.get(posicion);
//        control.getMatrizOriginal().toStringMatriz();
    }

    public void rehacer() {

    }
}
