package treinamento;

public class carros {

   public static class Carro {
       String marca;
       String modelo;
       int ano;
       boolean ligado;
       double velocidadeAtual;

           public Carro(String marca,String modelo,int ano){
                this.marca = marca;
                this.modelo = modelo;
                this.ano = ano;
                this.ligado = false;
                this.velocidadeAtual = 0;
           }

       void ligar(){
           this.ligado = true;
           System.out.println("O "+this.modelo+" Ligou o Motor!");
       }

       void acelerar(double velocidade){
               if (this.ligado){
                   this.velocidadeAtual += velocidade;
                   System.out.println("Acelerando... Velocidade atual: "+this.velocidadeAtual+" km/h");
               }else{
                   System.out.println("Você precisa Ligar o carro Primeiro!");

               }
       }


   }

    static class Moto {
       public Moto(){
           System.out.println("Objeto Moto criado");
       }
}

    static void main(String[] args) {

    Carro meuCarro = new Carro("Toyota","Hillux",2020);

    System.out.println("Meu carro: "+meuCarro.marca+" "+meuCarro.modelo+" ano:"+meuCarro.ano);

    meuCarro.ligar();
    meuCarro.acelerar(90);




    }
}
