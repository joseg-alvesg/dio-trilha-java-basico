package main.java;

/**
 * classe AparelhoTelefonico.
 */
public class AparelhoTelefonico {

  /**
   * construtor default.
   */
  public AparelhoTelefonico() {
    System.out.println("AparelhoTelefonico");

  }

  /**
   * metodo para ligar.
   *
   * @param String numero.
   */
  public void ligar(String numero) {
    System.out.println("Ligando para " + numero);
  }

  /**
   * metodo para atender chamada.
   */
  public void atender() {
    System.out.println("Atendendo chamada");
  }

  /**
   * metodo para desligar chamada.
   */
  public void iniciarCorreioVoz() {
    System.out.println("Iniciando correio de voz");
  }

}
