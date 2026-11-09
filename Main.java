public class Main {
    public static void main(String[] args) {

        System.out.println("===== PESSOA =====");
        Pessoa pessoa = new Pessoa("Maria", 25, "12345678900", "maria@email.com");
        pessoa.falar();
        pessoa.andar();
        pessoa.comer();
        pessoa.dormir();

        System.out.println("\n===== FUNCIONÁRIO =====");
        Funcionario funcionario = new Funcionario("João", "Gerente", 3500);
        funcionario.trabalhar();
        funcionario.receberSalario();

        System.out.println("\n===== ALUNO =====");
        Aluno aluno = new Aluno("Pedro", "Java", 101);
        aluno.estudar();
        aluno.fazerProva();

        System.out.println("\n===== PROFESSOR =====");
        Professor professor = new Professor("Ana", "Programação", 4500);
        professor.ensinar();
        professor.corrigirProva();

        System.out.println("\n===== EMPRESA =====");
        Empresa empresa = new Empresa("Tech Solutions", "12345678000199", "Belo Horizonte");
        empresa.apresentar();
        empresa.contratar();

        System.out.println("\n===== PRODUTO =====");
        Produto produto = new Produto("Notebook", 3000, 5);
        produto.vender();
        produto.consultarEstoque();

        System.out.println("\n===== CLIENTE =====");
        Cliente cliente = new Cliente("Carlos", "31999999999", "carlos@email.com");
        cliente.comprar();
        cliente.consultarDados();

        System.out.println("\n===== CONTA BANCÁRIA =====");
        ContaBancaria conta = new ContaBancaria("Mariana", 123, 1000);
        conta.depositar(500);
        conta.sacar(200);
        conta.consultarSaldo();

        System.out.println("\n===== VEÍCULO =====");
        Veiculo veiculo = new Veiculo("Toyota", "Corolla", 2024);
        veiculo.acelerar();
        veiculo.frear();

        System.out.println("\n===== LIVRO =====");
        Livro livro = new Livro("Java para Iniciantes", "José Silva", 250);
        livro.ler();
        livro.apresentarLivro();
    }
}
