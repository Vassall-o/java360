public class AlgoritmoQuatro {
    void main(){
        IO.println("Digite o dia da semana:");
        int diaDaSemana = Integer.parseInt(IO.readln());
    
        switch(diaDaSemana){
            case 1:
                IO.println( "Segunda-feira!");
                break;
            case 2:
                IO.println("Terça-feira!");
                break;
            case 3: 
                IO.println("Quarta-feira!");
                break;
            case 4:
                IO.println("Quinta-feira!");
                break;
            case 5:
                IO.println("Sexta-feira!");
                break;
            case 6:
                IO.println( "Sábado");
                break;
            case 7:
                IO.println("Domingo");
                break;
            default:
                IO.println("Dia invallido");

        }
        
    }
}
