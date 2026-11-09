
    class Empresa {
    String nome;
    String cnpj;
    String endereco;

    public Empresa(String nome, String cnpj, String endereco) {
        this.nome = nome;
        this.cnpj = cnpj;
        this.endereco = endereco;
    }

    public void contratar() {
        System.out.println("A empresa " + nome + " está contratando.");
    }

    public void apresentar() {
        System.out.println("Empresa: " + nome);
    }
}

