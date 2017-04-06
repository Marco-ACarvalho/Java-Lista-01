package br.edu.fatecfranca.exe0;
import javax.swing.JOptionPane;
public class ObjetosCarro {
    public static void main(String args[]){
        //criando os carro 1, 2 e 3
        Carro obj1 = new Carro();
        Carro obj2 = new Carro();
        Carro obj3 = new Carro(true, 20);
        //ligar o obj1
        obj1.ligar();
        //ligar o obj2
        obj2.ligar();
        //acelara o obj 1
        float x = Float.parseFloat(JOptionPane.showInputDialog("Acelerar obj1 de quanto?"));
        obj1.acelerar(x);
        //acelera o obj 2
        float y = Float.parseFloat(JOptionPane.showInputDialog("Acelerar obj2 de quanto?"));
        obj2.acelerar(y);
        //acelera o obj 3
        float z = Float.parseFloat(JOptionPane.showInputDialog("Acelerar obj3 de quanto?"));
        obj3.acelerar(z);
        //Mostra simples de impressão
        //System.out.println("Velocidade de obj1 " + obj2.velAtual);
        //System.out.println("Status do motor de obj1 " + obj2.statusMotor);
        //Imprimindo EM UMA JANELA os resultados do obj 2
        //JOptionPane.showMessageDialog(null, "Velocidade de obj2 " + obj2.velAtual);
        //JOptionPane.showMessageDialog(null, "Status do motor de obj2 " + obj2.statusMotor);
        //Imprimindo na tela os resultados
        System.out.println(obj1.paraString());
        System.out.println(obj2.paraString());
        System.out.println(obj3.paraString());
    }
}
