package br.edu.fatecfranca.exe3;
public class Produto {
    //Criar variaveis
    public int id;
    public String descricao;
    public int qtde;
    public float preco;
    
    //Metodos construtores
    public Produto(){
        id = 0;
        descricao = "";
        qtde = 0;
        preco = 0;
    }
    public Produto(int ide, String de, int qt, float pr){
        id = ide;
        descricao = de;
        qtde = qt;
        preco = pr;
    }
    
    //Metodos
    public void comprar(int x){
        qtde = qtde + x;
    }
    public void vender(int x){
        qtde = qtde - x;
    }
    public void subir(float x){
        preco = preco + x;
    }
    public void descer(float x){
        preco = preco - x;
    }
    public String mostra(){
        return "Id: " + id +
               "\nDescrição: " + descricao +
               "\nQuantidade: " + qtde +
               "\nPreço: " + preco;
    }
}
