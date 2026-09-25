public class Principal {
    void main(){
        //crinado obejto
        Algoritmo31 objeto = new Algoritmo31();
    //  classe       obj  operador  construtor 
    objeto.getAloMundo();
    IO.println(objeto.getAloMundo());
    objeto.pritarNaTela();
   
    // obj 2 
    Algoritmo32 objeto2 = new Algoritmo32();
    String nome = IO.readln("dIGITE SEU NOME:");
    objeto2.mostrarSalaEco("JP");
    objeto2.mostrarSalaEco(nome);

    Algoritmo32 obejto3 = new Algoritmo32();
    IO.print(obejto3.mostrarSalaEco2("maria"));


    // === aula 17/09===
    Algoritmo34 algoritmo34 = new Algoritmo34();
    algoritmo34.setPrimeiroNumero(10);
    algoritmo34.setSegundoNumero(11);
    IO.println(algoritmo34.getPrimeiroNumero());
    IO.println(algoritmo34.getSegundoNumero());

    // ==== algoritmo 35 ====
    Algoritmo35 algoritmo35 = new Algoritmo35();
    algoritmo35.setModelo("kombi");
    algoritmo35.setPlaca("JKD2025");
    algoritmo35.setCavalos(48);
     
    }
    

}
