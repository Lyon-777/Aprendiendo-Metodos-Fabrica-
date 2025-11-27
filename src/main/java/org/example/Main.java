package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main(String[] args) {
       //Programar una funcion que permita calcular
        //el salario basico de un analista de datos de Sura
        //en contrato de practicas

        // tenga en cuenta lo siguiente
        // 1.calcular las cesantias
        // 2.calcular los intereses de las cesantias
        // 3. calcular la prima de servicios
        // 4. calcular las vacaciones

        //Paso 1 simulando el cliente para pedir datos
        Scanner leer = new Scanner(System.in);

        System.out.println("Digita el nombre del empleado: ");
        String nombre = leer.nextLine();

        System.out.println("Digita el documento del empleado: ");
        String documento = leer.nextLine();

        System.out.print("Digita el correo del empleado: ");
        String correo = leer.nextLine();

        System.out.print("Digita la direccion del empleado: ");
        String direccion = leer.nextLine();

        System.out.print(" Digita el numero de cuenta del empleado: ");
        String numeroCuenta = leer.nextLine();

        System.out.print("Digita la cantidad de horas extras");
        String cantidadHorasExtras = leer.nextLine();

        System.out.print("Digita el salario mensual deol empleado: ");
        Double salarioMensual = leer.nextDouble();

        System.out.print("Digita el valor de la hora: ");
        Double valorHora = leer.nextDouble();
      //Llamando o subscribiendo contratos con las funciones

      //llamando a calcular cesantias
      Double cesantias = calcular_Cesantias(salarioMensual,360);

      //llamando a calcular intereses de las cesantias
      Double interesesCesantias = calcular_intereses_cesantias(salarioMensual);

      //llamando a calcular prima de servicios
      Double primaServicios = calcular_prima_servicios(salarioMensual,360);

      //llamando a calcular vacaciones
      Double vacaciones =  calcular_vacaciones(salarioMensual);

      Double totalLiquidacion = cesantias + interesesCesantias + primaServicios + vacaciones;
      
        //Salidas
        System.out.println("Cesantias: " + cesantias);
        System.out.println("Intereses de cesantias: " + interesesCesantias);
        System.out.println("Prima de servicios: " + primaServicios);
        System.out.println("Vacaciones: " + vacaciones);

    }

    //Fabrica de funciones
    public static Double calcular_Cesantias(Double salarioMensaul, Integer diasTrabajados){
        Double censantias = salarioMensaul * (diasTrabajados/360);
        return censantias;
    }

    public static Double calcular_intereses_cesantias(Double salarioMensual){
        Double intereses = salarioMensual * 0.12;
        return intereses;
    }
    public static Double calcular_prima_servicios(Double salarioMensual,Integer diasTrabajados){
        Double prima = salarioMensual * (diasTrabajados/365);
        return prima;
    }
    public static Double calcular_vacaciones(Double salarioMensual){
        Double vacaciones = salarioMensual * 0.5;
        return vacaciones;
    }
}

