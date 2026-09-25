import java.util.List;
public class Algoritmo45 {
    public void main(){
        // java colletions 
        // tipos: 
        //- List (interface) 
        //- ArrayList (implenta)

        // Criando lista
        // precisa importa o pacote import java.util.List;
        //td matriz é um objeto 
        // singular é elemento - tarefa 
        // plural é coleção - tarefas
        List <String> tarefas = List.of ("teste mesa", "algoritmos", "oo");
        for (String tarefa:tarefas){
            IO.println(tarefa);
        }

    }
}
