import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.*;

public class NulLayout extends JFrame {
    public NulLayout(){
        initComponents();
    }

    public void initComponents(){
        setVisible(true);
        setSize(400, 500);
        setTitle("NULL LAYOUTS");
        setDefaultCloseOperation(EXIT_ON_CLOSE);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(null);

        JButton btn = new JButton("Agregar");
        contenedor.add(btn);
        btn.setBounds(100, 100, 100, 50);
        add(contenedor);
        revalidate();

    }
}