import javax.swing.*;

public class App extends JFrame {
    private JButton button1;

    public App() {
        setTitle("İlk Java Formumuz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
    }

    public static void main(String[] args) {
        new App();

    }
}
