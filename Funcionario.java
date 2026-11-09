public class Funcionario {
    String nome;
    String cargo;
    double salario;

    public Funcionario(String nome, String cargo, double salario) {
        this.nome = nome;
        this.cargo = cargo;
        this.salario = salario;
    }

    public void trabalhar() {
        System.out.println(nome + " está trabalhando.");
    }

    public void receberSalario() {
        System.out.println("Salário: R$ " + salario);
    }
}

