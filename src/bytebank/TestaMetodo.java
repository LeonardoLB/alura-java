package bytebank;

public class TestaMetodo {

    public static void main(String[] args) {

        Conta contaLeo = new Conta();

        System.out.println(contaLeo.saldo);
        contaLeo.deposita(200.0);
        System.out.println(contaLeo.saldo);

    }

}