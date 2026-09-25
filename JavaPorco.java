
public class JavaPorco extends Animal {
    

    public JavaPorco(String nome, String arquivoSom) {
        super(nome, arquivoSom);
    }

    @Override
    public void comer() {
       IO.println("Carne de onça para Javaporco");
    }

    @Override
    public void tocarSom() {
        IO.println("Grunido.mp3");
    }

    
}
