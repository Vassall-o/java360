import java.util.HashMap;
import java.util.InputMismatchException;// Try catch
import java.util.Map;
import java.time.LocalDateTime;  // dara 
import java.time.format.DateTimeFormatter; // data 
import java.io.FileWriter;

public class Algoritmo55 { 
         void main(){ //2;
        Map<String, String> Laboratorios = new HashMap<>();
        DateTimeFormatter carimbo = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm;ss"); //data
        String registro = LocalDateTime.now().format(carimbo);

        //3
            int cond = 0;
        while (cond !=2) { //4
            cond = Integer.parseInt(IO.readln("Digite 1 para cadastrar e 2 para sair "));
            if (cond == 1){
                String nomelab =IO.readln("Digite o nome do laboratorio"); 
                String chave = IO.readln("Digite a chave do laboratorio");
                Laboratorios.put(chave, nomelab);
        
            } else if (cond ==2 ){
                IO.println("Saindo...");
            }

    } 
    IO.println(Laboratorios.get("F05"));
 }
 } //2

