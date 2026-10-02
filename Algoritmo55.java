import javax.swing.JOptionPane;
import java.util.Map;
import java.util.HashMap;
import java.io.FileWriter;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Algoritmo55 {

    static Map<String, Ambientes> ambientes = new HashMap<>();

    static final String NOME_ARQUIVO = "ambientes.txt";

    static DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm:ss");

    public static void main(String[] args) {

        // Carrega dados salvos anteriormente no arquivo .txt
        carregarDoArquivo();

        // Carga inicial padrão (caso o arquivo esteja vazio)
        if (ambientes.isEmpty()) {
            ambientes.put("F07",
                    new Ambientes("F07", "Laboratório de Programação Java"));

            ambientes.put("B03",
                    new Ambientes("B03", "Sala de aula padrão"));

            ambientes.put("G09",
                    new Ambientes("G09", "Oficina de Lanternagem e pintura"));

            salvarNoArquivo();
        }

        int opcao;

        do {

            String menu = """
                    CADASTRO DE AMBIENTES

                    1 - Cadastrar
                    2 - Listar
                    3 - Pesquisar
                    4 - Excluir
                    5 - Alterar
                    6 - Sair
                    """;

            try {

                opcao = Integer.parseInt(
                        JOptionPane.showInputDialog(menu));

                switch (opcao) {

                    case 1:
                        cadastrar();
                        break;

                    case 2:
                        listar();
                        break;

                    case 3:
                        pesquisar();
                        break;

                    case 4:
                        excluir();
                        break;

                    case 5:
                        alterar();
                        break;

                    case 6:
                        JOptionPane.showMessageDialog(
                                null,
                                "Programa encerrado!");
                        break;

                    default:
                        JOptionPane.showMessageDialog(
                                null,
                                "Opção inválida!");
                }

            } catch (NumberFormatException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Digite uma opção válida!");

                opcao = -1;

            } finally {

                System.out.println("Menu executado.");
            }

        } while (opcao != 6);
    }

    public static void cadastrar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente:");

        if (chave == null) {
            return;
        }

        chave = chave.toUpperCase().trim();

        if (ambientes.containsKey(chave)) {

            JOptionPane.showMessageDialog(
                    null,
                    "Essa chave já está cadastrada!");

            return;
        }

        String descricao = JOptionPane.showInputDialog(
                "Digite a descrição do ambiente:");

        if (descricao == null || descricao.trim().isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Descrição inválida!");

            return;
        }

        LocalDateTime agora = LocalDateTime.now();
        String dataFormatada = agora.format(formato);

        Ambientes ambiente = new Ambientes(
                chave,
                descricao,
                dataFormatada);

        ambientes.put(chave, ambiente);

        salvarNoArquivo();

        JOptionPane.showMessageDialog(
                null,
                "Ambiente cadastrado com sucesso!\n\n" +
                        "Chave: " + ambiente.getChave() +
                        "\nDescrição: " + ambiente.getDescricao() +
                        "\nData: " + ambiente.getDataRegistro());
    }

    public static void listar() {

        if (ambientes.isEmpty()) {

            JOptionPane.showMessageDialog(
                    null,
                    "Nenhum ambiente cadastrado.");

            return;
        }

        String lista = "AMBIENTES CADASTRADOS\n\n";

        for (Map.Entry<String, Ambientes> item : ambientes.entrySet()) {

            Ambientes ambiente = item.getValue();

            lista += "Chave: " + ambiente.getChave()
                    + "\nDescrição: " + ambiente.getDescricao();

            if (ambiente.getDataRegistro() != null) {
                lista += "\nData: " + ambiente.getDataRegistro();
            }

            lista += "\n-------------------------\n";
        }

        JOptionPane.showMessageDialog(
                null,
                lista);
    }

    public static void pesquisar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave que deseja pesquisar:");

        if (chave == null) {
            return;
        }

        chave = chave.toUpperCase().trim();

        Ambientes ambiente = ambientes.get(chave);

        if (ambiente != null) {

            String mensagem = "Ambiente encontrado!\n\n" +
                    "Chave: " + ambiente.getChave() +
                    "\nDescrição: " + ambiente.getDescricao();

            if (ambiente.getDataRegistro() != null) {
                mensagem += "\nData: " + ambiente.getDataRegistro();
            }

            JOptionPane.showMessageDialog(
                    null,
                    mensagem);

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado!");
        }
    }

    public static void excluir() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente que deseja excluir:");

        if (chave == null) {
            return;
        }

        chave = chave.toUpperCase().trim();

        if (ambientes.containsKey(chave)) {

            ambientes.remove(chave);

            salvarNoArquivo();

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente excluído com sucesso!");

        } else {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado!");
        }
    }

    public static void alterar() {

        String chave = JOptionPane.showInputDialog(
                "Digite a chave do ambiente que deseja alterar:");

        if (chave == null) {
            return;
        }

        chave = chave.toUpperCase().trim();

        Ambientes ambiente = ambientes.get(chave);

        if (ambiente == null) {

            JOptionPane.showMessageDialog(
                    null,
                    "Ambiente não encontrado!");

            return;
        }

        String novaDescricao = JOptionPane.showInputDialog(
                null,
                "Digite a nova descrição:",
                ambiente.getDescricao());

        if (novaDescricao == null || novaDescricao.trim().isEmpty()) {
            return;
        }

        LocalDateTime agora = LocalDateTime.now();
        String dataAlteracao = agora.format(formato);

        ambiente.setDescricao(novaDescricao);
        ambiente.setDataRegistro(dataAlteracao);

        ambientes.put(chave, ambiente);

        salvarNoArquivo();

        JOptionPane.showMessageDialog(
                null,
                "Ambiente alterado com sucesso!\n\n" +
                        "Chave: " + ambiente.getChave() +
                        "\nNova descrição: " + ambiente.getDescricao() +
                        "\nAlterado em: " + ambiente.getDataRegistro());
    }

    public static void salvarNoArquivo() {

        FileWriter arquivo = null;

        try {

            arquivo = new FileWriter(NOME_ARQUIVO, false);

            for (Map.Entry<String, Ambientes> item : ambientes.entrySet()) {

                Ambientes ambiente = item.getValue();

                String data = ambiente.getDataRegistro();

                if (data == null) {
                    data = "";
                }

                arquivo.write(
                        ambiente.getChave()
                                + ";"
                                + ambiente.getDescricao()
                                + ";"
                                + data
                                + "\n");
            }

        } catch (IOException e) {

            JOptionPane.showMessageDialog(
                    null,
                    "Erro ao salvar o arquivo!");

        } finally {

            try {

                if (arquivo != null) {
                    arquivo.close();
                }

            } catch (IOException e) {

                JOptionPane.showMessageDialog(
                        null,
                        "Erro ao fechar o arquivo!");
            }
        }
    }

    public static void carregarDoArquivo() {

        BufferedReader leitor = null;

        try {

            leitor = new BufferedReader(
                    new FileReader(NOME_ARQUIVO));

            String linha;

            while ((linha = leitor.readLine()) != null) {

                String[] dados = linha.split(";", -1);

                if (dados.length >= 2) {

                    String chave = dados[0];
                    String descricao = dados[1];

                    String dataRegistro = "";

                    if (dados.length >= 3) {
                        dataRegistro = dados[2];
                    }

                    Ambientes ambiente;

                    if (dataRegistro.isEmpty()) {

                        ambiente = new Ambientes(
                                chave,
                                descricao);

                    } else {

                        ambiente = new Ambientes(
                                chave,
                                descricao,
                                dataRegistro);
                    }

                    ambientes.put(chave, ambiente);
                }
            }

        } catch (IOException e) {

            System.out.println(
                    "Arquivo ainda não existe.");

        } finally {

            try {

                if (leitor != null) {
                    leitor.close();
                }

            } catch (IOException e) {

                System.out.println(
                        "Erro ao fechar o arquivo.");
            }
        }
    }
}
