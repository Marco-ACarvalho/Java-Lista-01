package br.edu.fatecfranca.exe2;
public class Cliente {
    //criação das variaveis 
    public int numeroConta, numeroAgencia;
    public String nome;
    public float saldo;
    //metodos construtores
    public Cliente(){
        numeroConta = -1;
        numeroAgencia = -1;
        nome = "";
        saldo = -1;
    }
    public Cliente(int nc, int na, String no, float sa){
        numeroConta = nc;
        numeroAgencia = na;
        nome = no;
        saldo = sa;
    }
    //metodos de deposito e saque
    public void realizarDeposito(float val){
        saldo = saldo + val;
    }
    public void realizarSaque(float val){
        saldo = saldo - val;
    }
    public String dadosCliente(){
        return "Número da conta: " + numeroConta +
               "\nNome do cliente: " + nome +
               "\nSaldo atual: " + saldo;
    }
    
}
