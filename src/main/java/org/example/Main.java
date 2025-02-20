package org.example;

import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

       //Variables

        byte numero1=120;
            System.out.println("VARIABLE DE TIPO BYTE" + numero1);


            short numero2=30400;

        System.out.println("VARIABLE DE TIPO SHORT" + numero2);


        int numero3=235;
        System.out.println("VARIABLE DE TIPO IN" + numero3);

        long numero4=5623L;
        System.out.println("VARIABLE DE TIPO LONG" + numero4);


        //VARIABLES DECIMALES


        float decimal1=32.5f;
        System.out.println("VARIABLE DE TIPO float" + decimal1);


        double decimal2=125.6;
        System.out.println("VARIABLE DE TIPO DOUBLE" + decimal2);


        //VARIABLES DE TIPO CADENA DE CARACTER


        String nombre="Juan david bustos castro";
        System.out.println("VARIABLE DE TIPO CADENA DE CARACTER" + nombre);

        //VARIABLE DE TIPO CARACTER

        char letra= 'a';
        System.out.println("VARIABLE DE TIPO CHAR" + letra);


        //VARIABLE DE TIPO BOOLEAN


        boolean estado=true;
        System.out.println("VARIABLE DE TIPO BOOLEAN" + estado);



        //condicionales if/else


        Scanner teclado= new Scanner(System.in);
        double peso=60;
        double estatura=1.70;
        double IMC;

        System.out.println("INGRESE SU PESO");
        peso = teclado.nextDouble();

        System.out.println("INGRESE ESTATURA");
        estatura = teclado.nextDouble();


        IMC= peso /(estatura*estatura);
                System.out.println("El IMC ES:" + IMC);


        if(IMC < 20.761){
            System.out.println("PESO BAJO");
        }else if (IMC >20.761 && IMC < 24.99){
            System.out.println("PESO NORMAL");
        }










    }
}