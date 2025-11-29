package Calculadora;

/**
 * Classe TesteCalculadora
 * ------------------------
 * Esta classe existe apenas para demonstrar o funcionamento da Calculadora.
 * Aqui não realizamos cálculos “reais” para o usuário final; apenas testamos,
 * verificamos comportamento normal e conferimos como o programa reage quando recebe erros.
 *
 * O objetivo é:
 *   1. mostrar operações funcionando normalmente
 *   2. testar divisão por zero
 *   3. testar operador inválido
 *   4. demonstrar o uso de try/catch
 *
 * Esta classe é como um “laboratório” para a Calculadora.
 */
public class testeCalculadora {

    public static void main(String[] args) {

        // Criamos uma instância da calculadora para realizar os testes
        calculadora calc = new calculadora();
        // Primeira parte: operações comuns que não geram erros
        System.out.println(calc.calcular(2, 3, "+"));  // 2 + 3
        System.out.println(calc.calcular(10, 4, "-")); // 10 - 4
        System.out.println(calc.calcular(3, 5, "*"));  // 3 * 5
        System.out.println(calc.calcular(8, 2, "/"));  // 8 / 2

        // Segunda parte: teste de divisão por zero
        // Aqui esperamos que ocorra uma exceção, então usamos try/catch.
        try {
            System.out.println(calc.calcular(8, 0, "/")); // inválido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }

        // Terceira parte: teste com um operador que não existe
        try {
            System.out.println(calc.calcular(5, 5, "x")); // operador "x" não é reconhecido
        } catch (IllegalArgumentException e) {
            System.out.println("Erro capturado: " + e.getMessage());
        }
    }
}
