//Crie um algoritmo que armazene as vendas do ano em um vetor e mostre o total da venda anual e a média anual.
public class AlgoritmoVinteENove {
    void main(){
        // declarando vetor 
        int[] numeroDeVendas = new int[6];

        int soma = 0;
        // fazendo o for para preencher as gavetas
        for( int i = 0; i< numeroDeVendas.length; i++){
        // criando entrada de dados e covertendo para int 
            numeroDeVendas [i]= Integer.parseInt(IO.readln(" Digite as vendas: "));
        }
        for(int i = 0; i < numeroDeVendas.length; i++){
            soma = soma + numeroDeVendas[i];
            
        }
        int div = soma / 6;
        IO.println("A soma das vendas é: " +soma+ " A media de vendas por semestre é: " +div);

    }
}
