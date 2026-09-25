public class Algoritmo34 {
    // encapsulamento: esconder 
    //public private protected package
    private int primeiroNumero;
    private int segundoNumero; 

    // === set get
    // set atribuir
    //get recupear

    public void setPrimeiroNumero(int primeiroNumero){
        // public void set nomeDoAtributo
        this.primeiroNumero =primeiroNumero; 
        //this aponta a variavel primeiro numero para o atributo primeiro nome
        //sao duas variaveis diferentes com o mesmo nome

    }

    public int getPrimeiroNumero(){
        return primeiroNumero;
    }

    public void setSegundoNumero (int segundoNumeroto){
        this.segundoNumero = segundoNumeroto;
    }

    public int getSegundoNumero(){
        return segundoNumero;
    }
}


