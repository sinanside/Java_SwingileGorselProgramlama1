import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class App extends JFrame {
    private JButton gönderButton;
    private JPanel Jpanel;

    public App() {
        setContentPane(Jpanel);
        setTitle("İlk Java Formumuz");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(400,400);
        setLocationRelativeTo(null);
        setVisible(true);
        gönderButton.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                JOptionPane.showMessageDialog(App.this,"Butona tıkladınız...");
            }
        });
    }

    public static void main(String[] args) {
        new App();

    }
}
