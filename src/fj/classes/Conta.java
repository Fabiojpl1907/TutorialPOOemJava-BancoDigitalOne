package fj.classes;

// Classe pai

public class Conta implements iConta {
        // atributos
        private  int gencia;
        private int numero;
        private double saldo;

         // expor acesso - getters
        // sem expor os modificadores ( setters )

        public int getGencia() {
            return gencia;
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
