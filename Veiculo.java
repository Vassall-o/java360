public abstract class Veiculo  {

    // A classe abstrata
    // - Não ter intancia (criar onjetos dela)
    // - Ela é alto nível de generalização
    // - Possui metodos metodos e construtores concretos 
    // - Pode ter metodos abstratos 
    private String placa;
    private int velocidademax;
    private String tipoCombustivel;
    private String cor;

    public Veiculo(String placa, int velocidademax, String tipoCombustivel, String cor) {
        this.placa = placa;
        this.velocidademax = velocidademax;
        this.tipoCombustivel = tipoCombustivel;
        this.cor = cor;
    }

    public Veiculo() {
    }

    public String getPlaca() {
        return placa;
    }

    public void setPlaca(String placa) {
        this.placa = placa;
    }

    public int getVelocidademax() {
        return velocidademax;
    }

    public void setVelocidademax(int velocidademax) {
        this.velocidademax = velocidademax;
    }

    public String getTipoCombustivel() {
        return tipoCombustivel;
    }
    public void setTipoCombustivel(String tipoCombustivel) {
        this.tipoCombustivel = tipoCombustivel;
    }
    public String getCor() {
        return cor;
    }
    public void setCor(String cor) {
        this.cor = cor;
    }

    // metodo abstrato 
    //polimorfismo: metodo abstrato que será preenchido nas outras classes 
    public abstract void mover();
}
