package br.edu.fatecfranca.exe0;
public class Carro {
    //declaração das variaveis
    public float velAtual;
    public boolean statusMotor;
    //métodos construtores
    public Carro(){ //Sem parametros
        //Inicializa variaveis - para não deixar com lixo
        velAtual = 0;
        statusMotor = false;
    }
    public Carro(boolean status, float vel){ //Com parametros
        velAtual = vel;
        statusMotor = status;
    }
    //declaração dos metodos
    public void ligar(){
        statusMotor = true;
        velAtual = 0;
    }
    public void desligar(){
        statusMotor = false;
        velAtual = 0;
    }
    public void acelerar(float x){
        velAtual = velAtual + x;
    }
    public void frear(float x){
        velAtual = velAtual - x;
    }
    public String paraString(){
        return "Velocidade: " + velAtual +
                "\n Status do motor: " + statusMotor;
    }
}
