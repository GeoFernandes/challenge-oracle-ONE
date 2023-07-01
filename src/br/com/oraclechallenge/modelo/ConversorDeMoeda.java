package br.com.oraclechallenge.modelo;

public class ConversorDeMoeda {

    public static double realDolar(double dolar) {
        return dolar * 4.79;
    }

    public static double realEuro(double euro) {
        return euro * 5.23;
    }

    public static double realLibras(double libras) {
        return libras * 6.09;
    }

    public static double realYenes(double yenes) {
        return yenes * 0.033;
    }

    public static double realWon(double won) {
        return won * 0.0036;
    }

    public static double dolarReal(double real) {
        return real / 4.79;
    }

    public static double euroReal(double real) {
        return real / 5.23;
    }

    public static double librasReal(double real) {
        return real / 6.09;
    }


}
