package bytebankHerdadoConta;

public class TesteContas {

    public static void main(String[] args){

        ContaCorrente cc = new ContaCorrente(111, 111);
        cc.deposita(100.0);

        ContaPoupanca cp = new ContaPoupanca(222,222);
        cp.deposita(200.0);

        System.out.println(cc.getSaldo());
        System.out.println(cp.getSaldo());

        cc.transfere(10.0, cp);

    }

}