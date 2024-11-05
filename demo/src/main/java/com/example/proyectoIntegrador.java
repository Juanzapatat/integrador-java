package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class proyectoIntegrador {
    public static void main(String[] args) {
        // Llamar metodos

        // Lammado del metodo contorlDEGastos
        ControlDeGastos control = new ControlDeGastos();
        control.controlDeGastos();

    }
}

// Contorl de gastos
class ControlDeGastos {

    static void controlDeGastos() {

        Scanner sc = new Scanner(System.in); // Creo un scanner para capturar datos

        ArrayList<String> controlGastos = new ArrayList<>(); // Para almacenar la infromación

        while (true) {
            // Creo el menu de Control de Gastos
            System.out.println("--------------------------------------------------");
            System.out.println("1.Registre control de gastos");
            System.out.println("2.Eliminar");
            System.out.println("3.Consultar Registro");
            // System.out.println("4.Regresar"); (Por ahora este NO)
            System.out.println("4.Cerrar Sesión");
            System.out.println("Seleccione una de las opciones disponibles :");
            // PENDIENTE DE CREAR EDITAR EN ESTA ZONA

            int opcion = sc.nextInt(); // "lee" la opcion del entrero dentro del menu

            if (opcion == 1) {
                // Creo una variable string para cada uno para que se almacenen los dayos
                // ingresados en el Arraylist
                System.out.println("Nombre del Gasto :");
                String ng = sc.next();
                controlGastos.add(ng);

                System.out.println("fecha separado por /: ");
                String fh = sc.next();
                controlGastos.add(fh);

                System.out.println("Monto del Gasto : ");
                String mg = sc.next();
                controlGastos.add(mg);

                System.out.println("Receptor : ");
                String rt = sc.next();
                controlGastos.add(rt);

                System.out.println("Categoría : ");
                String cg = sc.next();
                controlGastos.add(cg);

            } else if (opcion == 2) {
                System.out.println("Ingrese el nombre del gasto que desea eliminar:");
                String eliminar = sc.next();
                // Recorrer el ArrayList para buscar y eliminar
                for (int i = 0; i < controlGastos.size(); i++) {
                    if (controlGastos.get(i).equalsIgnoreCase(eliminar)) {
                        controlGastos.remove(i);
                        System.out.println("Gasto eliminado exitosamente.");
                        continue;

                    }

                }

            } else if (opcion == 3) {
                // acá se le permite al usuario revisar la información guardada
                System.out.println("Tu registro es :");
                for (int i = 0; i < controlGastos.size(); i++) {
                    System.out.println(controlGastos.get(i));

                }

            } else if (opcion == 4) {
                System.out.println("Su sesión se ha cerrado correctamente");
                break; // Si es opción 4 se termina el bucle
            }
        }
    }
}