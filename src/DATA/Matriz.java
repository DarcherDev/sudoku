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
    private int matriz[][];
    private String SudokuString[][];
    private CargarMatriz cargarMatriz;

    public Matriz() {
        this.cargarMatriz = new CargarMatriz(this);
        this.matriz = new int[SIZE][SIZE];
        this.SudokuString = new String[SIZE][SIZE];
    }

    public Matriz(int[][] matriz) {
    }

  
    public static boolean estaEnFila(int matriz[][],int numero, int fila){
        //esto es para verificar si ya esta ese numero en la fila
        for(int i=0; i<SIZE;i++){
           if(matriz[fila][i]==numero){
               return true;
           }
        }
        return false;
    }

    public static boolean estaEnColumna(int matriz[][],int numero,int columna){
        //esto es para verificar si ya esta ese numero en la columna
        for(int i=0; i<SIZE;i++){     public static boolean estaEnFila(int matriz[][],int numero, int fila){
        //esto es para verificar si ya esta ese numero en la fila
        for(int i=0; i<SIZE;i++){
           if(matriz[fila][i]==numero){
               return true;
           }
        }
        return false;
    }

    public static boolean estaEnColumna(int matriz[][],int numero,int columna){
        //esto es para verificar si ya esta ese numero en la columna
        for(int i=0; i<SIZE;i++){
           if(matriz[i][columna]==numero){
               return true;
           }
        }
       return false;
   }

   public static boolean estaEnel3x3(int matriz[][],int numero, int columna, int fila ){
       //esto es para verificar si ya esta ese numero en alguno de los cuadrantes de 3x3
       int fila3x3= fila - fila %3;
       int columna3x3= columna - columna%3;
       for(int i=fila3x3; i<fila3x3+3;i++){
           for(int j=columna3x3;j<columna3x3+3;j++){
               if(matriz[i][j]== numero){
                   return true;
               }

           }

       }

       return false;
   }

   public static boolean PosicionCorrecta(int matriz[][],int numero, int columna, int fila){
       //para saber si el numero colocado es correcto
       return !estaEnFila(matriz, numero, fila)&& !estaEnColumna(matriz, numero, columna)
       && !estaEnel3x3(matriz, numero, columna, fila);
   }

   public static boolean validarSudoku(int matriz[][]){
       /*aqui se va validar si el sudoku resuelto esta correcto, de lo contrario
       lo ira corrigiendo uno a uno hasta que llegue con la respuesta correcta
       */
       for(int fila=0; fila<SIZE;fila++){
           for(int columna=0; columna<SIZE;columna++){
               if(matriz[fila][columna]==0){
                   for(int numero=1;numero<= SIZE;numero++){
                      if( PosicionCorrecta(matriz, numero, columna, fila)){
                           matriz[fila][columna] = numero;
                           if(validarSudoku(matriz)){
                               return true;
                           }else{
                               matriz[fila][columna]=0;
                           }
                      }
                   }
                   return false;
               }
           }
       }
       return true;
   }


    /**
     * motodo que transforma la matriz tipo String
     * a una tipo Int
     */
    public void convertirStringAInt() {
        String guion = "-";
        //fors que recorren la matriz
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    //preguntamos si en la posicion es igual a "-"
                    if (SudokuString[i][j].equals(guion)) {
                        //si es true remplazamos el - por 0
                        this.matriz[i][j] = 0;
                    } else {
                        //si es false, asinamos el valor de la matriz
                        this.matriz[i][j] = Integer.parseInt(SudokuString[i][j]);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
    }

    /**
     * metodo que cargar el archivo txt para la matriz tipo String
     * y llama al meotodo convertirStringAInt()
     */
    public void cargarMatriz() {
        try {
            this.cargarMatriz.Leer();
        } catch (IOException ex) {
        }
        convertirStringAInt();
    }

    public void toStringMatriz() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                System.out.print("{" + matriz[i][j] + "}");
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
