import javax.swing.JOptionPane; 
public class Algoritmo55 {
    void main() {

        Metodos metodo = new Metodos();
        int opcao = 0;
        do {
            JOptionPane.showMessageDialog(null,"\n===MENU===");
            opcao = Integer.parseInt(JOptionPane.showInputDialog("Digite:\n1 - Para cadastrar laboratorio"
                    + "\n2 - Para Listar laboratorios\n3 - Para pesquisar"
                    + "\n4 - Para susbtituir \n5 - Para remover laboratorio"
                    + "\n6 - Para sair\n"));

            switch (opcao) {
                case 1:
                    metodo.cadastro();
                    break;

                case 2:
                    metodo.listar();
                    break;

                case 3:
                    metodo.pesquisa();
                    break;

                case 4:
                    metodo.substituir();
                    break;

                case 5:
                    metodo.remover();
                    break;
                case 6:
                    IO.println("Saindo do programa");
                    break;

                default:
                    IO.print("Opção invalida");
                    break;
            }

        } while (opcao != 6);

    }
}
