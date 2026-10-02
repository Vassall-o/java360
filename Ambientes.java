public class Ambientes {

    private String chave;
    private String descricao;
    private String dataRegistro;

    public Ambientes() {
    }

    public Ambientes(String chave, String descricao) {
        this.chave = chave;
        this.descricao = descricao;
    }

    public Ambientes(
            String chave,
            String descricao,
            String dataRegistro) {
        this.chave = chave;
        this.descricao = descricao;
        this.dataRegistro = dataRegistro;
    }

    public String getChave() {
        return chave;
    }

    public void setChave(String chave) {
        this.chave = chave;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public String getDataRegistro() {
        return dataRegistro;
    }

    public void setDataRegistro(String dataRegistro) {
        this.dataRegistro = dataRegistro;
    }
    // O que precisamos fazer:
    // cadastro rodando certinho com while ok
    // Inserir o try catch para caracteres nao esperados
    // Inserir carimbo de hora e data
    // Criar uma classe pros metodos
    // criar esses metodos na classe :
    // Cadastrar
    // listar
    // pesquisar
    // excluir
    // alterar
    // sair
}
