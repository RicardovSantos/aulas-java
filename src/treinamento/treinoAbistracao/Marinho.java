package treinamento.treinoAbistracao;

public class Marinho extends Animal {

    private int nadadeiras = 0;


    @Override
    public void movimentar() {
        super.movimentar();
        System.out.println("usando as "+nadadeiras+" nadadeiras para nadar na água");
    }

    // get e set
    public int getNadadeiras() {return nadadeiras;}
    public void setNadadeiras(int nome) {this.nadadeiras = nome;}


    @Override
    public void respirar() {
        System.out.println(" Dentro da Água ");
    }
}
