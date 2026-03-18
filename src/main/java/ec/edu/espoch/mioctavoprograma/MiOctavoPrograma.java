/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package ec.edu.espoch.mioctavoprograma;

import java.util.Scanner;

/**
 *
 * @author PC-02
 */
public class MiOctavoPrograma {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        int[] ventas = new int[7];
        int valorTotal = 0;
        int valorMaximo = 0;
        int ventasSuperiorPromedio = 0;
        double promedio = 0;
        //solicitar al usuario ventas
        System.out.println("Ingrese valor de ventas");
        for (int i = 0; i < ventas.length; i++) {
            ventas[i] = entrada.nextInt();
            valorTotal = valorTotal + ventas[i];

        }
        promedio = (valorTotal / ventas.length);
        for (int i = 0; i < ventas.length; i++) {
            System.out.println("Venta " + i + ": " + ventas[i]);
        }

        for (int i = 0; i < ventas.length; i++) {
            if (ventas[i] > valorMaximo) {
                valorMaximo = ventas[i];

            }
            if (ventas[i] > promedio) {
                ventasSuperiorPromedio = ventasSuperiorPromedio + 1;

            }
            System.out.println("valor total: " + valorTotal);
            System.out.println("Promedio ventas: " + promedio);
            System.out.println("Valor Maximo: " + valorMaximo);
            System.out.println("N. dias superior promedio: " + ventasSuperiorPromedio);

        }

    }

}
