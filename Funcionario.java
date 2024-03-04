public abstract class Funcionario {
  private String nome;
  private Integer id;
  public Double salario;

  public Funcionario(String nome, Integer id, Double salario) {
    this.nome = nome;
    this.id = id;
    this.salario = salario;
  }
  public String getNome() {
    return nome;
  }
  public void setNome(String nome) {
    this.nome = nome;
  }

  public Integer getId() {
    return id;
  }
  public void setId(Integer id) {
    this.id = id;
  }

  public Double getSalario() {
    return salario;
  }
  public void setSalario(Double salario) {
    this.salario = salario;
  }
  public abstract Double calcularSalario(Double salarioBase);

}
