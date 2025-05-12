package com.currencyconverter;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        CurrencyService service = new CurrencyService();
        int option;
        do {
            System.out.print("*********************************\n" +
                    "Sea Bienvenido/a al Conversor de Monedas :D\n\n" +
                    "1) Dólar =>> Soles Peruanos\n" +
                    "2) Soles Peruanos a =>>> Dólar\n" +
                    "3) Dólar =>> Real Brasileño\n" +
                    "4) Real Brasileño =>> Dólar\n" +
                    "5) Dólar =>> Euro\n" +
                    "6) Euro =>> Dólar\n" +
                    "7) Salir\n\n" +
                    "*********************************\n");
            // El usuario elige una opción
            System.out.print("Elija una opción válida:\n");

             option = scanner.nextInt();

            switch (option) {
                case 1:
                    System.out.println("Por favor, ingrese la cantidad en Dólares: ");
                    double amount1 = scanner.nextDouble();
                    double result1 = service.convertCurrency("USD", "PEN", amount1);
                    System.out.printf("La conversión de %.2f USD a PEN es: %.2f\n\n\n", amount1, result1);
                    break;
                case 2:
                    System.out.println("Por favor, ingrese la cantidad en Soles Peruanos: ");
                    double amount2 = scanner.nextDouble();
                    double result2 = service.convertCurrency("PEN", "USD", amount2);
                    System.out.printf("La conversión de %.2f PEN a USD es: %.2f\n\n\n", amount2, result2);
                    break;
                case 3:
                    System.out.println("Por favor, ingrese la cantidad en Dólares: ");
                    double amount3 = scanner.nextDouble();
                    double result3 = service.convertCurrency("USD", "BRL", amount3);
                    System.out.printf("La conversión de %.2f USD a BRL es: %.2f\n\n\n", amount3, result3);
                    break;
                case 4:
                    System.out.println("Por favor, ingrese la cantidad en Reales Brasileños: ");
                    double amount4 = scanner.nextDouble();
                    double result4 = service.convertCurrency("BRL", "USD", amount4);
                    System.out.printf("La conversión de %.2f BRL a USD es: %.2f\n\n\n", amount4, result4);
                    break;
                case 5:
                    System.out.println("Por favor, ingrese la cantidad en Dólares: ");
                    double amount5 = scanner.nextDouble();
                    double result5 = service.convertCurrency("USD", "EUR", amount5);
                    System.out.printf("La conversión de %.2f USD a EUR es: %.2f\n\n\n", amount5, result5);
                    break;
                case 6:
                    System.out.println("Por favor, ingrese la cantidad en Euros: ");
                    double amount6 = scanner.nextDouble();
                    double result6 = service.convertCurrency("EUR", "USD", amount6);
                    System.out.printf("La conversión de %.2f EUR a USD es: %.2f\n\n\n", amount6, result6);
                    break;
                case 7:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida. Por favor, elija una opción entre 1 y 7.");
                    break;
            }
        } while (option != 7);

        scanner.close();

    }
}

