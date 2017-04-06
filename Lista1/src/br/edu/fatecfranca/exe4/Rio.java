package br.edu.fatecfranca.exe4;
public class Rio {
    //variaveis
    public String nome;
    public float nivel;
    public boolean poluido;
    
    //metodos construtores
    public Rio(){
        nome = "";
        nivel = 0;
        poluido = false;
    }
    public Rio(String no, float ni, boolean po){
        nome = no;
        nivel = ni;
        poluido = po;
    }
    
    //Outros metodos
    public void chover(float x){
        nivel = nivel + x;
    }
    public void ensolarar(float x){
        nivel = nivel - x;
    }
    public void limpar(){
        poluido = false;
    }
    public void sujar(){
        poluido = true;
    }
    public String mostrar(){
        String estado;
        if (poluido) {
            estado = "poluido.";
        }
        else estado = "limpo.";
        return "Nome do rio: " + nome +
                "\nNivel do rio: " + nivel +
                "\nO rio esta " + estado;
    }
}
