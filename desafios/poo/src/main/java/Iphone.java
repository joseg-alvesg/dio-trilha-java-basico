package main.java;

/**
 * class Iphone
 */
public class Iphone {

  public static void main(String[] args) {
    System.out.println("Starting Iphone\n");

    exampleReprodutoMusical();
    exampleNavegadorInternet();
    exampleAparelhoTelefonico();
  }

  /**
   * example ReprodutorMusical.
   */
  private static void exampleReprodutoMusical() {
    ReprodutorMusical reprodutorMusical = new ReprodutorMusical();
    reprodutorMusical.tocar();
    reprodutorMusical.selecionarMusica("musica");
    reprodutorMusical.pausar();
    System.out.println();
  }

  private static void exampleNavegadorInternet() {
    NavegadorInternet navegadorInternet = new NavegadorInternet();
    navegadorInternet.exibirPagina("https://www.google.com");
    navegadorInternet.adicionarNovaAba();
    navegadorInternet.atualizarPagina();
    System.out.println();
  }

  private static void exampleAparelhoTelefonico() {
    AparelhoTelefonico aparelhoTelefonico = new AparelhoTelefonico();
    aparelhoTelefonico.ligar("999999999");
    aparelhoTelefonico.atender();
    aparelhoTelefonico.iniciarCorreioVoz();
    System.out.println();
  }

}
