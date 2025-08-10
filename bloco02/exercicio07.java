package bloco02;

//Herança de Veiculo

class Veiculo {
    protected String marca;
    protected String modelo;

    public Veiculo(String marca, String modelo) {
        this.marca = marca;
        this.modelo = modelo;
    }

    @Override
    public String toString() {
        return "Marca: " + marca + ", Modelo: " + modelo;
    }
}

class Carro extends Veiculo {
    private int numeroDePortas;

    public Carro(String marca, String modelo, int portas) {
        super(marca, modelo);
        this.numeroDePortas = portas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Portas: " + numeroDePortas;
    }
}

class Moto extends Veiculo {
    private int cilindradas;

    public Moto(String marca, String modelo, int cilindradas) {
        super(marca, modelo);
        this.cilindradas = cilindradas;
    }

    @Override
    public String toString() {
        return super.toString() + ", Cilindradas: " + cilindradas;
    }
}

// Teste
public class exercicio07 {
    public static void main(String[] args) {
        Veiculo c = new Carro("Fiat", "Uno", 4);
        Veiculo m = new Moto("Honda", "CB500", 500);
        System.out.println(c);
        System.out.println(m);
    }
}