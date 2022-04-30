/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package DATA;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

/**
 *
 * @author usuario
 */
public class CargarMatriz {

    /**
     * Metodo para Leer el archivo de texto con la configuracion inicial
     *
     * @throws FileNotFoundException
     * @throws IOException
     */
    public static String[][] Leer(int size) throws FileNotFoundException, IOException {
        
        String[][] SudokuString = new String[size][size];
        
        try {
            // creamos el archivo
            FileReader archivo = new FileReader(new File("ConfiguracionInicial.txt"));
            //creamos el BufferReader para leer
            BufferedReader lector = new BufferedReader(archivo);
            String linea;
            int numlinea = 0;
            while ((linea = lector.readLine()) != null) {
                String fila[] = linea.split("");
                for (int i = 0; i < fila.length; i++) {
                    SudokuString[numlinea][i] = fila[i];
//                    System.out.println(SudokuString[numlinea][i]);
                }
                numlinea++;
            }
            linea = lector.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        // ya temenos la matriz en string y se guadar en la clase matriz
         return SudokuString;
    }
}
