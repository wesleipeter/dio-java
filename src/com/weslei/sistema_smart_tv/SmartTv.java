package com.weslei.sistema_smart_tv;

public class SmartTv {
  public int canal = 1;
  public int volume = 25;
  public boolean tvLigada;

  public void imprime(){
    System.out.println("Canal: " +this.canal);
    System.out.println("Volume: " +this.volume);
  }
  public void ligar(){
    if(this.tvLigada != true){
      System.out.println("SmartTv - Desligada");
    }else {
      System.out.println("SmartTv - Ligada");
    }
  }
  public int trocarCanal (int canal){
    this.canal = canal;
    return canal;
  }
  public int alterarVolume(int volume){
    this.volume  = +volume;
    return  volume;
  }
}
