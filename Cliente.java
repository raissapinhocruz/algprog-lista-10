public class Cliente {

    String nome;
    String telefone;
    String email;

    public Cliente(String nome, String telefone, String email) {
        this.nome = nome;
        this.telefone = telefone;
        this.email = email;
    }

    public void comprar() {
        System.out.println(nome + " realizou uma compra.");
    }

    public void consultarDados() {
        System.out.println("Cliente: " + nome);
        System.out.println("Telefone: " + telefone);
    }
}


