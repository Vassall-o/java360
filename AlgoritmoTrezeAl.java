public class AlgoritmoTrezeAl {
    void main(){
        int PrimeiroNumb = Integer.parseInt(IO.readln("Digite um numero\n"));
        int SegundoNumb = Integer.parseInt(IO.readln("Digite outro numero:\n"));
        if (PrimeiroNumb>SegundoNumb){
            IO.println("O primeiro numero é maior que o segundo" + PrimeiroNumb);
        }else if(SegundoNumb>PrimeiroNumb){
            IO.println("O segundo numero é maio que o primeiro"+ SegundoNumb);
        } else {
            IO.println("Os numeros são iguais");
        }
    }
}
