//Crie um algoritmo que pergunte 

import java.util.ArrayList;

public class Algoritmo49 {
    void main(){
        ArrayList<String> lab = new ArrayList<>();
        lab.add("F03");
        lab.add("F04");
        lab.add("F05");
        IO.println(lab);

        int cond = 0;
        while (cond !=2) {

            cond = Integer.parseInt(IO.readln("Digite 1 para ver laboratorios e 2 para sair"));
            if (cond == 1 ) {

               String cond2 = (IO.readln("F03 - INFORMATICA, F04 - ELÉTRICA, F05 - JAVA "));
               if (cond2 == "F03") {
                IO.println("Laboratório de informatica adcionado");
               }else if(cond2 == "F04"){
                IO.println("Laboratório de elétrica adcionado");
               }else if (cond2 == "F05"){
                IO.println("Laboratório de java adcionado");
               }else{
                IO.println("Opção invalida");
               }
               
            }else if (cond ==2){
                IO.println("Saindo");
            }
        
        }
            
        }
    }

