package DATA;

import java.io.IOException;
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
    private String SudokuString[][] = new String[SIZE][SIZE];
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
    public static boolean estaEnFila() {
        return true;
    }

    public static boolean estaEnColumna() {
        return true;
    }

    public void convertirStringAInt() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (SudokuString[i][j].equals('-')) {
                    matriz[i][j] = 0;
                } else {
                    matriz[i][j] = Integer.parseInt(SudokuString[i][j]);
                }
            }
        }
    }

    public void cargarMatriz() {
        try {
            cargarMatriz.Leer();
        } catch (IOException ex) {
        }
        convertirStringAInt();
    }

    public void toStringMatriz() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("{" + SudokuString[i][j] + "}");
            }
            System.out.println("");
        }
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
