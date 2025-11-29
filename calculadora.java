package Calculadora;

/**
 * Classe Calculadora
 * -------------------
 * Esta classe representa uma calculadora simples, contendo apenas operações básicas.
 * O objetivo é demonstrar métodos puros (isto é, métodos que dependem apenas da entrada)
 * e centralizar tudo em um método “calcular”, que escolhe a operação baseada no operador informado.
 *
 * Cada método individual possui seu próprio propósito bem definido:
 *  - somar()       → realiza adição
 *  - subtrair()    → realiza subtração
 *  - multiplicar() → realiza multiplicação
 *  - dividir()     → realiza divisão com verificação de erro (divisão por zero)
 *
 * A ideia desta classe é ser simples, reutilizável e clara.
 */
public class calculadora {

    /**
     * Realiza a soma entre dois números inteiros.
     *
     * @param a primeiro valor da operação
     * @param b segundo valor da operação
     * @return o resultado de a + b
     *
     * Esta operação é direta, sem risco de erro.
     */
    public int somar(int a, int b) {
        return a + b;
    }

    /**
     * Realiza a subtração entre dois números inteiros.
     *
     * @param a valor inicial
     * @param b valor que será subtraído
     * @return a diferença entre a e b
     *
     * Também não possui tratamento de erro, pois subtração sempre é válida.
     */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /**
     * Multiplica dois números inteiros.
     *
     * @param a primeiro valor
     * @param b segundo valor
     * @return o resultado de a * b
     *
     * Assim como soma e subtração, esta operação é sempre segura.
     */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide um número pelo outro, com verificação para impedir divisão por zero.
     *
     * @param a dividendo
     * @param b divisor
     * @return o resultado de a / b, caso b seja diferente de zero
     *
     * @throws IllegalArgumentException se o divisor for zero
     *
     * Este é o único método que exige um cuidado extra, porque divisão por zero é inválida.
     */
    public int dividir(int a, int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
        return a / b;
    }

    /**
     * Método central da calculadora.
     * --------------------------------
     * Ele recebe dois números e uma string representando o operador desejado.
     *
     * Operadores aceitos:
     *   "+" → chama o método somar()
     *   "-" → chama o método subtrair()
     *   "*" → chama o método multiplicar()
     *   "/" → chama o método dividir()
     *
     * Caso qualquer outro operador seja informado, uma exceção é lançada,
     * pois significa que o usuário passou algo inesperado que não faz parte das operações conhecidas.
     *
     * @param a primeiro número
     * @param b segundo número
     * @param operador símbolo da operação desejada
     * @return o resultado da operação correspondente
     *
     * @throws IllegalArgumentException caso o operador não seja válido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> throw new IllegalArgumentException(
                "Operador inválido: " + operador +
                ". Operadores aceitos: +, -, *, /."
            );
        };
    }
}
