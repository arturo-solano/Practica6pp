/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Main {
    public static void main(String[] args) {
        // Crear un objeto Circulo
        Circulo miCirculo = new Circulo("Rojo", 5.0);
        
        System.out.println("Color del círculo: " + miCirculo.getColor());
        System.out.println("Diámetro del círculo: " + miCirculo.getDiametro());
        System.out.println("Área del círculo: " + miCirculo.getArea());
        System.out.println("Perímetro del círculo: " + miCirculo.getPerimetro());

        // Cambiando el diámetro y mostrando los nuevos cálculos
        miCirculo.setDiametro(10.0);
        System.out.println("\nDespués de cambiar el diámetro:");
        System.out.println("Diámetro del círculo: " + miCirculo.getDiametro());
        System.out.println("Área del círculo: " + miCirculo.getArea());
        System.out.println("Perímetro del círculo: " + miCirculo.getPerimetro());

        System.out.println("\n--------------------------------------\n");

        // Crear un objeto Cuadrado
        Cuadrado miCuadrado = new Cuadrado("Azul", 5.0);
        
        System.out.println("Color del cuadrado: " + miCuadrado.getColor());
        System.out.println("Lado del cuadrado: " + miCuadrado.getLado());
        System.out.println("Área del cuadrado: " + miCuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.getPerimetro());

        // Cambiando el lado y mostrando los nuevos cálculos
        miCuadrado.setLado(10.0);
        System.out.println("\nDespués de cambiar el lado:");
        System.out.println("Lado del cuadrado: " + miCuadrado.getLado());
        System.out.println("Área del cuadrado: " + miCuadrado.getArea());
        System.out.println("Perímetro del cuadrado: " + miCuadrado.getPerimetro());

        System.out.println("\n--------------------------------------\n");

        // Crear un objeto HexagonoRegular
        HexagonoR miHexagono = new HexagonoR("Verde", 5.0);
        
        System.out.println("Color del hexágono regular: " + miHexagono.getColor());
        System.out.println("Lado del hexágono regular: " + miHexagono.getLado());
        System.out.println("Área del hexágono regular: " + miHexagono.getArea());
        System.out.println("Perímetro del hexágono regular: " + miHexagono.getPerimetro());

        // Cambiando el lado y mostrando los nuevos cálculos
        miHexagono.setLado(10.0);
        System.out.println("\nDespués de cambiar el lado:");
        System.out.println("Lado del hexágono regular: " + miHexagono.getLado());
        System.out.println("Área del hexágono regular: " + miHexagono.getArea());
        System.out.println("Perímetro del hexágono regular: " + miHexagono.getPerimetro());

        System.out.println("\n--------------------------------------\n");

        // Crear un objeto Rectangulo
        Rectangulo miRectangulo = new Rectangulo("Amarillo", 5.0, 10.0);
        
        System.out.println("Color del rectángulo: " + miRectangulo.getColor());
        System.out.println("Base del rectángulo: " + miRectangulo.getBase());
        System.out.println("Altura del rectángulo: " + miRectangulo.getAltura());
        System.out.println("Área del rectángulo: " + miRectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.getPerimetro());

        // Cambiando la base y altura y mostrando los nuevos cálculos
        miRectangulo.setBase(8.0);
        miRectangulo.setAltura(12.0);
        System.out.println("\nDespués de cambiar la base y altura:");
        System.out.println("Base del rectángulo: " + miRectangulo.getBase());
        System.out.println("Altura del rectángulo: " + miRectangulo.getAltura());
        System.out.println("Área del rectángulo: " + miRectangulo.getArea());
        System.out.println("Perímetro del rectángulo: " + miRectangulo.getPerimetro());
    }
}
