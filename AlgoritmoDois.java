public class AlgoritmoDois {
    void main(){
        // entrada de dados
        IO.println("Deseja entrar no portal? Mas qual seu nome?");
        String usuario = IO.readln("seja bem-vindo ao portal java 360 ");
       // readln ; ler informaçoes do teclado 
       IO.println("Olá " + usuario + " Seja bem-vindo");
       int estrela = 0;
       // Integer estrela9 = 0;
       //Integer.parseInt(valor para conversão);
       IO.println("quem criou o java");
       IO.println("1 - James Gosling");
       IO.println("2 - Bill Gates");
       IO.println("4 - Mark Zucker...");
       int resp = Integer.parseInt(IO.readln("Digite o numero: "));
       if (resp == 1){
        IO.println("Parabens vc acertou, ganhou uma estrela");
        estrela = estrela + 1;
       }else{
        IO.println("Vc errou!");
       }
       IO.println("Voce obteve " + estrela + " estrelas");

    }
    
}
