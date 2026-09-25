
public class Gato extends Animal {
    

    public Gato(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
       
        IO.println("ração Wyscas pra gatos");
    }

    @Override
    public void tocarSom() {
        IO.println("miaumiau.mp3");
    }
    
}
