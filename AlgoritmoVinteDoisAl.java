public class AlgoritmoVinteDoisAl {
    void main() {

        String nome = IO.readln("Digite seu nome:");

        int senha = 0;

        senha = Integer.parseInt(IO.readln("Digite sua senha, " + nome));
        if (senha == 123) {
            IO.readln("Senha correta");

            double valoEmprestimo = Double.parseDouble(IO.readln("Qual valor voçe deseja simular o emprestimo?"));
            if (valoEmprestimo > 20000) {
                IO.println("O emprestimo para voce so está liberado até 20.000 ");
            }
            int quantidadeDePacela = Integer.parseInt(IO.readln("Digite a quantidade de parcela"));
            if (quantidadeDePacela >= 10) {
                IO.println("O máximo de parcelas é 10 ");
            }
            double div = valoEmprestimo / quantidadeDePacela;
            double juros = div / 100;
            double valorParcela = div + juros;
            IO.readln("Seu emprestimo no valor de " + valoEmprestimo
                    + " ficou com as parcelas no valor de " + valorParcela
                    + " com os juros no valor de " + juros + " Seja bem vindo a familia SENATRCH");

        } else {
            int inicializacao = 0;
            while (inicializacao <= 1) {
                IO.println("Senha incorreta");
                senha = Integer.parseInt(IO.readln("Digite sua senha, " + nome));
                inicializacao++;
            }
            IO.println("Seu cartão foi bloqueado, entre em contato com o gerente do banco");
        }

    }
}
