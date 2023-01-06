package criacao;

    /*Exercício:
     * Calcule o valor final de um empréstimo, a partir do valor solicitado. 
     * Taxas e parcelas influenciam.
     * Defina arbitrariamente as faixas que influenciam nos valores.
     */

public class Emprestimo {

    //método não executável, para usar os métodos, foi criada a classe main
    public static int getDuasParcelas() { //método para gerar quantidade de parcelas
        return 2;
    }

    public static int getTresParcelas() {

        return 3;
    }

    public static double getTaxaDuasParcelas() { //método para gerar valor das taxas das parcelas

        return 0.3;
    }

    public static double getTaxaTresParcelas() {

        return 0.45;
    }

    //Método principal para calcular o valor das parcelas, incluindo as taxas
    public static void calcular(double valor, int parcelas) {

        if (parcelas == 2) {

            double valorFinal = valor + (valor * getTaxaDuasParcelas());

            System.out.println("Valor final do empréstimo para 2 parcelas: R$ " + valorFinal);
        } else if (parcelas == 3) {

            double valorFinal = valor + (valor * getTaxaTresParcelas());

            System.out.println("Valor final do empréstimo para 3 parcelas: R$ " + valorFinal);
        } else {
            System.out.println("Quantidade de parcelas não aceita.");
        }

    }

}
