import java.util.ArrayList;
import java.util.List;

class Predio {
    private List<Andar> andares;

    public Predio() {
        andares = new ArrayList<>();
    }

    public void adicionarAndar(Andar andar) {
        andares.add(andar);
    }

    public double calcularPrecoTotal() {
        double precoTotal = 0.0;
        for (Andar andar : andares) {
            precoTotal += andar.calcularPrecoTotal();
        }
        return precoTotal;
    }
}
