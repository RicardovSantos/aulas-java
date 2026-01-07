package treinamento.treinoHeranca;

public class Veiculo {
    // Variaveis privadas do Pai
    private String nome;
    private  String marca;
    private boolean motor = false;
    private int aceleracao = 0;
    //metodos --------
    // virar a chave liga o motor, vira liga, vira desliga ( só desliga se aceleração for 0kms)
    public void motorVirarChave() {
        motor = !motor;  //alterna entre ligado e desligado

        if (aceleracao > 0 || motor==true) {  // veiculo em (movimento) ou (motor já ligado) entra e avisa
            System.out.println("Motor Ligado!"); //avisa q o motor esta ligado e sai com ligado
            motor = true; //

        } else {    // se as duas opções de cima estiverem falsas ele desliga
            System.out.println("Motor Desligado!");// (não está em movimento) e como o metodo alterna o motor ele eentrou como desligado
            motor = false;                          // no no if e os dois deu falso então else desliga
        }
    }
    // acelero o veiculo a +50 kms SE estiver ligado
    public void acelerar() {
        if (motor) { aceleracao += 50; System.out.println("Acelerando a "+aceleracao+"Kms");}
        else { System.out.println("Motor desligado, Por favor Ligue o motor!");}

    }
    // desacelera o veiculo se estiver maior de 0 kms
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
