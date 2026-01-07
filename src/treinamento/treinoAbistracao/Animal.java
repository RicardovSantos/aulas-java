package treinamento.treinoAbistracao;

public abstract class Animal  {
    private String nome;


    public abstract void respirar();

    public void movimentar() {
        System.out.print("movimenta-se ");
    }


    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}



}
