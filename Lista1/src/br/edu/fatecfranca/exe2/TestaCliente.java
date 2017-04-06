package br.edu.fatecfranca.exe2;
import javax.swing.JOptionPane;
public class TestaCliente {
    public static void main (String args[]){
        //FULANO
        //Crie o cliente Fulano
        Cliente Fulano = new Cliente();
        //Pergunta o número da conta
        Fulano.numeroConta = Integer.parseInt(JOptionPane.showInputDialog("informe o numero da conta 1:"));
        //Pergunta O numero da agencia 
        Fulano.numeroAgencia = Integer.parseInt(JOptionPane.showInputDialog("informe o numero da agencia do cliente " + Fulano.numeroConta + ":"));
        //Pergunta o nome do cliente
        Fulano.nome = JOptionPane.showInputDialog("Informe o nome do cliente " + Fulano.numeroConta + ":");
        //Pergunta o saldo do cliente
        Fulano.saldo = Float.parseFloat(JOptionPane.showInputDialog("informe o saldo da conta do cliente " + Fulano.numeroConta + ":"));
        
        //mostra os dados do cliente
        JOptionPane.showMessageDialog(null, Fulano.dadosCliente());
        
        //reslizar deposito
        float dep = Float.parseFloat(JOptionPane.showInputDialog("informe o valor do deposito:"));
        Fulano.realizarDeposito(dep);
        System.out.println("\nSaldo atual: " + Fulano.saldo); //mostra o saldo atual da conta
        //realizar saque
        float saq = Float.parseFloat(JOptionPane.showInputDialog("informe o valor do saque:"));
        Fulano.realizarSaque(saq);
        System.out.println("\nSaldo atual: " + Fulano.saldo); //mostra o saldo atual da conta
        
        //BELTRANO
        //Perguta os dados
        int nc = Integer.parseInt(JOptionPane.showInputDialog("informe o numero da conta 2:"));
        int na = Integer.parseInt(JOptionPane.showInputDialog("informe o numero da agencia do cliente " + nc + ":"));
        String no = JOptionPane.showInputDialog("Informe o nome do cliente " + nc + ":");
        float sa = Float.parseFloat(JOptionPane.showInputDialog("informe o saldo da conta do cliente " + no + ":"));
        
        //Cria o cliente Beltrano e salva os valores
        Cliente Beltrano = new Cliente(nc, na, no, sa);
        
        //mostra os dados do cliente
        JOptionPane.showMessageDialog(null, Beltrano.dadosCliente());
        
        //reslizar deposito
        dep = Float.parseFloat(JOptionPane.showInputDialog("informe o valor do deposito:"));
        Beltrano.realizarDeposito(dep);
        System.out.println("\nSaldo atual: " + Beltrano.saldo); //mostra o saldo atual da conta
        //realizar saque
        saq = Float.parseFloat(JOptionPane.showInputDialog("informe o valor do saque:"));
        Beltrano.realizarSaque(saq);
        System.out.println("\nSaldo atual: " + Beltrano.saldo); //mostra o saldo atual da conta
    }
}
