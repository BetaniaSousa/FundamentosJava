//1 - pacote
        package fundamentos;

//2 - Bibliotecas

import java.util.Scanner;

//3 - Classe
public class Medidas {

    // 3.1 - Atributos
    static Scanner entrada = new Scanner(System.in); // instaciar

    // 3.2 M�todos e Fun��es
    public static void main(String[] args) {
        String opcao = "1";
        int area = 0; // receber o resultado dos c�lculos de �reas

        while(!opcao.toUpperCase().equals("S")){


            System.out.println("Escolha o C�lculo Desejado");
            System.out.println("(1) - area do Quadrado");
            System.out.println("(2) - area do Ret�ngulo");
            System.out.println("(3) - area do Tri�ngulo");
            System.out.println("(4) - area do C�rculo");
            System.out.println("(5) - Tabuada");
            System.out.println("(6) - Fibonacci");
            System.out.println("(7) - Contagem Regressiva");
            System.out.println("(8) - Divisao por Zero");
            System.out.println("(S) - Sair");



            opcao = entrada.nextLine(); // leitura da op��o
            switch (opcao) {
                case "1":
                    area = calcularAreaDoQuadrado();
                    break;
                case "2":
                    // ToDo: Calcular �rea do retangulo
                    break;
                case "5":
                    //tabuada();
                    break;
                case "6":
                   //fibonacci();
                    break;
                case "7":
                   //contagemRegressiva();
                    break;
                case "8":
                    //divisaoPorZero();
                    break;
                case "s":
                case "S":
                    System.out.println("Agradecemos pela preferencia! Fui!!");
                    break;
                default:
                    System.out.println("opcao Inv�lida: " + opcao);
            }
            if (area > 0){
                System.out.println("A area � de "+area +"m");

            }
        }
    }

    public static int calcularAreaDoQuadrado() {
        int lado; // tamanho da �rea do quadrado

        System.out.println("Digite o tamanho do lado: ");
        lado = entrada.nextInt(); // leitura do tamanho do lado
        return lado * lado; // retorna a �rea do quadrado
    }
}