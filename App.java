public class App {
    public static void main(String[] args) {
       
        Sala sala1 = new Sala(50.0);
        Sala sala2 = new Sala(70.0);
        Sala sala3 = new Sala(30.0);

      
        Andar andar1 = new Andar(20.0); 
        andar1.adicionarSala(sala1);
        andar1.adicionarSala(sala2);

        Andar andar2 = new Andar(25.0); 
        andar2.adicionarSala(sala3);

        
        Predio predio = new Predio();
        predio.adicionarAndar(andar1);
        predio.adicionarAndar(andar2);

       
        double precoTotal = predio.calcularPrecoTotal();
        System.out.println("O preço total do aluguel do prédio é: R$ " + precoTotal);
    }
}
