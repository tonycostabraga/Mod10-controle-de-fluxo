/**
 * Tony da Costa Braga::
 */
import java.util.Scanner;

public class LoopWhile {
    public static void main(String args[]) {

        double nota1, nota2, nota3, nota4, media;
        String nome;
        String escolha = "";
        Scanner r = new Scanner(System.in);

        System.out.println("BEM-VINDO(A) AO CALCULA MÉDIA. PARA APROVAÇÃO DIRETA É NECESSÁRIA MÉDIA NOTA IGUAL OU SUPERIOR A 7.0(SETE)\n");

        do {
            System.out.println("Digite seu Nome:");
            nome = r.next();
            System.out.println("POR FAVOR, DIGITE A NOTA DO PRIMEIRO BIMESTRE:");
            nota1 = r.nextDouble();
            System.out.println("POR FAVOR, DIGITE A NOTA DO SEGUNDO BIMESTRE:");
            nota2 = r.nextDouble();
            System.out.println("POR FAVOR, DIGITE A NOTA DO TERCEIRO BIMESTRE:");
            nota3 = r.nextDouble();
            System.out.println("POR FAVOR, DIGITE A NOTA DO QUARTO BIMESTRE:");
            nota4 = r.nextDouble();

            media = (nota1 + nota2 + nota3 + nota4) / 4;

            if (media >= 7.0) {
                System.out.println("Parabéns\t" + nome + " !! Sua média foi de " + media + "." + "Você está APROVADO!!");
            } else if (media > 7.0)
                System.out.println(nome + ", infelizmente você está de RECUPERAÇÃO. Sua média foi de " + media + "." + " Não se preocupe, você irá recuperar essa nota. Estude mais um pouco!!");
            else
                System.out.println(nome + "\tinfelizmente você está REPROVADO!!Sua média foi de" + media);

            System.out.println("Deseja calcular outra média?");
            escolha = r.next();

        }while (escolha.equals("sim"));

        System.out.println("Obrigado");
    }
}