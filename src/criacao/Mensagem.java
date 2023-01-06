package criacao;

    /*Exercício:
     * A partir da hora do dia, informe a mensagem adequada: 
     * Bom dia, Boa tarde e Boa noite.
     */

public class Mensagem {

    //método não executável, para usar os métodos, foi criada a classe main
    public static void obterMensagem(int hora) { 
    //método para obter a mensagem de bom dia, boa tarde ou boa noite a partir do horário.

        switch (hora) { // se for de 5 a 12H, obter mensagem de bom dia
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
                mensagemBomDia(); //metodo mensagemBomDia criado dentro do método obterMensagem
                break; //após 12H deve parar de exibir mensagem de bom dia
            case 13:
            case 14:
            case 15:
            case 16:
            case 17:
                mensagemBoaTarde();
                break;
            case 18:
            case 19:
            case 20:
            case 21:
            case 22:
            case 23:
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
                mensagemBoaNoite();
                break;
            default: // usar o default para mostrar que valores fora desses são invalidos
                System.out.println("Hora inválida.");
                break;
        }
    }

    public static void mensagemBomDia() {
        System.out.println("Bom dia!");
    }

    public static void mensagemBoaTarde() {
        System.out.println("Bom tarde!");
    }

    public static void mensagemBoaNoite() {
        System.out.println("Bom noite!");
    }

}
