package aulas;
import java.util.Date;
import java.util.Scanner;

public class importar {

    static void main(String[] args) {

        Date d = new Date();
        System.out.println(d);

        //Strings
        var s = "Ola mundo ";
        System.out.println(s.toUpperCase().charAt(2));
        System.out.println(s.length());
        // Scanner
        Scanner input = new Scanner(System.in);
        System.out.println("Digite seu nome: ");
        var test = input.nextLine();


        System.out.println("Seu nome é: "+test);
        input.close();




    }
}
