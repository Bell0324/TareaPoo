/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tareapoo;

import java.util.Scanner;
import models.Empleado;

/**
 *
 * @author Bell0324
 */
public class TareaPoo {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // TODO code application logic here

        System.out.print("Ingrese el número de empleados: ");
        int numEmpleados = scanner.nextInt();
        scanner.nextLine(); 
        
        Empleado[] empleados = new Empleado[numEmpleados];

        for (int i = 0; i < numEmpleados; i++) {
            System.out.println("Ingrese los datos del empleado " + (i + 1) + ":");

            System.out.print("Nombres: ");
            String nombres = scanner.nextLine();

            System.out.print("Apellidos: ");
            String apellidos = scanner.nextLine();

            System.out.print("Cargo: ");
            String cargo = scanner.nextLine();

            System.out.print("Salario: ");
            double salario = scanner.nextDouble();
            scanner.nextLine(); 

            empleados[i] = new Empleado(nombres, apellidos, cargo, salario);
 
   }

        // Aqui aumente el salario de los empleados
        // mandando a llamar el metodo aumentar salario 
        // que se encuentra en la clase empleado
        for (Empleado emp : empleados) {
            emp.aumentarSalario();
        }

        // Mostrar los detalles de todos los empleados
        for (Empleado emp : empleados) {
            System.out.println(emp.toString());
            System.out.println(); 
        }

        scanner.close();
    }
}