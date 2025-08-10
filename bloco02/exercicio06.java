package bloco02;

// Classe Circulo com Encapsulamento

class Circulo {
    private double raio;

    public Circulo(double raio) {
        setRaio(raio);
    }

    public double getRaio() { return raio; }

    public void setRaio(double raio) {
        if (raio <= 0) {
            throw new IllegalArgumentException("Raio deve ser positivo!");
        }
        this.raio = raio;
    }

    public double calcularArea() {
        return Math.PI * raio * raio;
    }
}

// Teste
public class exercicio06 {
    public static void main(String[] args) {
        Circulo c = new Circulo(5.0);
        System.out.printf("Área: %.2f%n", c.calcularArea());
    }
}