package treinamento.treinoHeranca;

public class Moto extends Veiculo {
    private boolean capacete = false;
// Metodo  de colocar o capacete para ter maior segurança
    public void colocarCapacete() {
        capacete = ! capacete;
        if (capacete) {
            System.out.println(" de capacete");
        } else {
            System.out.println(" sem capacete");
        }
    }
    public boolean isCapacete() {return capacete;}
    public void setCapacete(boolean capacete) {this.capacete = capacete;}

}
