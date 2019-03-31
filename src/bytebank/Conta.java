package bytebank;

public class Conta {

    protected double saldo;
    protected int agencia;
    protected int numero;
    protected String titular;

    protected void deposita(double valor) {
        this.saldo += valor;
    }

}
