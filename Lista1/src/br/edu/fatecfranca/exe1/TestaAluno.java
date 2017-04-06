package br.edu.fatecfranca.exe1;
import javax.swing.JOptionPane;
public class TestaAluno {
    public static void main(String args[]){
        //cria um objeto de Aluno
        Aluno obj1 = new Aluno();
        
        //Pergunta o número do aluno
        obj1.numeroAluno = Integer.parseInt(JOptionPane.showInputDialog("informe o numero do aluno 1:"));
        //Pergunta o nome do aluno
        obj1.nome = JOptionPane.showInputDialog("Informe o nome do aluno " + obj1.numeroAluno + ":");
        //Pergunta a idade do aluno
        obj1.idade = Integer.parseInt(JOptionPane.showInputDialog("informe a idade do aluno " + obj1.numeroAluno + ":"));
        //Pergunta a nota da p1 do aluno
        obj1.p1 = Float.parseFloat(JOptionPane.showInputDialog("informe a nota da P1 do aluno " + obj1.numeroAluno + ":"));
        //pergunta a nota da p2 do aluno
        obj1.p2 = Float.parseFloat(JOptionPane.showInputDialog("informe a nota da P2 do aluno " + obj1.numeroAluno + ":"));
        
        //Imprime as informações do obj1 chamando os valores
        System.out.println(obj1.dadosAluno());
        System.out.println("Nota final: " + obj1.notaFinal());
        System.out.println(obj1.passou());
        
        //pega outros valores
        int na = Integer.parseInt(JOptionPane.showInputDialog("informe o numero do aluno 2:"));
        String no = JOptionPane.showInputDialog("Informe o nome do aluno " + na + ":");
        int id = Integer.parseInt(JOptionPane.showInputDialog("informe a idade do aluno " + na + ":"));
        float n1 =Float.parseFloat(JOptionPane.showInputDialog("informe a nota da P1 do aluno " + na + ":"));
        float n2 = Float.parseFloat(JOptionPane.showInputDialog("informe a nota da P2 do aluno " + na + ":"));
        
        //cria outro objeto de Aluno
        Aluno obj2 = new Aluno(na, no, id, n1, n2);
        
        //Imprime as informações do obj2 chamando os valores
        System.out.println(obj2.dadosAluno());
        System.out.println("Nota final: " + obj2.notaFinal());
        System.out.println(obj2.passou());
    }
}
