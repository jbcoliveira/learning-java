
class ContaPoupanca extends Conta {

    @Override
    void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    @Override
    double getSaldo() {
        return this.saldo;
    }

    @Override
    void deposita(double valor) {
        this.saldo += valor;
    }

    @Override
    void saca(double valor) {
        this.saldo -= valor;
    }

    @Override
    void atualiza(double taxa) {
        this.saldo += this.saldo * taxa;

    }

}
