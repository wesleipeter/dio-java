package com.weslei.curso_dio;

public class BoletimEstudantil {
  public static void main(String[] args) {
    float nota = 4;
    if (nota < 6){
      System.out.println("Reprovado!");
    } else if (nota == 6) {
      System.out.println("Prova Minerva");
    }else
      System.out.println("Aprovado!");
  }
}
