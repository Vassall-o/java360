public class Algoritmo37 {
    void main(){
        Cachorro c = new Cachorro("Rex", "auau.mp3");
        c.comer();
        c.tocarSom();
        IO.println("nome: " + c.getNome());

        Gato g = new Gato("Juliano", "miaumiau,mp3");
        g.comer();
        g.getArquivoSom();
        IO.println("nome: " +g.getNome());

        JavaPorco j = new JavaPorco("Javalinha", "grunidos.mp3");
        j.comer();
        j.getArquivoSom();
        IO.println("nome " + j.getNome());
    }
}
