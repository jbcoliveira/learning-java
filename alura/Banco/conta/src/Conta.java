
abstract class Conta {

    protected double saldo;

    abstract void setSaldo(double saldo);
    
    abstract double getSaldo();

    abstract void deposita(double valor);

    abstract void saca(double valor);

    abstract void atualiza(double taxa);
}
