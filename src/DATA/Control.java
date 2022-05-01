package DATA;

import java.io.IOException;
import static java.lang.Integer.SIZE;
import java.util.Objects;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author usuario
 */
public class Control {

    private final int SIZE = 9;

    private Matriz matrizOriginal;
    private Matriz matrizResuelta;

    public Control() {
        matrizOriginal = new Matriz(SIZE);
        matrizResuelta = new Matriz(SIZE);
    }
    
    public Control clone() {
        Control c = new Control();
        c.setMatrizOriginal(this.matrizOriginal.clone());
        c.setMatrizResuelta(this.matrizResuelta.clone());
        return c;
    }

    //esto es para verificar si ya esta ese numero en la fila
    public boolean estaEnFila(int matriz[][], int numero, int fila) {
        for (int i = 0; i < SIZE; i++) {
            if (matriz[fila][i] == numero) {
                return true;
            }
        }
        return false;
    }

    //esto es para verificar si ya esta ese numero en la columna
    public boolean estaEnColumna(int matriz[][], int numero, int columna) {
        for (int i = 0; i < SIZE; i++) {
            if (matriz[i][columna] == numero) {
                return true;
            }
        }
        return false;
    }

    //esto es para verificar si ya esta ese numero en alguno de los cuadrantes de 3x3
    public static boolean estaEnel3x3(int matriz[][], int numero, int columna, int fila) {
        int fila3x3 = fila - fila % 3;
        int columna3x3 = columna - columna % 3;
        for (int i = fila3x3; i < fila3x3 + 3; i++) {
            for (int j = columna3x3; j < columna3x3 + 3; j++) {
                if (matriz[i][j] == numero) {
                    return true;
                }
            }
        }
        return false;
    }

    //para saber si el numero colocado es correcto
    public boolean posicionCorrecta(int matriz[][], int numero, int columna, int fila) {
        boolean resultado = false;
        if (!estaEnFila(matriz, numero, fila) && !estaEnColumna(matriz, numero, columna) && !estaEnel3x3(matriz, numero, columna, fila)) {
            resultado = true;
        }
        return resultado;
    }

    public void ingresarNumero(int i, int j, int numero) {
        this.matrizOriginal.setNumero(i, j, numero);
//        this.matrizOriginal.getMatriz()[i][j] = numero;
//        this.matrizOriginal.toStringMatriz();
    }

    public boolean validarResultador() {
        boolean resultado = true;
        Matriz original = getMatrizOriginal();
        Matriz resulta = getMatrizResuelta();
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (original.getMatriz()[i][j] != resulta.getMatriz()[i][j]) {
                    resultado = false;
                }
            }
        }
        return resultado;
    }

    /**
     * aqui se va validar si el sudoku resuelto esta correcto, de lo contrario
     * lo ira corrigiendo uno a uno hasta que llegue con la respuesta correcta
     *
     * @param matriz
     * @return
     */
    public boolean validarSudoku(int matriz[][]) {
        for (int fila = 0; fila < SIZE; fila++) {
            for (int columna = 0; columna < SIZE; columna++) {
                if (matriz[fila][columna] == 0) {
                    for (int numero = 1; numero <= SIZE; numero++) {
                        if (posicionCorrecta(matriz, numero, columna, fila)) {
                            matriz[fila][columna] = numero;
                            if (validarSudoku(matriz)) {
                                return true;
                            } else {
                                matriz[fila][columna] = 0;
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
     * motodo que transforma la matriz tipo String a una tipo Int
     */
    public void convertirStringAInt(Matriz matriz) {
        String guion = "-";
        //fors que recorren la matriz
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                try {
                    //preguntamos si en la posicion es igual a "-"
                    if (matriz.getSudokuString()[i][j].equals(guion)) {
                        //si es true remplazamos el - por 0
                        matriz.getMatriz()[i][j] = 0;
                    } else {
                        //si es false, asinamos el valor de la matriz
                        matriz.getMatriz()[i][j] = Integer.parseInt(matriz.getSudokuString()[i][j]);
                    }
                } catch (NumberFormatException e) {
                }
            }
        }
    }

    /**
     * metodo que cargar el archivo txt para la matriz tipo String y llama al
     * meotodo convertirStringAInt()
     */
    /**
     * metodo que cargar el archivo txt para la matriz tipo String y llama al
     * meotodo convertirStringAInt()
     */
    public void cargarMatriz() {
        try {
            //primero leemos el archivo y lo guardamos en las matrices
            this.matrizOriginal.setSudokuString(CargarMatriz.Leer(SIZE));
            this.matrizResuelta.setSudokuString(CargarMatriz.Leer(SIZE));
        } catch (IOException ex) {
        }

        //convertimos la matriz de string a integger
        convertirStringAInt(this.matrizOriginal);
        convertirStringAInt(this.matrizResuelta);

        //muestro en consola la matriz original tipo int
//        matrizOriginal.toStringMatriz();

        //resulevo la matriz y se muestra en consola
        validarSudoku(matrizResuelta.getMatriz());
//        matrizResuelta.toStringMatriz();
    }
    
    

    @Override
    public int hashCode() {
        int hash = 3;
        hash = 59 * hash + this.SIZE;
        hash = 59 * hash + Objects.hashCode(this.matrizOriginal);
        hash = 59 * hash + Objects.hashCode(this.matrizResuelta);
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Control other = (Control) obj;
        if (this.SIZE != other.SIZE) {
            return false;
        }
        if (!Objects.equals(this.matrizOriginal, other.matrizOriginal)) {
            return false;
        }
        if (!Objects.equals(this.matrizResuelta, other.matrizResuelta)) {
            return false;
        }
        return true;
    }

    public int getSIZE() {
        return SIZE;
    }

    public Matriz getMatrizOriginal() {
        return matrizOriginal;
    }

    public void setMatrizOriginal(Matriz matrizOriginal) {
        this.matrizOriginal = matrizOriginal;
    }

    public Matriz getMatrizResuelta() {
        return matrizResuelta;
    }

    public void setMatrizResuelta(Matriz matrizResuelta) {
        this.matrizResuelta = matrizResuelta;
    }

}
