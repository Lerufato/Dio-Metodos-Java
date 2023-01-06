package criacao;

    /*Exercício:
     * Calcule as 4 operações básicas: soma, subtração, multiplicação e divisão. 
     * Sempre 2 valores devem ser passados.
     */

public class Calculadora {
    
    //método não executável, para usar os métodos, foi criada a classe main
     public static void soma(double numero1, double numero2) { //método que faz a soma

        double resultado = numero1 + numero2; //armazenando as informações na variável resultado

        System.out.println("A soma de " + numero1 + " + " + numero2 + " = " + resultado);
    }

    public static void subtracao(double numero1, double numero2) { //método que faz a subtração

        double resultado = numero1 - numero2;

        System.out.println("A subtracao de " + numero1 + " - " + numero2 + " = " + resultado);
    }

    public static void multiplicacao(double numero1, double numero2) { //método que faz a multiplicação

        double resultado = numero1 * numero2;

        System.out.println("A multiplicação de " + numero1 + " * " + numero2 + " = " + resultado);
    }

    public static void  divisao(double numero1, double numero2) { //método que faz a divisão

        double resultado = numero1 / numero2;

        System.out.println("A divisão de " + numero1 + " / " + numero2 + " = " + resultado);
    }

}
