package Calculadora;

/**
 * Classe responsável por realizar operações matemáticas básicas de forma organizada
 * e com validações adequadas. Foi refatorada para melhorar legibilidade,
 * facilitar manutenção e aplicar boas práticas.
 */
public class calculadora {

    /** Soma dois valores. */
    public int somar(int a, int b) {
        return a + b;
    }

    /** Subtrai dois valores. */
    public int subtrair(int a, int b) {
        return a - b;
    }

    /** Multiplica dois valores. */
    public int multiplicar(int a, int b) {
        return a * b;
    }

    /**
     * Divide dois valores, garantindo que o divisor não seja zero.
     *
     * @throws IllegalArgumentException se o divisor for zero
     */
    public int dividir(int a, int b) {
        validarDivisor(b);
        return a / b;
    }

    /**
     * Método principal que decide qual operação executar
     * com base no operador informado.
     *
     * @throws IllegalArgumentException se o operador for inválido
     */
    public int calcular(int a, int b, String operador) {
        return switch (operador) {
            case "+" -> somar(a, b);
            case "-" -> subtrair(a, b);
            case "*" -> multiplicar(a, b);
            case "/" -> dividir(a, b);
            default -> lançarErroOperador(operador);
        };
    }

    // =========================
    // MÉTODOS AUXILIARES PRIVADOS
    // =========================

    /** Verifica se o divisor é zero para evitar erro de divisão. */
    private void validarDivisor(int b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisão por zero não é permitida.");
        }
    }

    /** Lança erro padronizado quando o operador não é reconhecido. */
    private int lançarErroOperador(String operador) {
        throw new IllegalArgumentException(
            "Operador inválido: " + operador + ". Use: +, -, * ou /.");
    }
}
