public class Professor {
  
    String nome;
    String disciplina;
    double salario;

    public Professor(String nome, String disciplina, double salario) {
        this.nome = nome;
        this.disciplina = disciplina;
        this.salario = salario;
    }

    public void ensinar() {
        System.out.println(nome + " está ensinando " + disciplina);
    }

    public void corrigirProva() {
        System.out.println(nome + " está corrigindo provas.");
    }
}

