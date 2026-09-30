import java.util.HashMap;
import java.util.Map;

public class Algoritmo53 {
    void main(){
    
        Map <String,Estudante> estudantes = new HashMap<>();
        IO.println("Java Doctor - Escola dde programação");

        Estudante e = new Estudante("JP", "ADS", 2025);
        estudantes.put("MAT1223", e);
        
        Estudante e1 = new Estudante("Elias", "Ciencia da computação", 2023);
        estudantes.put("MAT1224", e1);

        Estudante e2 = new Estudante("Daniel", "ADS", 2016);
        estudantes.put("MAT1225", e2);

        Estudante e3 = new Estudante("Cassio", "CDC", 2016);
        estudantes.put("MAT1226", e3);

        Estudante e4 = new Estudante("Natalia", "ADS", 2027);
        estudantes.put("MAT1227", e4);

        Estudante e5 = new Estudante("Maria", "TSI", 2028);
        estudantes.put("MAT1229", e5);

        Estudante e6 = new Estudante("Julio", "TSI", 2028);
        estudantes.put("MAT1230", e6);

        Estudante e7 = new Estudante("Gabriel", "AutoDiData", 2026);
        estudantes.put("MAT1231", e7);

        Estudante e8 = new Estudante("Fabio pio", "Marketing", 2026);
        estudantes.put("MAT1232", e8);

        Estudante e9 = new Estudante("Carlos", "ADS", 2016);
        estudantes.put("MAT1233", e9);

        Estudante e10 = new Estudante("Gabriel 2", "ENG", 2028);
        estudantes.put("MAT1234", e10);

        Estudante e11 = new Estudante("Maria", "TSI", 2028);
        estudantes.put("MAT1235", e11);

        estudantes.put("MAT1236", new Estudante("Maria", "TSI", 2028));

        for(Estudante e12  : estudantes.values()){
            IO.println(e12);
        }

        for (Estudante e12 : estudantes.values()){
            IO.println(toString());
        }
        
        for (String matricula :estudantes.keySet()){
            Estudante e12 = estudantes.get(matricula);
            IO.println(matricula + " -> " + e12);

        }

        IO.println("Digte sua matricula: ");
        String buscar = IO.readln();
        Estudante encontrado = estudantes.get(buscar);

        if(encontrado != null){
            IO.println("Encontrado: " + buscar + " -> " + encontrado);
        } else{
            IO.println("Matricula " + buscar + "não encontrado");
        }
        IO.print(encontrado);

        for (Map.Entry<String.Estudante> entry : estudantes.entrySet()){
            
        }




        // generic - definit qUALQUER TIPO <T>
    }
}
