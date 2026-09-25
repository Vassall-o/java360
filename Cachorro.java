
public class Cachorro extends Animal {

    public Cachorro(String nome, String arquivoSom) {
        super(nome, arquivoSom);
        
    }

    @Override
    public void comer() {
        
        IO.println("raça camil pra cães");
    }

    @Override
  public void tocarSom() {
        IO.println("auauau.mp3");
        
    }
}



