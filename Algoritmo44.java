public class Algoritmo44 {
 public static void main(String [] args){

    //matriz unidimensional 1D -> vetor
    //matriz bidimensional 2D
    //matriz tridimensional 3D
    //tensores (N dimensões - redes neurais)

    //bidemensional i,j   
    // i linha 
    // j coluna
    //[][] representa matriz bidmensional 
    double [][] notas  = 
    {{100, 80, 40, 30}, 
     {78, 87, 55,90 }, 
     {67,78,34,56},
     {99,100,56,96}};
    // precisa de um for pra percorrer a linha e outro para percorrer a coçuna   
    // for linha 
    for (int i = 0; i<notas.length; i++){
        for (int j=0; j<notas.length; j++){
            IO.println(notas [i][j]);
        }
    }
 }   
}
