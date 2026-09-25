//fazer um vetor que armazene 10 valores inteiros 
//Imprima os 10 valores e a 

public class Algoritmo47 {
    public void main(){
        // definindo o vetor de 5 posições
        int[] numeros = new int[10];

        // preenchendo o vetor com os números digitados pelo usuário
        for(int i = 0; i < numeros.length; i++){
            numeros[i] = Integer.parseInt(IO.readln("entre com o número: "));
        }
        // imprimindo para testar se deu certo 
        for(int i = 0; i<numeros.length; i++){
            IO.println(numeros[i]);
        }
        //somar os valores e fazer a média deles
        int soma = 0;
        for (int i = 0; i<numeros.length; i++){
            soma = soma + numeros[i]; //N entendi pq deu certo 
        }        
        IO.println("A soma dos valores é: " + soma);

        // fazendo média 
        int div = soma/10; 
        IO.println("A médias do valores é:" + div);
       

        
        
    }
}
