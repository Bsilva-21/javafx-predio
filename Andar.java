import java.util.ArrayList;
import java.util.List;

public class Andar {
    private double valorPorMetroQuadrado; 
    private List<Sala> salas;

    public Andar(double valorPorMetroQuadrado) {
        this.valorPorMetroQuadrado = valorPorMetroQuadrado;
        this.salas = new ArrayList<>();
    }

    public void adicionarSala(Sala sala) {
        salas.add(sala);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0.0;
        for (Sala sala : salas) {
            precoTotal += sala.getTamanho() * valorPorMetroQuadrado;
        }
        return precoTotal;
    }
}
