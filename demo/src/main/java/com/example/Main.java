package com.example;

import java.util.Scanner;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {
        // Llamada de los metodos
        login();
        interfaz();
        controlDeGastos();
        registroDeFactura();
        reporteDeFinanzas();
    }

    // Metodo de login
    static void login() {

        Scanner sc = new Scanner(System.in); // Creo un scanner para capturar datos

        while (true) {
            System.out.print("Ingrese su nombre de Usuario: ");
            String nombreUsuario = sc.next();

            System.out.print("Ingrese su contraseña: ");
            String contrasena = sc.next();

            if (nombreUsuario.equals("ADMIN") && contrasena.equals("CESDE")) {
                // Inicio de sesión correcto
                System.out.println("Bienvenido, administrador!");
                break;
            } else {
                System.out.println("Nombre de Usuario o Contraseña incorrectos, intente de nuevo. ");

                sc.close();
            }
        }
    }

    // Método para ingresar a la interfaz
    static void interfaz() {
        Scanner scan = new Scanner(System.in);

        while (true) {
            System.out.println("------------------------------------------------------------------");
            System.out.println("Seleccione la función que desea realizar: ");
            System.out.println("1. Control de Gastos");
            System.out.println("2. Registro de Factura");
            System.out.println("3. Reporte de Finanzas");
            System.out.println("4. Salir");
            System.out.print("Ingrese el número de la opción deseada: ");

            int opcion = scan.nextInt();

            switch (opcion) {
                case 1:
                    // Ir a Control de Gastos
                    controlDeGastos();
                    break;
                case 2:
                    // Ir a Registro de Factura
                    registroDeFactura();
                    break;
                case 3:
                    // Ir a Reporte de Finanzas
                    reporteDeFinanzas();
                    break;
                case 4:
                    // Salir del programa
                    System.out.println("Gracias por usar el sistema. ¡Hasta luego!");
                    System.exit(0);
                default:
                    System.out.println("Opción no válida. Por favor, intente de nuevo.");
                    break;
            }
        }
    }

    // Método para controlar gastos
    static void controlDeGastos() {
        Scanner sc1 = new Scanner(System.in); // Creo un scanner para capturar datos

        ArrayList<String> controlGastos = new ArrayList<>(); // Para almacenar la información

        while (true) {
            // Crear el menú de Control de Gastos
            System.out.println("--------------------------------------------------");
            System.out.println("1. Registre control de gastos");
            System.out.println("2. Eliminar");
            System.out.println("3. Consultar Registro");
            System.out.println("4. Cerrar Sesión");
            System.out.print("Seleccione una de las opciones disponibles: ");

            int opcion = sc1.nextInt(); // Lee la opción del menú

            if (opcion == 1) {
                // Registro de un nuevo gasto
                System.out.print("Nombre del Gasto: ");
                String ng = sc1.next();
                controlGastos.add("Nombre del Gasto: " + ng);

                System.out.print("Fecha (separado por '/'): ");
                String fh = sc1.next();
                controlGastos.add("Fecha: " + fh);

                System.out.print("Monto del Gasto: ");
                String mg = sc1.next();
                controlGastos.add("Monto: " + mg);

                System.out.print("Receptor: ");
                String rt = sc1.next();
                controlGastos.add("Receptor: " + rt);

                System.out.print("Categoría: ");
                String cg = sc1.next();
                controlGastos.add("Categoría: " + cg);

                System.out.println("Gasto registrado exitosamente.");

            } else if (opcion == 2) {
                // Eliminar un gasto
                System.out.print("Ingrese el nombre del gasto que desea eliminar: ");
                String eliminar = sc1.next();

                boolean encontrado = false;
                for (int i = 0; i < controlGastos.size(); i++) {
                    if (controlGastos.get(i).contains(eliminar)) {
                        controlGastos.remove(i);
                        System.out.println("Gasto eliminado exitosamente.");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Gasto no encontrado.");
                }

            } else if (opcion == 3) {
                // Consultar los registros de gastos
                System.out.println("Tus registros son:");
                for (String gasto : controlGastos) {
                    System.out.println(gasto);
                }

            } else if (opcion == 4) {
                // Cerrar sesión
                System.out.println("Su sesión se ha cerrado correctamente.");
                break; // Salir del bucle
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
                sc1.close();
            }
        }
    }

    // Método para registrar facturas
    static void registroDeFactura() {
        ArrayList<String> factura = new ArrayList<>(); // Arreglo para almacenar informacion digitada
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("----------------------------------------------------------------------------------");
            System.out.println(
                    "Bienvenido al sistema de registro de facturas, Complete el formulario para procesar su registro.");
            System.out.println("Opciones:");
            // Se despliega el menu de opciones y se pide la usuario que elija una
            System.out.println("1. Registrar factura");
            System.out.println("2. Revisar factura");
            System.out.println("3. Finalizar registro");
            System.out.print("Seleccione una opción: ");

            int opciones = scanner.nextInt(); // Almacena la opcion digitada por el usuario
            scanner.nextLine(); // Dirige a la siguiente instruccíon dependiendo de la opcion seleccionada

            if (opciones == 1) {
                // Opcion de registro de factura (Se piden todos los datos)
                System.out.print("Ingrese el nombre: ");
                // Se captura el nombre ingresado por el usuario en la variable ´Nombre´
                String nombre = scanner.nextLine();
                // Se agrega lo ingresado al arraylist con el formato ´´nombre´
                factura.add("Nombre: " + nombre);

                System.out.print("Ingrese el monto: ");
                String monto = scanner.nextLine();
                factura.add("Monto: " + monto);

                System.out.print("Ingrese el proveedor: ");
                String proveedor = scanner.nextLine();
                factura.add("Proveedor: " + proveedor);

                System.out.print("Ingrese la empresa: ");
                String empresa = scanner.nextLine();
                factura.add("Empresa: " + empresa);

                System.out.println("Registro de factura completado exitosamente.");
            } else if (opciones == 2) {
                // Opción para revisar los datos almacenados
                System.out.println("Revisión de factura:");
                // Busca todos los datos ingresados en el arraylist ´factura´
                for (String revision : factura) {
                    System.out.println(revision);
                }
                // Opcion que permite el cierre de la funcionalidad
            } else if (opciones == 3) {
                System.out.println("Registro de factura finalizado.");
                break;
                // Se ejecuta en caso de error
            } else {
                System.out.println("Opción inválida. Por favor, seleccione una opción válida.");

                // Cierre de scanner
                scanner.close();
            }
        }
    }

    // Metodo para reporte de finanzas
    static void reporteDeFinanzas() {
        ArrayList<String> reporte = new ArrayList<>();
        Scanner scanner1 = new Scanner(System.in);

        while (true) {
            System.out.println("--------------------------------------------------");
            System.out.println(
                    "Bienvenido al sistema de reporte de finanzas. Complete el formulario para generar su reporte.");
            System.out.println("Opciones:");
            System.out.println("1. Registrar reporte");
            System.out.println("2. Eliminar reporte");
            System.out.println("3. Consultar reportes");
            System.out.println("4. Cerrar sesión");
            System.out.print("Seleccione una opción: ");

            int opcion = scanner1.nextInt();
            scanner1.nextLine(); // Limpiar el buffer de la entrada

            if (opcion == 1) {
                // Registrar un nuevo reporte
                System.out.print("Nombre del reporte: ");
                String nombreReporte = scanner1.nextLine();
                reporte.add("Nombre de reporte: " + nombreReporte);

                System.out.print("Fecha de expedición: ");
                String fechaExpidicion = scanner1.nextLine();
                reporte.add("Fecha de expedición: " + fechaExpidicion);

                System.out.print("Fecha de vencimiento: ");
                String fechaVencimiento = scanner1.nextLine();
                reporte.add("Fecha de vencimiento: " + fechaVencimiento);

                System.out.print("Monto del reporte: ");
                String montoReporte = scanner1.nextLine();
                reporte.add("Monto de reporte: " + montoReporte);

                System.out.print("Categoría del reporte: ");
                String categoriaReporte = scanner1.nextLine();
                reporte.add("Categoría de reporte: " + categoriaReporte);

                System.out.println("Reporte registrado exitosamente.");

            } else if (opcion == 2) {
                // Eliminar un reporte
                System.out.print("Ingrese el nombre del reporte que desea eliminar: ");
                String eliminar = scanner1.nextLine();

                boolean encontrado = false;
                for (int i = 0; i < reporte.size(); i++) {
                    if (reporte.get(i).contains(eliminar)) {
                        reporte.remove(i);
                        System.out.println("Reporte eliminado exitosamente.");
                        encontrado = true;
                        break;
                    }
                }

                if (!encontrado) {
                    System.out.println("Reporte no encontrado.");
                }

            } else if (opcion == 3) {
                // Consultar los reportes registrados
                System.out.println("Tus reportes son:");
                if (reporte.isEmpty()) {
                    System.out.println("No hay reportes registrados.");
                } else {
                    for (String finanza : reporte) {
                        System.out.println(finanza);
                    }
                }

            } else if (opcion == 4) {
                // Cerrar sesión
                System.out.println("Su sesión se ha cerrado correctamente.");
                break; // Salir del bucle

            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción correcta.");
            }
        }

        scanner1.close(); // Cerrar el scanner
    }

}
