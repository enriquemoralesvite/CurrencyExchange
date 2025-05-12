# Conversor de Monedas en Java 💱

Esta es una aplicación de consola desarrollada en Java que permite convertir entre distintas monedas utilizando un menú interactivo. El usuario puede elegir la conversión deseada, ingresar la cantidad, y recibir el resultado de forma clara y formateada.

## 📋 Características

- Conversión entre:
  - Dólar (USD) ⇄ Soles Peruanos (PEN)
  - Dólar (USD) ⇄ Real Brasileño (BRL)
  - Dólar (USD) ⇄ Euro (EUR)
- Menú interactivo en bucle hasta que el usuario elige salir
- Resultados con formato decimal (`%.2f`)
- Diseño simple y orientado a terminal

## 🛠 Requisitos

- Java JDK 8 o superior
- IDE o compilador de Java (Eclipse, IntelliJ, VS Code o terminal con `javac`)

## 🚀 Cómo ejecutar

1. Clona este repositorio o copia los archivos `.java` a tu proyecto local.
2. Asegúrate de tener una clase llamada `CurrencyService` con el método:

   ```java
   public double convertCurrency(String fromCurrency, String toCurrency, double amount)
