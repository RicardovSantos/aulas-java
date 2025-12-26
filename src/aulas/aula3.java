package aulas;

import java.util.Scanner;

public class aula3 {
    static void main(String[] args) {

        Scanner entarda = new Scanner(System.in);
        System.out.println("Cadastro de Funcionário.");

        System.out.println("Nome: ");
        var nome = entarda.nextLine();

        System.out.println("Cargo: ");
        var cargo = entarda.nextLine();

        System.out.println("Idade: ");
        int idade = entarda.nextInt();
        entarda.close();


        System.out.print("Nome: "+nome+"\n Cargo: "+cargo+"\n Idade: "+idade);
        System.out.printf("\n\n Nome: %s \n Cargo: %s \n Idade: %d",nome ,cargo ,idade);




    }
}
