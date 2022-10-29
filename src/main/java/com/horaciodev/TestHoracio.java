package com.horaciodev;

/**
 *
 * @author Lopez19 > Horacio L.
 */
public class TestHoracio {

    //Ejercicio #1: Determinar el orden de numeros en un arreglo
    private String e1ordenNumeros(int[] numeros) {
        boolean desc = true, asc = true;

        for (int i = 1; i < numeros.length && (desc || asc); i++) {
            if (numeros[i - 1] < numeros[i]) {
                desc = false;
            }
            if (numeros[i - 1] > numeros[i]) {
                asc = false;
            }
        }

        if (asc || desc) {
            if (asc && desc) {
                return "Todos los numeros del arreglo son iguales";
            }
            return asc ? "ASCENDENTE" : "DESCENDENTE";
        }

        return "DESORDENADO";
    }

    public static void main(String[] args) {

        TestHoracio app = new TestHoracio();

        //Ejercicio #1
        int[] arr = {1, 1, 1, 1, 1};
        System.out.println("Orden del arreglo: " + app.e1ordenNumeros(arr));

    }
}
