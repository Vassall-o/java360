import javax.swing.JOptionPane;

public class Algoritmo38 {
    public void main (){
        // 
        JOptionPane.showMessageDialog(null, "Agencia SenaiCar");

        Carro c = new Carro("MP9021", 300, "GASOLINA", "ROSA", 4);
        JOptionPane.showConfirmDialog(null, c.getPlaca());
        JOptionPane.showConfirmDialog(null, c.getTipoCombustivel());
        JOptionPane.showConfirmDialog(null, c.getCor());
        JOptionPane.showConfirmDialog(null, c.getNumPortas());
        
        Moto m = new Moto();
        c.mover();
        m.mover();

    }
}
