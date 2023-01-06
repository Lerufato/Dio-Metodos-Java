package retorno;

    /*Exercício:
     * Recrie a aplicação que calcula a área dos 3 quadriláteros notáveis. 
     * Agora faça os métodos retornarem valores.
     */

public class Quadrilatero {

    //método não executável, para usar o método, foi criada a classe main
    public static double area(double lado) { //nesse caso, o método tem um retorno, por conta da variável double, ao contário do void no exemplo de sobrecarga

        return lado * lado;
    }

    public static double area(double lado1, double lado2) {

        return lado1 * lado2;
    }

    public static double area(double baseMaior, double baseMenor, double altura) {

        return ((baseMaior+baseMenor)*altura) / 2;
    }
    
}
