//Crie um algoritmo que leia um número para calcular o fatorial. 
// Ele deve calcular o fatorial e armazenar em um vetor cada 
// etapa (resultado) do calculo. No final ele deve listar as 
// etapas (cálculos parciais) e o resultado final do fatorial. 
// ( Aqui é permitido pesquisar o que é fatorial em fontes ou 
// IA mas não o resultado do algoritmo)
public class AlgoritmoTrinta {
    void main(){

        int[] vetor = new int[10];
        int sub = 0;
    
    for(int i = vetor.length - 1; i >= 0; i--){
            
            vetor [10] = 10;
            sub = vetor[i -1];
            //IO.println("Posição " + (i-1) + " = " + vetor[i]);
            IO.println(sub);
        }
    }
}

/*exibindo os números na ordem inversa (do último ao primeiro)
        for(int i = numeros.length - 1; i >= 0; i--){
            IO.println("Posição " + (i+1) + " = " + numeros[i]);
        }
// calculando a soma dos elementos do vetor
        for(int i = 0; i < numeros.length; i++){
            soma = soma + numeros[i];
        }
*/