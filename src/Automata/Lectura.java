package Automata;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lectura {
    public int [] leerArchivo(String ruta){
        try {
            File archivo = new File(ruta);
            Scanner lectura = new Scanner(archivo);
            if (lectura.hasNextLine()){
                String linea = lectura.nextLine();
                String[] valores = linea.split("\\.");
             
                int [] resultado = new int [valores.length];
                for (int i=0; i<valores.length; i++){
                    resultado[i] = Integer.parseInt(valores[i]);
                } 
                lectura.close();
                return resultado;
            } else {
                System.out.println("Archivo vacio");
                return new int[0];
            }
        } catch (FileNotFoundException e) {
            System.out.println("Archivo no encontrado");
            e.printStackTrace();
            return new int[0];
        }
    }
}
