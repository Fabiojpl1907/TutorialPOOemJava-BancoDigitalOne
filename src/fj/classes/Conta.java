package fj.classes;

// Classe pai

import fj.interfaces.iConta;

public abstract class Conta implements iConta {

        private static final int AGENCIA_PADRAO = 1 ;
        private static int SEQUENCIAL =1 ;

        // atributos
        protected int agencia;
        protected int numero;
        protected double saldo;

        // constutor de conta
        public Conta() {
           this.agencia = AGENCIA_PADRAO ;
           this .numero = SEQUENCIAL++;
        }


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
