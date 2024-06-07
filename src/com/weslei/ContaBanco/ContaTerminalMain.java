package com.weslei.ContaBanco;
import java.util.Scanner;

public class ContaTerminalMain {
  public static void main(String[] args) {
    ContaTerminal conta = new ContaTerminal();
    Scanner scanner = new Scanner(System.in);

    System.out.println("Terminal X");
    System.out.print("Por favor, entre com o número da conta:");
    conta.setNumeroDaConta(scanner.nextInt());

    System.out.print("Entre com o número da agência: ");
    conta.setAgencia(scanner.next());

    System.out.print("Entre com o seu nome: ");
    conta.setNomeCliente(scanner.next());

    System.out.print("Digite o valor: ");
    conta.setSaldo(scanner.nextDouble());

    conta.imprimirDados();
  }


}
