import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite o preço unitário do produto comprado:");
        Float produto = Float.valueOf(scanner.nextLine());
        System.out.println("Quantas unidades do produto você comprou?");
        Float unidades = Float.valueOf(scanner.nextLine());
        System.out.println("Valor em dinheiro pago pelo cliente");
        Float Valorp = Float.valueOf(scanner.nextLine());
        trocoVerificado(produto,unidades,Valorp);
    }

    private static void trocoVerificado(Float produto, Float unidades, Float valorp) {
        Float precoFinal = produto * unidades;
        Float troco = valorp - precoFinal;
        if(troco >= 0){
            System.out.println("Você tem R$ "+ troco + " de troco.");
        }else {
            System.out.println("Valor pago insuficiente, faltam R$. " + Math.abs(troco));
        }
    }
}

/**
 * Problema "troco_verificado"
 * Fazer um programa para calcular o troco no processo de pagamento de um produto de uma mercearia.
 * O programa deve ler o preço unitário do produto, a quantidade de unidades compradas deste produto,
 * e o valor em dinheiro dado pelo cliente. Seu programa deve mostrar o valor do troco a ser devolvido
 * ao cliente. Se o dinheiro dado pelo cliente não for suficiente, mostrar uma mensagem informando o
 * valor restante conforme exemplo.
 * Exemplo 1:
 * Preço unitário do produto: 8.00
 * Quantidade comprada: 2
 * Dinheiro recebido: 20.00
 * TROCO = 4.00
 * Exemplo 2:
 * Preço unitário do produto: 30.00
 * Quantidade comprada: 3
 * Dinheiro recebido: 70.00
 * DINHEIRO INSUFICIENTE. FALTAM 20.00 REAIS
 */