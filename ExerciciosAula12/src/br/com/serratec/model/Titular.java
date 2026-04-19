package br.com.serratec.model;

public class Titular {
    private Integer numero_conta;
    private String titular;
    private Double saldo;
    
    public Titular(Integer numero_conta, String titular, Double saldo) {
        this.numero_conta = numero_conta;
        this.titular = titular;
        this.saldo= saldo;
    }

    public Titular() {}

    @Override
    public String toString() {
        return "Titular [numero_conta=" + numero_conta + ", titular=" + titular + ", saldo=" + saldo + "]";
    }

    public String getTitular() {
        return titular;
    }

    public Double getSaldo() {
        return saldo;
    }

    public Integer getNumero_conta() {
        return numero_conta;
    }

}
