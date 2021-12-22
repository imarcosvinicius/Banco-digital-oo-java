public class Main {

    public static void main(String[] args) {

        Cliente Joao = new Cliente();
        Joao.setNome("João das Neves");

        Conta cc = new ContaCorrente(Joao);
        cc.depositar(100);
        Conta cp = new ContaPoupanca(Joao);
        cc.trasferir(100, cp);

        cc.imprimirExtrato();
        cp.imprimirExtrato();
    }
}
