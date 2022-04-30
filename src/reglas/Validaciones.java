/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package reglas;

import GUI.Interfaz;

/**
 *
 * @author Camilo Aristizabal B
 */
public class Validaciones {
    
    private Interfaz interfaz;

    public Validaciones(Interfaz interfaz) {
        this.interfaz = interfaz;
    }
    
    public void mostrarNumeros(){
        for (int i = 0; i < this.interfaz.sudoku.getSIZE(); i++) {
            for (int j = 0; j < this.interfaz.sudoku.getSIZE(); j++) {
                if(this.interfaz.sudoku.getMatrizOriginal().getMatriz()[i][j] > 0){
                    this.interfaz.matrizJTextField[i][j].setText(this.interfaz.sudoku.getMatrizOriginal().getSudokuString()[i][j]);
                }
            }
        }
    }
}
