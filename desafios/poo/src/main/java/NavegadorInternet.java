package main.java;

/**
 * classe NavegadorInternet.
 */
public class NavegadorInternet {

  /**
   * construtor default.
   */
  public NavegadorInternet() {
    System.out.println("NavegadorInternet");
  }

  /**
   * metodo para exibir pagina.
   *
   * @param String url.
   */
  public void exibirPagina(String url) {
    System.out.println("Exibindo página " + url);
  }

  /**
   * metodo para adicionar nova aba.
   */
  public void adicionarNovaAba() {
    System.out.println("Adicionando nova aba");
  }

  /**
   * metodo para fechar aba.
   */
  public void atualizarPagina() {
    System.out.println("Atualizando página");
  }

}
