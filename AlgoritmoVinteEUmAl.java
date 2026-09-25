public class AlgoritmoVinteEUmAl {
    void main(){
    
        int [] numeros = {45,67,89,34,23,56,78,98,45,34};
        int soma = 0;

        for (int numero : numeros){
            soma += numero;
        }
        
        int resultado = soma/10;
        IO.println(resultado);
    }
}
