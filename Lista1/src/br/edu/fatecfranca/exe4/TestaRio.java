package br.edu.fatecfranca.exe4;
import javax.swing.JOptionPane;
public class TestaRio {
    public static void main (String args[]){
        //Rio 1
        Rio rio1 = new Rio();
        rio1.nome = JOptionPane.showInputDialog("Informe o nome do rio:");
        rio1.nivel = Float.parseFloat(JOptionPane.showInputDialog("informe o nivel do rio:"));
        int resposta = JOptionPane.showConfirmDialog(null, "O rio está poluido?", "", JOptionPane.YES_NO_OPTION);
        if (resposta == JOptionPane.YES_OPTION) {
            rio1.poluido = true;
        } else if (resposta == JOptionPane.NO_OPTION) {
            rio1.poluido = false;
        }
        
        //Mostra as informações do rio 1 
        JOptionPane.showMessageDialog(null, rio1.mostrar());
        
        //chamando os metodos
        rio1.chover(Float.parseFloat(JOptionPane.showInputDialog("Quanto o rio subiu?")));
        System.out.println("\nNivel do rio: " + rio1.nivel); //mostra o nivel do rio atualizado
        rio1.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quanto o rio abaixou?")));
        System.out.println("\nNivel do rio: " + rio1.nivel); //mostra o nivel do rio atualizado
        rio1.limpar();
        System.out.println("\nPoluição: " + rio1.poluido);
        rio1.sujar();
        System.out.println("\nPoluição: " + rio1.poluido);
        
        //Rio 2
        //Variaveis
        String no = JOptionPane.showInputDialog("Informe o nome do rio 2:");
        float ni = Float.parseFloat(JOptionPane.showInputDialog("informe o nivel do rio 2:"));
        int resposta2 = JOptionPane.showConfirmDialog(null, "O rio 2 está poluido?", "", JOptionPane.YES_NO_OPTION);
        boolean po = false;
        if (resposta2 == JOptionPane.YES_OPTION) {
            po = true;
        } else if (resposta2 == JOptionPane.NO_OPTION) {
            po = false;
        }
        //Usando o segundo construtor
        Rio rio2 = new Rio(no, ni, po);
        
        //Mostra as informações do rio 1 
        JOptionPane.showMessageDialog(null, rio2.mostrar());
        
        //chamando os metodos
        rio2.chover(Float.parseFloat(JOptionPane.showInputDialog("Quanto o rio subiu?")));
        System.out.println("\nNivel do rio: " + rio2.nivel); //mostra o nivel do rio 2 atualizado
        rio2.ensolarar(Float.parseFloat(JOptionPane.showInputDialog("Quanto o rio abaixou?")));
        System.out.println("\nNivel do rio: " + rio2.nivel); //mostra o nivel do rio 2 atualizado
        rio2.limpar();
        System.out.println("\nPoluição: " + rio2.poluido);
        rio2.sujar();
        System.out.println("\nPoluição: " + rio2.poluido);
    }
}
