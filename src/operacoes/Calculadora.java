package operacoes;

public class Calculadora {

    protected double somaValores(double n1, double n2) {
        return n1 + n2;
    }

    protected double subtraiValores(double n1, double n2) {
        return n1 - n2;
    }

    protected double multiplicaValores(double n1, double n2) {
        return n1 * n2;
    }

    protected double divideValores(double n1, double n2) {
        try {
            return n1 / n2;
        } catch (ArithmeticException e) {
            System.out.println("Não é possível dividir um número por zero");
        }
        return 0;
    }

}
