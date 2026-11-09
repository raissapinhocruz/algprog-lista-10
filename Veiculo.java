public class Veiculo {

    String marca;
    String modelo;
    int ano;

    public Veiculo(String marca, String modelo, int ano) {
        this.marca = marca;
        this.modelo = modelo;
        this.ano = ano;
    }

    public void acelerar() {
        System.out.println(modelo + " está acelerando.");
    }

    public void frear() {
        System.out.println(modelo + " está freando.");
    }
}

