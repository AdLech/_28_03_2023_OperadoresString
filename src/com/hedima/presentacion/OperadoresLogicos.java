package com.hedima.presentacion;

public class OperadoresLogicos {

    public static void main(String[] args) {
        //Operadores de Comparacion
        //Devulven un valor
        int a = 10;
        int b = 20;
        boolean resultado = a >= b;
        System.out.println(resultado);
        resultado = a <= b;
        System.out.println(resultado);

        int c = 10;
        int d = 10;
        resultado = c == d;
        System.out.println(resultado);
        resultado = c!= d;
        System.out.println(resultado);

        //Operadores Logicos
        //and &&
        //or ||
        // not!
        a=20;
        b=10;
        c=30;
        resultado = (a > b) && (a < c);
        System.out.println("and->"+resultado);
        resultado = (a > b) || (a < c);
        System.out.println(resultado);
        resultado =!(a > b);
        System.out.println(resultado);


    }
}
