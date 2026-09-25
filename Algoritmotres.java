public class Algoritmotres {
    void main(){
        int nota1,nota2,nota3;
      
        nota1 = Integer.parseInt(IO.readln("Digite a 1° nota "));
        nota2 = Integer.parseInt(IO.readln("Digite a 2° nota "));
        nota3 = Integer.parseInt(IO.readln("Digite a 3° nota "));

          double media = (nota1 + nota2 + nota3)/3;
          int soma = nota1+ nota2 + nota3;
          IO.println("Notas: " +nota1+ ", " + nota2+ ", " + nota3 );
          IO.println("Soma das notas: " +soma);
          IO.println("Média das notas: " + media);

        

        //declarou 3 variaveis de uma vez
        //ENTRADA DE DADOS DAS NOTAS DOS ALUNOS 
        //SOMA DAS NOTAS 
        //MÉDIA DAS NOTAS 
        //SAIDA DAS NOTAS, SOMA E MEDIA 
    }
    
}
