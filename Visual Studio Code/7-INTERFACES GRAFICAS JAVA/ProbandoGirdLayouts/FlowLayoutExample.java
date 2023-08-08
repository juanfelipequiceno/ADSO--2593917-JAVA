import javax.swing.*;
import java.awt.*;

public class FlowLayoutExample extends JFrame {
    public FlowLayoutExample() {
        initComponents();
    }

    public void initComponents() {
        setTitle("FlowLayout");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel(new FlowLayout());

        JButton btn1 = new JButton("Botón 1");
        JButton btn2 = new JButton("Botón 2");
        JButton btn3 = new JButton("Botón 3");

        contenedor.add(btn1);
        contenedor.add(btn2);
        contenedor.add(btn3);

        add(contenedor);
        pack();

    }
}

