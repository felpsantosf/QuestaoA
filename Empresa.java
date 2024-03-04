import java.util.ArrayList;
import java.util.List;

public class Empresa {
    private static List<Funcionario> Funcionario;

    public Empresa() {
        Empresa.Funcionario = new ArrayList<>();
    }

    public static void adicionarFuncionario(Funcionario funcionario) {
        Funcionario.add(funcionario);
    }

    public double calcularFolhaSalarial() {
        double total = 0;
        for (Funcionario f : Funcionario) {
            total += f.calcularSalario(total);
        }
        return total;
    }

    public List<Funcionario> getFuncionario() {
        return Funcionario;
    }

    public void setFuncionario(List<Funcionario> funcionario) {
        Funcionario = funcionario;
    }

    public Empresa(List<Funcionario> funcionario) {
        Funcionario = funcionario;
    }

    @Override
    public String toString() {
        return "\nEmpresa Funcionario=" + Funcionario ;
    }

}