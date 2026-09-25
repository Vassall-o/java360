public class AlgoritmoDoze {
    void main(){
        //crie um algoritmo que descobre se o nuemro é par ou impar 
        int numero = Integer.parseInt(IO.readln("Digite um numero\n"));
        int resto = numero % 2;
        if (resto  == 0){
            IO.println("Numero par");
        }else{
            IO.println("Numero impar");
        }

    }
}
