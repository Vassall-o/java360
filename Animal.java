
public abstract class Animal {
    private String nome;
    private String arquivoSom; 

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getArquivoSom() {
        return arquivoSom;
    }

    public void setArquivoSom(String arquivoSom) {
        this.arquivoSom = arquivoSom;
    }

    public Animal(String nome, String arquivoSom) {
        this.nome = nome;
        this.arquivoSom = arquivoSom;
    }

    // contrartos abstrato, nao tem imprementação so tem assinatura 
    public abstract void comer(); 
    //metodo sem corpo, so a cabeça 
    public abstract void tocarSom();


}
    