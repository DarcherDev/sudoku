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
import javax.swing.JTextField;

/**
 *
 * @author Camilo Aristizabal B
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

    public void mostrarNumeros(JTextField[][] jtextfields) {
        Control control = this.sudokus.get(this.sudokus.size() - 1);
        Matriz matriz = control.getMatrizOriginal();

        for (int i = 0; i < control.getSIZE(); i++) {
            for (int j = 0; j < control.getSIZE(); j++) {
                if (matriz.getMatriz()[i][j] > 0) {
                    String numero = String.valueOf(matriz.getMatriz()[i][j]);
                    jtextfields[i][j].setText(numero);
                }
            }
        }
    }

    public boolean capturarNumero(int i, int j, int numero) {
        boolean validar = false;
        Control control = this.sudokus.get(this.sudokus.size() - 1);
        validar = control.PosicionCorrecta(control.getMatrizOriginal().getMatriz(), numero, i, j);
        System.out.println("valido un numero");
        if (validar) {
            System.out.println("numero validado es correcto");
            this.sudokus.add(control);
            this.sudokus.get(this.sudokus.size() - 1).ingresarNumero(i, j, numero);
        }
        return validar;
    }
}