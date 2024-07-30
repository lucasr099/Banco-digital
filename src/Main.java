

public class Main {
    public static void main(String[] args){
        Iconta cc = new ContaCorrente();
        cc.depositar(100);

        Iconta poupanca = new ContaPoupanca();

        cc.transferir(100, poupanca);

        cc.imprimirExtrato();
        poupanca.imprimirExtrato();
    }
}
