package inheritance.abstraction;

public class B extends A implements D {

    @Override
    public int multiplicaValor(int valor1) {
        return valor1 * 2;
    }

    @Override
    public int suma(int val1, int val2) {
        return val1 + val2;
    }
}
