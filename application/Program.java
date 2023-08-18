package application;

import producao.LinhaProducao;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Program {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        LinhaProducao linhaProducao = new LinhaProducao();

        linhaProducao.exibirValores();

        int opcao;

        do {
            System.out.println("-----------------------------");
            System.out.println("Opções: ");
            System.out.println("1 - Adicionar elementos na fila");
            System.out.println("2 - Processar fila");
            System.out.println("3 - Sair");
            System.out.println("-----------------------------");

            try {
                System.out.print("Digite a opção desejada: ");
                opcao = sc.nextInt();

                if (opcao == 1) {
                    System.out.print("Quantos itens deseja adicionar? ");
                    int quantidade = sc.nextInt();

                    Object[] elementos = new Object[quantidade];

                    for (int i = 0; i < quantidade; i++) {
                        System.out.println("Digite o item " + (i + 1) + ":");
                        elementos[i] = new Scanner(System.in).nextLine();
                    }

                    linhaProducao.adicionar(elementos);
                    linhaProducao.exibirValores();

                } else if (opcao == 2) {
                    System.out.print("Digite o id da maquina que deseja processar: ");
                    int id_maquina = sc.nextInt();
                    linhaProducao.processar(id_maquina);
                    linhaProducao.exibirValores();
                } else if (opcao == 3) {
                    System.out.println("Fim do programa!");
                } else {
                    System.out.println("Opção inválida!");
                }
            } catch (InputMismatchException e) {
                System.out.println("Entrada inválida! Digite um número inteiro.");
                sc.nextLine();
                opcao = 0;
            }
        } while (opcao != 3);

        sc.close();
    }
}
