public class Ambiente55 {
    private String chave;
    private String valor ; 
    
    public Ambiente55 (String chave, String valor){
        this.chave = chave;
        this.valor = valor;
    }
// Get acessa o valor
    public String getValor(){
        return valor;
    }
//Set recebe e altera o valor
    public void  setValor(String valor){
        this.valor = valor;
    }

    public void setChave(String chave){
        this.chave = chave;
    }
   


}
