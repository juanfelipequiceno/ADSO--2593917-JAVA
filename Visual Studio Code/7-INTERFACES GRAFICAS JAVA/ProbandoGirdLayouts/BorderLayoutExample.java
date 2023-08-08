import javax.swing.*;
import java.awt.*;

public class BorderLayoutExample extends JFrame {
    public BorderLayoutExample() {
        initComponents();
    }

    public void initComponents() {
        setTitle("BorderLayout");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel(new BorderLayout());

        JButton btn1 = new JButton("Norte");
        JButton btn2 = new JButton("Sur");
        JButton btn3 = new JButton("Este");
        JButton btn4 = new JButton("Oeste");
        JButton btn5 = new JButton("Centro");

        contenedor.add(btn1, BorderLayout.NORTH);
        contenedor.add(btn2, BorderLayout.SOUTH);
        contenedor.add(btn3, BorderLayout.EAST);
        contenedor.add(btn4, BorderLayout.WEST);
        contenedor.add(btn5, BorderLayout.CENTER);

        add(contenedor);
        revalidate();
    }
}
