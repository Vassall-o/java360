public class Carro extends Veiculo implements IManutencao, IMeusImpostos {
    private int numPortas;
   public Carro() {
        super();
    }

    public Carro(String placa, int velocidademax, String tipoCombustivel, String cor, int numPortas) {
    super(placa, velocidademax, tipoCombustivel, cor);
    
    this.numPortas = numPortas;
   }

    @Override
    public void mover() {
        IO.println("O carro se moveu");
    }

    public int getNumPortas() {
        return numPortas;
    }

    public void setNumPortas(int numPortas) {
        this.numPortas = numPortas;
    }
    @Override
    public void adcionar() {
        IO.println("Impostos adiconados ");
        
    }
    @Override
    public void revisaoProgramada() {
        IO.println("Faça a revisão com a taxa de " + IManutencao.TAXA);
    }
}
