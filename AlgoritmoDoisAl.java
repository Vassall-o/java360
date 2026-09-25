public class AlgoritmoDoisAl {
    void main(){
        //1º algoritmo
        IO.println("Quem ousa entrar na sala do Eco");
        String nome = IO.readln(); 
        IO.println("Ah..." + nome + ", eu esperava por vc");
        //2° algoritmo 
        IO.println("Quantos algoritmos vc já venceu?");
        String resposta = IO.readln();
        int total = Integer.parseInt(IO.readln(resposta));
        int subtracao = (360 - total);
        IO.println(subtracao);

        //IO.println("Só mais " + subtracao + "pela frente");

    }
}
