public class Desafio {
    void main(){
        IO.println("digite um numero:");
        int n = Integer.parseInt(IO.readln());
        if(n<0){
            IO.println("número negativo");
        }else if (n>0){
            IO.println("NúMERO POSITIVO");
        }else{
            IO.println("número nulo");
        }

        int numAula = Integer.parseInt(IO.readln("Entre com um numero de 1 a 4\n"));
        switch (numAula) {
            case 1:
                IO.println("Segunda- feira");
                break;
            case 2: 
                IO.println("Terça-feira");
                break;
            case 3: 
                IO.println("quarta-feira");
                break;
            case 4: 
                IO.println("quinta-feira");
                break;
            default:
                IO.println("numero invalido");
                break;
        }
    }
}
