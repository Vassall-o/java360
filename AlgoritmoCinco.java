public class AlgoritmoCinco {
    void main(){
        IO.println("digite um numero:");
        int numero = Integer.parseInt(IO.readln());
        int soma = numero + 1;
        int sub = numero - 1;
        IO.println("Voce digitou: " + numero + "\nO sucessor deste numero é: " + soma + "\nE o antecessor é: " + sub);
        
    }
}
