package fj.classes;

// Classe pai

import fj.interfaces.iConta;

public abstract class Conta implements iConta {
        // atributos
        private  int agencia;
        private int numero;
        private double saldo;

         // expor acesso - getters
        // sem expor os modificadores ( setters )


    public int getAgencia() {
        return agencia;
    }

    public int getNumero() {
        return numero;
    }

    public double getSaldo() {
        return saldo;
    }

    @Override
    public void sacar(Double valor) {

    }

    @Override
    public void depositar(Double valor) {

    }

    @Override
    public void transferir(Conta contaDestino, Double valor) {

    }
}
