/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */


public class Rectangulo {
    // Atributos privados
    private String color;
    private double base;
    private double altura;
    private double area;
    private double perimetro;

    // Constructor público
    public Rectangulo(String color, double base, double altura) {
        this.color = color;
        this.base = base;
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    // Métodos para calcular el área y el perímetro
    private void calcularArea() {
        this.area = base * altura;
    }

    private void calcularPerimetro() {
        this.perimetro = 2 * (base + altura);
    }

    // Métodos para obtener los atributos
    public String getColor() {
        return color;
    }

    public double getBase() {
        return base;
    }

    public double getAltura() {
        return altura;
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

    public void setBase(double base) {
        this.base = base;
        calcularArea();
        calcularPerimetro();
    }

    public void setAltura(double altura) {
        this.altura = altura;
        calcularArea();
        calcularPerimetro();
    }

    // Método main para probar la clase
    public static void main(String[] args) {
        Rectangulo miRectangulo = new Rectangulo("Azul", 5.0, 10.0);
        
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
