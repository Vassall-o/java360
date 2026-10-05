
// Importações para usar HashMap e map (guarda informaçoes):
import java.util.HashMap;
import java.util.Map;

//Importação para JOptionPane (interface gráfica)
import javax.swing.JOptionPane;
// Importação para criar aquivo txt que registra as informaçoes 
import java.io.FileWriter;

// Importaçoes para try catch
import java.io.IOException;

//Importações para local e data e formatação
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;


public class Metodos55 {

    Map<String, Ambiente55> laboratorios = new HashMap<>();

    public void cadastro() {
        String chave = JOptionPane.showInputDialog("Digite a chave do Laboratório que deseja cadastrar: " );
        String valor = JOptionPane.showInputDialog("Digite a descrição do Laboratório que deseja cadastrar: ");
        Ambiente55 ambiente = new Ambiente55(chave, valor);
        laboratorios.put(chave, ambiente);
        salvar();
    }

    public void listar() {
        for (String item : laboratorios.keySet()) {
            Ambiente55 ambiente = laboratorios.get(item); //Busca no HashMap o objeto Ambiente associado a "item"
            JOptionPane.showMessageDialog(null, item + ": " + ambiente.getValor()); // Através do objeto "Ambiente" acessa o atributo valor 
            // Como valor é publico posso acessa-lo diretamente
        }
    }

    public void pesquisa() {
        String pesquisar = JOptionPane.showInputDialog("Digite o chave do laboratório que deseja pesquisar: ");
        if (laboratorios.containsKey(pesquisar)) {
            Ambiente55 ambiente = laboratorios.get(pesquisar);
            JOptionPane.showMessageDialog(null, ambiente.getValor());
        } else {
            JOptionPane.showMessageDialog(null, "Laboratório não encontrado");
        }
    }

    public void substituir() {
        String chave = JOptionPane.showInputDialog("Digite a chave do laboratorio que deseja substituir: ");
        if (laboratorios.containsKey(chave)) {
            String valor = JOptionPane.showInputDialog("Digite a nova descrição do laboratorio:");
            Ambiente55 ambiente = laboratorios.get(valor);
            // laboratorios, procure pela chave e me devolva o Ambiente associado a ela
            ambiente.setValor(valor);
            // ambiente, agora altere o valor que está dentro de você.
            JOptionPane.showMessageDialog(null, "Laboratorio substituido com sucesso");
        } else {
            JOptionPane.showMessageDialog(null, "Laboratório não encontrado");
        }
        salvar();
    }
// Remover não precosa mexer pq o "remove", remove a chave e o ambiente
    public void remover() {
        String remover = JOptionPane.showInputDialog("Digite a cheve do Laboratório que deseja remover");
        if (laboratorios.containsKey(remover)) {
            laboratorios.remove(remover);
        } else {
            JOptionPane.showMessageDialog(null, "Laboratório não encontrado");
        }
        salvar();
    }
    public Ambiente55 buscarAmbiente(String chave){
        return laboratorios.get(chave);
    }
    
    public void salvar() {
        try {

            FileWriter registro = new FileWriter("Banco de dados dos laboratorios.txt");

            LocalDateTime agora = LocalDateTime.now();

            DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");
        
            for (String item : laboratorios.keySet()) {
                Ambiente55 ambiente = laboratorios.get(item);
                registro.write(item + ": " + ambiente.getValor()+ " - " + agora.format(formato) +  "\n");
            }

            registro.close();

        } catch (IOException erro) {

            IO.println("Erro ao salvar o arquivo");
        }
    }
}
