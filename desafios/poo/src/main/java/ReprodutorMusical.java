package main.java;

/**
 * class ReprodutorMusical.
 */
public class ReprodutorMusical {

  /**
   * construtor default.
   */
  public ReprodutorMusical() {
    System.out.println("ReprodutorMusical");
  }

  /**
   * metodo para tocar musica.
   */
  public void tocar() {
    System.out.println("Tocando música");
  }

  /**
   * metodo para pausar musica.
   */
  public void pausar() {
    System.out.println("Pausando música");
  }

  /**
   * metodo para avancar musica.
   *
   * @param String musica
   */
  public void selecionarMusica(String musica) {
    System.out.println("Selecionando música " + musica);
  }

}
