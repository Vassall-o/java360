import  java.util.List;
import java.util.ArrayList;

public class Algoritmo46 {
    public void main() {
        // Lis 100,60,50
        // Dictionary - 100:Maria, 40:JP, 50:Daniel 
        // ou seja dictionary consegue listar é agregar mais um valor 
        // INTERFACE                  CLASSE
   //       List  ───────────────→ ArrayList
   //       Set   ───────────────→ HashSet
   //       Queue ───────────────→ LinkedList
   //        Map   ───────────────→ HashMap
   //dentrp de<> pode ter qualquer classe, <veiculo> ou <moto> ...
   // Instaceando uma arrayList 
   List<String> frutas = new ArrayList<>(); 
   // add elementos na list
   frutas.add("Goiaba");
   frutas.add("Amora");
   frutas.add("Melancia");
   frutas.add("Mamão");
   //fruta.get(0) para localizar determinado indice 

   IO.println("Primeira fruta: " + frutas.get(1));
   IO.println(frutas);

   // para trocar amora por uva 
   frutas.set(1, "uva");

   // percorrendo a lista:
   for (String fruta: frutas){
    IO.println("elementos " + fruta);
   }

   //Para vizualizar o total de frutas 
   IO.println("Total de frutas " + frutas.size());

   //Para remover 
   frutas.remove("Mamão");

   IO.println("Total de frutas " + frutas.size());
   IO.println("Lista " + frutas);
   frutas.remove("Goiaba");
   frutas.remove("Melancia");
   frutas.add("Laranja");
   frutas.add("Morango");
   IO.println(frutas);

   // removendo pelo indice
   frutas.remove(1);

   IO.println(frutas);
   
 }
}
