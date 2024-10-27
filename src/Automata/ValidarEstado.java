package Automata;

public class ValidarEstado {
    
    public int cambiarEstado(int estadoInicial, int monedas, int[][]matrizEstado){
        for (int i=0; i<matrizEstado[estadoInicial].length;i++){
            if (matrizEstado[estadoInicial][i] == monedas){
                estadoInicial = i;
                return estadoInicial;
            }
        }
        return -1;
    }

    public boolean verificarAceptacion (int [] aceptacion, int estadoInicial){
        for (int i=0; i<aceptacion.length; i++){
            if (aceptacion[i] == estadoInicial){
                return true;
            }
        }
        return false;
    }

    public String nombrarPremio (String[] premios, int[]estadosAceptacion, int estadoInicial){

        for (int i=0; i<estadosAceptacion.length;i++){
            if(estadosAceptacion[i] == estadoInicial){
                return premios[i];
            }
        }
        return "";
    }
}
