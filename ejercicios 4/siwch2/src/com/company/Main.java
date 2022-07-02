package com.company;

public class Main {

    public static void main(String[] args) {
	var estacion = "Verano";
    switch (estacion){
        case "Primavera":
        case "Verano":
        case "Otoño":
        case "Invierno":

            System.out.println("estamos en :"+ estacion);
            break;
        default:
            System.out.println("por favor revise el contenido");
    }
    }
}
