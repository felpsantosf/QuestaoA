public class Desenvolvedor extends Funcionario{
  public Desenvolvedor(String nome, Integer id, Double salario){
    super(nome, id, salario);
  }

  @Override
  public Double calcularSalario(Double salarioBase) {
    return salarioBase*1.1;
  
  }
  
  
}
