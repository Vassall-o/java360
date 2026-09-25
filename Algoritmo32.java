public class Algoritmo32 {
    // metodo não aproveitavel
    public void mostrarSalaEco(String nome){
        IO.println("Quem ousa entrar na sala do eco?");
        IO.println("Ah..." +nome+ "..Eu esperava por voçe!");
    }
    // metodo aproveitavel 
    public String mostrarSalaEco2(String nome){
            String res = "Quem ousa entar na sala do eco?";
            String resNome = "Ah..." +nome+ "..Eu esperava por voçe!";
            return res +"/n"+ resNome;
        }
}
