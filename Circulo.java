/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

public class Circulo {
    // Atributos privados
    private String color;
    private double diametro;
    private double area;
    private double perimetro;

    // Constructor público
    public Circulo(String color, double diametro) {
        this.color = color;
        this.diametro = diametro;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos para calcular el área y el perímetro
    private void calcularArea() {
        this.area = Math.PI * Math.pow(diametro / 2, 2);
    }

    private void calcularPerimetro() {
        this.perimetro = Math.PI * diametro;
    }

    // Métodos para obtener los atributos
    public String getColor() {
        return color;
    }

    public double getDiametro() {
        return diametro;
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

    public void setDiametro(double diametro) {
        this.diametro = diametro;
        calcularArea();
        calcularPerimetro();
    }

    // Método main para probar la clase
    public static void main(String[] args) {
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
    }
}

