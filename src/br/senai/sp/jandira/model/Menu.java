package br.senai.sp.jandira.model;

import java.util.Scanner;

public class Menu {

        Scanner scanner = new Scanner(System.in);
        Conta conta = new Conta();
        Cliente cliente = new Cliente();

        public void executarMenu(){

            boolean continuar = true;

            do {

                System.out.println("/-/-/-/-/-/   Menu  /-/-/-/-/-/");
                System.out.println("1 - Cadastrar Cliente");
                System.out.println("2 - Consultar Saldo");
                System.out.println("3 - Realizar Deposito");
                System.out.println("4 - Realizar Saque");
                System.out.println("5 - Sair");
                System.out.println("/-/-/-/-/-/-/-/-/-/-/-/-/-/-/-/");

                int optionClient = scanner.nextInt();
                scanner.nextLine();

                switch (optionClient) {

                    case 1:
                        cliente.cadastrarCliente();
                        break;

                    case 2:
                        conta.consultarSaldo();
                        break;

                    case 3:
                        System.out.print("Informe o valor para deposito: ");
                        double valorDeposito = scanner.nextDouble();
                        scanner.nextLine();
                        conta.realizarDeposito(valorDeposito);
                        break;

                    case 4:
                        System.out.print("Informe o valor para saque: ");
                        double valorSaque = scanner.nextDouble();
                        conta.avaliaSaque(valorSaque);
                        conta.realizarSaque(valorSaque);
                        break;

                    case 5:
                        continuar = false;
                        break;
                }
            } while (continuar);
        }
}
