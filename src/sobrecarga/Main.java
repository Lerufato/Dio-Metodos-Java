package sobrecarga;

public class Main {
    public static void main(String[] args) {

        // Quadrilátero
        System.out.println("Exercício quadrilátero");
        Quadrilatero.area(3);
        Quadrilatero.area(5d,5d); //nesse caso é necessário o uso do d, pois o método com dois parâmetros está duplicado, então precisa identificar o tipo de variável (double) que estamos chamando
        Quadrilatero.area(7,8,9);
        Quadrilatero.area(5f,5f); //nesse caso é necessário o uso do f, pois o método com dois parâmetros está duplicado, então precisa identificar o tipo de variável (float) que estamos chamando

    }
}
