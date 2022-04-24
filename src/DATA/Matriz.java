package DATA;

import static java.lang.Integer.SIZE;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class Matriz {

    private int SIZE = 9;
    private int matriz[][] = new int[SIZE][SIZE];
    private String SudokuString[][] = new String[9][9];
    private CargarMatriz cargarMatriz;

    public Matriz() {
        cargarMatriz = new CargarMatriz(this);
    }

    public Matriz(int[][] matriz) {
    }

    /**
     *
     *
     *
     *
     *
     *
     *
     *
     *
     */

     public static boolean estaEnFila(){
         return true;
     }

     public static boolean estaEnColumna(){
        return true;
    }

    public void convertirStringAInt() {

    }

    public void cargarMatriz() {
        convertirStringAInt();
    }

    public int[][] getMatriz() {
        return matriz;
    }

    public void setMatriz(int[][] matriz) {
        this.matriz = matriz;
    }

    public int getSIZE() {
        return SIZE;
    }

    public void setSIZE(int SIZE) {
        this.SIZE = SIZE;
    }

    public String[][] getSudokuString() {
        return SudokuString;
    }

    public void setSudokuString(String[][] SudokuString) {
        this.SudokuString = SudokuString;
    }

    public CargarMatriz getCargarMatriz() {
        return cargarMatriz;
    }

    public void setCargarMatriz(CargarMatriz cargarMatriz) {
        this.cargarMatriz = cargarMatriz;
    }
}
