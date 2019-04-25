//clase calculadora para llamarla desde método public static void main (String[] arg) {..} de clase principal
package CalculadoraJunit;

public class Calculadora {
// clase con constructor pasando dos numeros reales, setters , getters y métodos para devolver el resultado de sumar, restar , multiplicar y dividir

    public double suma(double numero1, double numero2) {
        double suma=numero1+numero2;
        return suma;
    }

    public double resta(double numero1, double numero2) {
        double resta=numero1-numero2;
        return resta;
    }

    public double multiplicacion(double numero1, double numero2){
        double multiplicacion=numero1*numero2;
        return multiplicacion;
    }
    public double division(double numero1, double numero2) {
        double division=numero1/numero2;
        return division;
    }

}