package semana_6;

public class Operaciones extends Datos {

    public boolean par_impar() {
        return (this.getN1() % 2 == 0);
    }

    //sumar
    //double, numero decimal de 64 bits
    public double operacion(char simbolo) {
        switch (simbolo) {
            case '+':
                return this.getN1() + this.getN2();
            case '-':
                return this.getN1() - this.getN2();
            case '*':
                return this.getN1() * this.getN2();
            default:
                return this.getN1() / this.getN2();
        }

    }

}
