import javax.swing.*;
import javax.swing.BoxLayout;
import java.awt.*;

public class BoxLayoutExample extends JFrame {
    public BoxLayoutExample() {
        initComponents();
    }
    
    public void initComponents() {

        setTitle("BoxLayout Example");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new BoxLayout(contenedor, BoxLayout.Y_AXIS));

        JPanel etiqueta_01 = new JPanel();
        JLabel label_01 = new JLabel("Etiqueta 01");
        etiqueta_01.add(label_01);

        JPanel etiqueta_02 = new JPanel();
        JLabel label_02 = new JLabel("Etiqueta 02");
        etiqueta_02.add(label_02);

        JPanel etiqueta_03 = new JPanel();
        JLabel label_03 = new JLabel("Etiqueta 03");
        etiqueta_03.add(label_03);

        JPanel etiqueta_04 = new JPanel();
        JLabel label_04 = new JLabel("Etiqueta 04");
        etiqueta_04.add(label_04);

        JPanel etiqueta_05 = new JPanel();
        JLabel label_05 = new JLabel("Etiqueta 05");
        etiqueta_05.add(label_05);

        contenedor.add(etiqueta_01);
        contenedor.add(etiqueta_02);
        contenedor.add(etiqueta_03);
        contenedor.add(etiqueta_04);
        contenedor.add(etiqueta_05);

        add(contenedor);
        revalidate();

    }
}


