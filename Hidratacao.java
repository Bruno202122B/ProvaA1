import java.util.Scanner;

public class Hidratacao {

    public static void main(String[] args) {

        String nome;
        double peso, aguaIngerida, aguaIdeal, aguaFalta;

        Scanner sc = new Scanner(System.in);

        System.out.print("Digite o nome do funcionário: ");
        nome = sc.nextLine();

        System.out.print("Digite o peso atual do funcionário em kg:");
        peso = sc.nextDouble();

        System.out.print("Digite a quantidade de água ingerida no dia: ");
        aguaIngerida = sc.nextDouble();

        aguaIdeal = Math.ceil(peso * 0.035);
        aguaFalta = aguaIdeal - aguaIngerida;

        System.out.println("Nome do funcionário: " + nome);
        System.out.printf("Peso do funcionário: %.1f kg\n", peso);
        System.out.printf("Quantidade de água ingerida: %.1f litros\n", aguaIngerida);
        System.out.printf("Quantidade ideal de água a ingerir: %.1f litros\n", aguaIdeal);

        if (aguaFalta <= 0) {
            System.out.println("Parabéns, você atingiu a meta de hidratação diária!");
        } else {
            System.out.printf("Continue focado em se hidratar por hoje, ainda faltam %.1f litros! Você consegue!\n", aguaFalta);
        }

        sc.close();
    }
}
