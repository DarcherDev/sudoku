/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

/**
 *
 * @author Camilo Aristizabal B
 */
public class Matriz {

    private int size;
    private int matriz[][];
    private String SudokuString[][];

    public Matriz(int size) {
        this.size = size;
        this.matriz = new int[size][size];
        this.SudokuString = new String[size][size];
    }

    public void toStringMatriz() {
        for (int i = 0; i < size; i++) {
            for (int j = 0; j < size; j++) {
                System.out.print("{" + matriz[i][j] + "}");
            }
            System.out.println("");
        }
        System.out.println("===========================");
    }

    public void setNumero(int i, int j, int numero) {
        this.matriz[i][j] = numero;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public String[][] getSudokuString() {
        return SudokuString;
    }

    public void setSudokuString(String[][] SudokuString) {
        this.SudokuString = SudokuString;
    }

}
