package sobrecarga;

/*Exercício:
 * Criar uma aplicação que calcula a área dos 3 quadriláteros notáveis: 
 * quadrado, retângulo e trapézio.
 * Obs: Use sobrecarga.
 */

public class Quadrilatero {

    //método não executável, para usar o método, foi criada a classe main
    public static void area(double lado) {
    //quadrado tem lados iguais, por isso apenas uma variável lado
        System.out.println("Área do quadrado:" + lado * lado);
    }

    public static void area(double lado1, double lado2) {
    //retângulo tem 2 lados iguais, por isso lado1 e lado2
        System.out.println("Área do retângulo:" + lado1 * lado2);
    }

    public static void area(double baseMaior, double baseMenor, double altura) {
    //método de cálculo da área do trapézio, base Menor, baseMaior e altura
        System.out.println("Área do trapézio:" + ((baseMaior+baseMenor)*altura) / 2);
    }

    public static void area(float diagonal1, float diagonal2) {
    //método de cálcuo do losangulo, que usa as duas diagonais
        System.out.println("Área do losango:" + (diagonal1 * diagonal2)/2);
    }
}

/*Nesse execício tivemos o método com sobrecargas:
 * public static void area(double lado)
 * public static void area(double lado1, double lado2)
 * public static void area(double baseMaior, double baseMenor, double altura)
 * public static void area(float diagonal1, float diagonal2)
 * Todos as vezes mudou-se os parâmetros mantendo o nome do método
 */