package heranca;

public class Funcionario extends Pessoa {

    private String setor;
    private boolean trabalhando = false;

   // metodo trabalhando
    public void statusTrabalhando() {
        this.trabalhando = ! trabalhando;
        if (this.trabalhando) {System.out.println("'Status:' de Folga");}
        else {System.out.println("'Status:' Trabalhando");}


    }
    // Get e set
    public String getSetor() {return setor;}
    public void setSetor(String setor) {this.setor=setor;}

    public boolean isTrabalhando() { return this.trabalhando;
    }
    public void setTrabalhando(boolean trabalhando) {this.trabalhando=trabalhando;}

}
