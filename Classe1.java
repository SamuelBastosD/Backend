import java.util.*;

public class Classe1 {
    public static void main(String[] args) {
        Scanner scnInputUsuario = new Scanner(System.in);
        System.out.println("Ola! Bem vindo a calculadora de Java. Digite o primeiro numero a ser calculado e tecle \"enter\".");
        int intInputUsuario1 = scnInputUsuario.nextInt();
        System.out.println("Digite o segundo numero a ser calculado e tecle \"enter\".");
        int intInputUsuario2 = scnInputUsuario.nextInt();
        System.out.println("Digite o numero da opção desejada e tecle:\"enter\".");
        String[] opcoes = Classe2.mostrarOpcoes();
        for(int count = 0; count < opcoes.length; count++){
            System.out.println(count + " - " + opcoes[count]);
        }
        int opcaoEscolhida = scnInputUsuario.nextInt();

        System.out.println("resultado da " + opcoes[opcaoEscolhida] + "é:" + Classe2.resultado(intInputUsuario1, intInputUsuario2, opcaoEscolhida));
        scnInputUsuario.close();   
    }
}