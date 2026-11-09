public class Aluno {
    String nome;
    String curso;
    int matricula;

    public Aluno(String nome, String curso, int matricula) {
        this.nome = nome;
        this.curso = curso;
        this.matricula = matricula;
    }

    public void estudar() {
        System.out.println(nome + " está estudando " + curso);
    }

    public void fazerProva() {
        System.out.println(nome + " está fazendo uma prova.");
    }
}
