package treinamento.treinoHeranca;

public class Moto extends Automovel {
    private boolean capacete = false;

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
