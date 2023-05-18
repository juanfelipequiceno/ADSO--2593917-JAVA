import javax.swing.*;
import java.awt.*;

public class GridLayoutExample extends JFrame {
    public GridLayoutExample() {
        initComponents();
    }

    public void initComponents() {
        setTitle("GridLayout");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel(new GridLayout(2, 3));

        JButton btn1 = new JButton("Botón 1");
        JButton btn2 = new JButton("Botón 2");
        JButton btn3 = new JButton("Botón 3");
        JButton btn4 = new JButton("Botón 4");
        JButton btn5 = new JButton("Botón 5");
        JButton btn6 = new JButton("Botón 6");

        contenedor.add(btn1);
        contenedor.add(btn2);
        contenedor.add(btn3);
        contenedor.add(btn4);
        contenedor.add(btn5);
        contenedor.add(btn6);

        add(contenedor);
        revalidate();
    }
}
