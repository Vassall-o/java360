public class Onibus extends Transporte {
    private static  int cont = 0;
    
    @Override
    public double calcularTarifa() {
        return 3.80;
    }

    public Onibus() {
        cont ++;
    }

    public Onibus(String placa) {
        super(placa);
        cont++;
    }

    public static int getCont(){
        return cont;

    }

    
}
