public class Algoritmo50 {
    public void main(){
        try{ // tentar 
        int idade = Integer.parseInt(IO.readln("    Qual a sua idade?"));
        String resultado = (idade >=18) ? "maior" : "menor";
        IO.println(resultado);
        } catch(NumberFormatException e ){
            // se acontecer esse erro faça isso 
            // quando estiver na web use print() conse()
            IO.println("😒😑"+ getMessage()+ "Abençoado isso não é um numero");
        }finally{
           // conclusão (independe se deu certo ou errado)
        IO.println("Encerrando SystemSys");
        }
    } // atalho para emoji : windowns .
    
}
