package Calculadora;
/**
 * Classe responsável por executar testes manuais da classe {@link Calculadora}.
 *
 * Esta classe não realiza cálculos diretamente. Em vez disso, ela chama o
 * método calcular() da classe Calculadora para verificar se:
 *  - As operações básicas funcionam corretamente (+, -, *, /)
 *  - Exceções são disparadas quando necessário (divisão por zero e operador inválido)
 *
 * O objetivo desta classe é demonstrar o funcionamento da Calculadora e
 * facilitar a validação manual do comportamento do sistema.
 */

public class testeCalculadora {
     /**
     * Método principal que executa uma sequência de testes individuais.
     * Cada teste é executado dentro de um bloco try/catch para:
     *  - Exibir o resultado quando a operação é válida
     *  - Mostrar uma mensagem de erro quando houver exceção
     *
     * O formato adotado é simples e direto, ideal para estudos e demonstrações.
     */

    public static void main(String[] args) {

        calculadora calc = new calculadora();

        // ==========================
        // Testes de operações válidas
        // ==========================

        // Teste de adição
        try {
            System.out.println(" Teste de soma: 2 + 3 = " + calc.calcular(2, 3, "+"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

         // Teste de subtração
        try {
            System.out.println(" Teste de subtração: 10 - 4 = " + calc.calcular(10, 4, "-"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Teste de multiplicação
        try {
            System.out.println(" Teste de  mulltiplicação: 3 * 5 = " + calc.calcular(3, 5, "*"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // Teste de divisão válida
        try {
            System.out.println(" Tesde de divisão: 8 / 2 = " + calc.calcular(8, 2, "/"));
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        // ==============================
        // Testes que devem causar erro
        // ==============================

        // Teste de divisão por zero → deve lançar exceção dizendo que não é possível dividir por zero
        try {
            System.out.println("Teste de divisão por zero: 8 / 0 = " + calc.calcular(8, 0, "/"));
        } catch (Exception e) {
            System.out.println("Erro: " + e.getMessage());
        }

        // // Teste de operador inválido → deve lançar exceção dizendo o operador que deve ser usado
        try {
            System.out.println("  Teste de sinal do operador: 5 x 5 = " + calc.calcular(5, 5, "x"));
        } catch (Exception e) {
            System.out.println(" Erro: " + e.getMessage());
        }
    }
}
