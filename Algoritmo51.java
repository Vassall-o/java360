public class Algoritmo51 { //1
    //try cond 
    //chath -> erro/ solução 
    // finaly 
   void main(){ //2

    int numerador = 0;
    int denominador = 1;

    try {
        numerador = Integer.parseInt(IO.readln("Digite o numerador: "));
        denominador = Integer.parseInt(IO.readln("Digite o denominador: "));

        int divisao = numerador / denominador;

        IO.println("O resultado é: " + divisao);

    } catch (ArithmeticException e) {
        IO.println("Erro: não é possível dividir um número por zero.");

    }catch(NumberFormatException e ){
            // se acontecer esse erro faça isso 
            // quando estiver na web use print() conse()
            IO.println( "Abençoado isso não é um numero");
        } finally {
        IO.println("Operação finalizada.");
    }

   
    }
}
