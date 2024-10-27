package Automata;

import java.util.Arrays;
public class App {
    public static void main(String[] args) {
        Lectura leer = new Lectura();
        String ruta = "C:\\PrograII2024B\\Deber03AFD\\AFD\\txt\\doc.txt";
        int[] resultado = leer.leerArchivo(ruta); // Solo lee la primera linea, no se como hacer que lea mas caracteres
        System.out.println("Ingreso monedas: " + Arrays.toString(resultado));

        int estadoInicial = 0;
        int e = -1;
        

        int [] estadosAceptacion = {1,6,9,16,19};
        String [] premios = {"chicle", "chupete", "agua", "fruta", "papas"};

        int [][] matrizEstado = {
            {e,10,5,e,e,e,25,e,e,50,e,e,e,e,e,e,e,e,e,100,e}, // q0
            {e,e,e,10,5,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q1
            {e,5,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q2
            {e,e,e,e,e,10,5,e,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q3
            {e,e,e,5,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q4
            {e,e,e,e,e,e,e,10,5,e,e,e,e,e,e,e,e,e,e,e,e}, // q5
            {e,e,e,e,e,e,5,e,e,e,25,e,e,e,e,e,50,e,e,e,e}, // q6
            {e,e,e,e,e,e,e,e,e,10,5,e,e,e,e,e,e,e,e,e,e}, // q7
            {e,e,e,e,e,e,e,5,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q8
            {e,e,e,e,e,e,e,e,e,e,e,10,5,e,e,e,25,e,e,50,e}, // q9
            {e,e,e,e,e,e,e,e,e,5,e,e,e,e,e,e,e,e,e,e,e}, // q10
            {e,e,e,e,e,e,e,e,e,e,e,e,e,10,5,e,e,e,e,e,e}, // q11
            {e,e,e,e,e,e,e,e,e,e,e,5,e,e,e,e,e,e,e,e,e}, // q12
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,10,5,e,e,e,e}, // q13
            {e,e,e,e,e,e,e,e,e,e,e,e,e,5,e,e,e,e,e,e,e}, // q14
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,10,5,e,e}, // q15
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,5,e,e,e,25,e}, // q16
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,10,5}, // q17
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,5,e,e,e}, // q18
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e}, // q19
            {e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,e,5,e}, // q20
        };

        ValidarEstado va = new ValidarEstado();
        for (int moneda : resultado) {
            estadoInicial = va.cambiarEstado(estadoInicial, moneda, matrizEstado);
            if(estadoInicial == -1){
                System.out.println("Ingreso no valido");
            }
            if(va.verificarAceptacion(estadosAceptacion, estadoInicial)){
                System.out.println("Usted recibe:" + va.nombrarPremio(premios, estadosAceptacion, estadoInicial));
            } else{
                System.out.println("No se alcanco un premio, reingrese las monedas");
            }
        }
    }
}
