package com.weslei.curso_dio;

public class MInhaClasse {

  public  static  String nomeCompleto(String primeiroNome, String segundoNome){
    //return primeiroNome +" "+ segundoNome;
    return primeiroNome.concat("").concat(segundoNome);
  }
  public static void main(String[] args) {
    final String BR = "Brasil"; // Letra maiúscula o valor da variável não pode mudar.
    System.out.println("Olá, turma!");
    System.out.println(BR);

    String primeiroNome = "Weslei";
    String segundoNome= "Peter";
    String imprimir = nomeCompleto(primeiroNome, segundoNome);
    System.out.println(imprimir);

  }
}
