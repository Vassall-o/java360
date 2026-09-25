public class Moto extends Veiculo implements IManutencao, IMeusImpostos {
    private Boolean temBau;

    public Moto(String placa, int velocidademax, String tipoCombustivel, String cor, Boolean temBau) {
        super(placa, velocidademax, tipoCombustivel, cor);
        this.temBau = temBau;
    }
    public Moto() {
        super();
    }

    public Boolean getTemBau() {
        return temBau;
    }

    public void setTemBau(Boolean temBau) {
        this.temBau = temBau;
    }

    @Override
    public void mover() {
       IO.println("A moto se moveu");
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
