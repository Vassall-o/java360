public class AlgoritmoQuatorzeAl {
    void main(){
        IO.println("Bem-Vindo.\nPara iniciar o jogo digite 1\nSe 2: Suas vidas estão acabando\nSe 3 Game Over!");
        int opc = Integer.parseInt(IO.readln());
        switch (opc) {
            case 1:
                IO.println("Jogo iniciado");
                break;
            case 2:
                IO.println("Suas vidas estão acabando");
                break;
            case 3:
                IO.println("Game Over!");    
            default:
                IO.println("Opção invalida");
                break;
        }

    }
}
