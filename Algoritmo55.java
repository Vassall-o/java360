import java.util.HashMap;
import java.util.InputMismatchException;
import java.util.Map;
public class Algoritmo55 { //1
    void main(){ //2
        try{ //3
            int cond = 0;
        while (cond !=2) { //4
            cond = Integer.parseInt(IO.readln("Digite 1 para cadastrar e 2 para sair "));
            if (cond == 1){
                String nomelab =IO.readln("Digite o nome do laboratorio"); 
                String chave = IO.readln("Digite a chave do laboratorio");
        
            } else if (cond ==2 ){
                IO.println("Saindo...");
            }
        }//4
        
        } catch ( ) { // digitar lestras minuscas, maiusculas...

        }finally{
            IO.println("Saindo... ");
        }
        

    } //2
}//1
