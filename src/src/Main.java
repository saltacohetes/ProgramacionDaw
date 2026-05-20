import javax.swing.SwingUtilities;

public class Main {
    public static void main(String[] args) {
        SwingUtilities.invokeLater(() -> {
            FormularioCoches ventana = new FormularioCoches();
            ventana.setVisible(true);
        });
    }
}