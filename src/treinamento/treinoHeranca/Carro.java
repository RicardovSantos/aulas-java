package treinamento.treinoHeranca;

public class Carro extends Veiculo implements CarroLuxo, Sportivo{
    private boolean airbag = false;

    // Metodo de ligar arbags par a segurança
    public void statusArbags() {
        airbag = ! airbag;
        if (airbag) {System.out.println(" Arbags acionados");}
        else { System.out.println("Airbags não ativos, por segurança ligue-os!");}
    }

    public boolean isAirbag() {return  airbag;}
    public void setAirbag(boolean airbag) {this.airbag = airbag;}

    @Override
    public void ligarTurbo() {
        setAceleracao(70);
        System.out.println(" Turbo ligado +"+getAceleracao()+"kms");
    }

    @Override
    public void desligarTurbo() {
    setAceleracao(50);
        System.out.println(" Turbo desligado "+getAceleracao()+"kms");
    }

    @Override
    public void ligarAr() {
        System.out.println("Ligar ArCondicionado 16°");
    }

    @Override
    public void desligarAr() {
        System.out.println("desligar ArCondicionado");

    }

    @Override
    public void parar() {
        setAceleracao(0);
    }
}
