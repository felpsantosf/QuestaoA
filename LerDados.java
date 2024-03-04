public class LerDados {
  /**
   * @param args the command line arguments
   */
  public static void main(String[] args) {
      // TODO code application logic here
     double salarioBase = 1000;
      Desenvolvedor desenvolvedor = new Desenvolvedor("Roberto", 1,salarioBase);
      Gerente gerente = new Gerente("Thiago", 2,salarioBase);
      Suporte suporte = new Suporte("Felipe", 3, salarioBase);
      // System.out.println(desenvolvedor);
      // System.out.println(gerente);
      // System.out.println(suporte);

  
  Empresa empresa = new Empresa();

  Empresa.adicionarFuncionario(desenvolvedor);
  Empresa.adicionarFuncionario(gerente);
  Empresa.adicionarFuncionario(suporte);
  System.out.println(empresa);
  System.out.println("Folha Salarial Total: R$ " + empresa.calcularFolhaSalarial());


  

  }
}