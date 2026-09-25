import javax.swing.JOptionPane;

public class Algoritmo39 {
// REVISÃO CLASS ABSTRATA, INTERFACE, 
// POLIMORFIMSO, ENCAPSULAMENTO E STATIC
// EX: Classe pai tranporte, classe filha onibus e metro
void main(){
    Onibus o1 = new Onibus("NBS4567");
    Onibus o2 = new Onibus("NBR4567");
    Onibus o3 = new Onibus("NBH4567");

    Metro m1 = new Metro("mmm 2638");
    Metro m2 = new Metro("nnn 0293");
    Metro m3 = new Metro("aaa 8494");

    //ssString opcao = "";
    int op;

    do {
        String opcao = JOptionPane.showInputDialog("1 - onibus 2 - metro 3 - Sair");
        op =Integer.parseInt(opcao);
        
        
    if (op == 1){
        JOptionPane.showMessageDialog(null, o1.calcularTarifa());
        JOptionPane.showMessageDialog(null, "Frota " + o1.getCont());
    }else if (op == 2){
      JOptionPane.showMessageDialog(null, m1.calcularTarifa());  
    }else if (op == 3){
        JOptionPane.showMessageDialog(null, "Fechando o sistema");
    } else {
        JOptionPane.showMessageDialog(null, "Opc invalidada", 
         "Senai",JOptionPane.ERROR_MESSAGE);
    }
}while (op != 3);
}
}
