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

 // Método para registrar facturas (Pendiente por comentar)
 static void registroDeFactura() {
    ArrayList<String> factura = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);
    
    while (true) {
        System.out.println(
        "Bienvenido al sistema de registro de facturas. Complete el formulario para procesar su registro.");
        System.out.println("--------------------------------------------------");
        System.out.println("Opciones:");
        System.out.println("1. Ingresar nombre");
        System.out.println("2. Ingresar monto");
        System.out.println("3. Ingresar proveedor");
        System.out.println("4. Ingresar empresa");
        System.out.println("5. Revisar factura");
        System.out.println("6. Finalizar registro");
        System.out.print("Seleccione una opción: ");
        
        int opciones = scanner.nextInt();
        scanner.nextLine();

        switch (opciones) {
            case 1:
                System.out.print("Ingrese el nombre: ");
                String nombre = scanner.nextLine();
                factura.add("Nombre: " + nombre);
                break;
            case 2:
                System.out.print("Ingrese el monto: ");
                String monto = scanner.nextLine();
                factura.add("Monto: " + monto);
                break;
            case 3:
                System.out.print("Ingrese el proveedor: ");
                String proveedor = scanner.nextLine();
                factura.add("Proveedor: " + proveedor);
                break;
            case 4:
                System.out.print("Ingrese la empresa: ");
                String empresa = scanner.nextLine();
                factura.add("Empresa: " + empresa);
                break;
            case 5:
                System.out.println("Revisión de factura:");
                for (String revision : factura) {
                    System.out.println(revision);
                }
                break;
            case 6:
                System.out.println("Registro de factura finalizado. ¡Gracias por su registro!");
                return; // Finalizar el método registroDeFactura
            default:
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");
                break;
        }
    }
}

  

}
