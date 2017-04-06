package br.edu.fatecfranca.exe3;
import javax.swing.JOptionPane;
public class TestaProduto {
    public static void main (String args[]){
        //Produto 1
        //Cria o produto
        Produto prod1 = new Produto();
        //insere valores
        prod1.id = Integer.parseInt(JOptionPane.showInputDialog("informe o numero de id 1:"));
        prod1.descricao = JOptionPane.showInputDialog("Informe a descrição do produto " + prod1.id + ":");
        prod1.qtde = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade do produto" + prod1.id + ":"));
        prod1.preco = Float.parseFloat(JOptionPane.showInputDialog("informe o preço do produto " + prod1.id + ":"));
        
        //Mostra as informações do produto
        JOptionPane.showMessageDialog(null, prod1.mostra());
        
        //realizar compra
        prod1.comprar(Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de produtos comprados:")));
        System.out.println("\nQuantidade atual: " + prod1.qtde); //mostra a quantidade atual de produtos 
        //realizar venda
        prod1.vender(Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de produtos vendidos:")));
        System.out.println("\nQuantidade atual: " + prod1.qtde); //mostra a quantidade atual de produtos 
        //subir preço
        prod1.subir(Float.parseFloat(JOptionPane.showInputDialog("informe quando deseja subir o preço:")));
        System.out.println("\nPreço atual: " + prod1.preco); //mostra o preço atual do produto
        //descer preço
        prod1.descer(Float.parseFloat(JOptionPane.showInputDialog("informe o quanto deseja descer o preço:")));
        System.out.println("\nPreço atual: " + prod1.preco); //mostra o preço atual do produto
        
        //Produto 2
        //cria variaveis
        int ide = Integer.parseInt(JOptionPane.showInputDialog("informe o numero de id 2:"));
        String de = JOptionPane.showInputDialog("Informe a descrição do produto " + ide + ":");
        int qt = Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade do produto" + ide + ":"));
        float pr = Float.parseFloat(JOptionPane.showInputDialog("informe o preço do produto " + ide + ":"));
        
        //Cria o produto 2
        Produto prod2 = new Produto(ide, de, qt, pr);
        
        //Mostra as informações do produto
        JOptionPane.showMessageDialog(null, prod2.mostra());
        
        //realizar compra
        prod2.comprar(Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de produtos comprados:")));
        System.out.println("\nQuantidade atual: " + prod2.qtde); //mostra a quantidade atual de produtos 
        //realizar venda
        prod2.vender(Integer.parseInt(JOptionPane.showInputDialog("informe a quantidade de produtos vendidos:")));
        System.out.println("\nQuantidade atual: " + prod2.qtde); //mostra a quantidade atual de produtos 
        //subir preço
        prod2.subir(Float.parseFloat(JOptionPane.showInputDialog("informe quando deseja subir o preço:")));
        System.out.println("\nPreço atual: " + prod2.preco); //mostra o preço atual do produto
        //descer preço
        prod2.descer(Float.parseFloat(JOptionPane.showInputDialog("informe o quanto deseja descer o preço:")));
        System.out.println("\nPreço atual: " + prod2.preco); //mostra o preço atual do produto
    }
}