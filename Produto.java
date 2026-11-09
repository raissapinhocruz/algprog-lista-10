public class Produto {

    String nome;
    double preco;
    int quantidade;

    public Produto(String nome, double preco, int quantidade) {
        this.nome = nome;
        this.preco = preco;
        this.quantidade = quantidade;
    }

    public void vender() {
        if (quantidade > 0) {
            quantidade--;
            System.out.println(nome + " foi vendido.");
        } else {
            System.out.println("Produto sem estoque.");
        }
    }
    public void consultarEstoque() {
        System.out.println("Estoque de " + nome + ": " + quantidade);
    }
}
   
