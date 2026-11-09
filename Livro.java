public class Livro {
    String titulo;
    String autor;
    int paginas;

    public Livro(String titulo, String autor, int paginas) {
        this.titulo = titulo;
        this.autor = autor;
        this.paginas = paginas;
    }

    public void ler() {
        System.out.println("Lendo o livro " + titulo);
    }

    public void apresentarLivro() {
        System.out.println("Título: " + titulo);
        System.out.println("Autor: " + autor);
    }
}


