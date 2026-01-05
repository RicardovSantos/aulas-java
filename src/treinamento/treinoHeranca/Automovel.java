package treinamento.treinoHeranca;

public class Automovel {
    private String nome;
    private  String marca;
    private boolean motor = false;
    private int aceleracao = 0;
    //metodos
    public void motorVirarChave() {
        motor = !motor;

        if (aceleracao > 0 || motor==true) {
            System.out.println("Motor Ligado!");
            motor = true;

        } else {
            System.out.println("Motor Desligado!");
            motor = false;
        }
    }
    public void acelerar() {
        if (motor) { aceleracao += 50; System.out.println("Acelerando a "+aceleracao+"Kms");}
        else { System.out.println("Motor desligado, Por favor Ligue o motor!");}

    }
    public void desacelerar() {
        if (aceleracao>0) {aceleracao -= 50; System.out.println(" desacelerando a "+aceleracao+"Kms");}
        else {System.out.println("O veiculo "+nome+" já esta parado!");}
    }
    //get e set
    public String getNome() {return nome;}
    public void setNome(String nome) {this.nome = nome;}

    public String getMarca() {return marca;}
    public void setMarca(String marca) {this.marca = marca;}

    public boolean isMotor() {return motor;}
    public void setMotor(boolean motor) {this.motor = motor;}

    public int getAceleracao() {return aceleracao;}
    public void setAceleracao(int aceleracao) {this.aceleracao = aceleracao;}
}
