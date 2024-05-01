/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class HexagonoR {
    // Atributos privados
    private String color;
    private double lado;
    private double area;
    private double perimetro;

    // Constructor público
    public HexagonoR(String color, double lado) {
        this.color = color;
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos para calcular el área y el perímetro
    private void calcularArea() {
        this.area = (3 * Math.sqrt(3) * Math.pow(lado, 2)) / 2;
    }

    private void calcularPerimetro() {
        this.perimetro = 6 * lado;
    }

    // Métodos para obtener los atributos
    public String getColor() {
        return color;
    }

    public double getLado() {
        return lado;
    }

    public double getArea() {
        return area;
    }

    public double getPerimetro() {
        return perimetro;
    }

    // Setters
    public void setColor(String color) {
        this.color = color;
    }

    public void setLado(double lado) {
        this.lado = lado;
        calcularArea();
        calcularPerimetro();
    }

    // Método main para probar la clase
    public static void main(String[] args) {
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
    }
}

