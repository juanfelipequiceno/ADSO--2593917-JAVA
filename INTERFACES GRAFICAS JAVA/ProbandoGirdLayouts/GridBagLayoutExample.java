import java.awt.*;
import javax.swing.*;

public class GridBagLayoutExample extends JFrame {
    public GridBagLayoutExample() {
        initComponents();
    }

    public void initComponents() {
        setTitle("GridBagLayout Example");
        setSize(400, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setVisible(true);

        JPanel contenedor = new JPanel();
        contenedor.setLayout(new GridBagLayout());

        JLabel etiqueta1 = new JLabel("Etiqueta 1");
        JLabel etiqueta2 = new JLabel("Etiqueta 2");
        JLabel etiqueta3 = new JLabel("Etiqueta 3");

        GridBagConstraints c = new GridBagConstraints();

        // Configuración de la etiqueta 1
        c.gridx = 0;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.BOTH;
        contenedor.add(etiqueta1, c);

        // Configuración de la etiqueta 2
        c.gridx = 1;
        c.gridy = 0;
        c.gridwidth = 1;
        c.gridheight = 2;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.BOTH;
        contenedor.add(etiqueta2, c);

        // Configuración de la etiqueta 3
        c.gridx = 0;
        c.gridy = 1;
        c.gridwidth = 1;
        c.gridheight = 1;
        c.weightx = 0.5;
        c.weighty = 0.5;
        c.fill = GridBagConstraints.BOTH;
        contenedor.add(etiqueta3, c);

        add(contenedor);
        revalidate();
    }

}
