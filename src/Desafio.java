import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        float salarioAtualizado = 0;
        float percentualImposto = 0;
        float valorImposto = 0;

        Scanner leitorDados = new Scanner(System.in);

        System.out.println("Informe o sálario bruto: ");
        float salarioBruto = leitorDados.nextFloat();
        System.out.println("Informe o valor dos benefícios: ");
        float valorBeneficio = leitorDados.nextFloat();

        if (salarioBruto >= 0 && salarioBruto <= 1100) {
            percentualImposto = 0.05f;
        } else if (salarioBruto >= 1100.01 && salarioBruto <= 2500) {
            percentualImposto = 0.10f;
        } else if (salarioBruto > 2500) {
            percentualImposto = 0.15f;
        }

        valorImposto = salarioBruto * percentualImposto;
        salarioAtualizado = (salarioBruto - valorImposto) + valorBeneficio;

        System.out.println("Valor reajustado: " + salarioAtualizado);
    }
}
