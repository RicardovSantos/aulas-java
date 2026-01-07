package treinamento.treinoAbistracao;

public class Terrestre extends Animal {

    private int patas = 0;

    @Override
    public void movimentar() {
        super.movimentar();
        System.out.println("usando as "+patas+" patas para caminhar na terra");
    }

    public int getPatas() { return patas;}
    public void setPatas(int patas) {this.patas = patas;}


    @Override
    public void respirar() {
        System.out.println(" Fora da agua");
    }
}