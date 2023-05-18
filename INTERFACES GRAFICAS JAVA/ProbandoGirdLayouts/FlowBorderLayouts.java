import javax.swing.*;
import java.awt.*;

public class FlowBorderLayouts extends JFrame {

    public FlowBorderLayouts(){
        initComponents();

    }

    public void initComponents(){
        setVisible(true);
        setTitle("FlowLayouts y BorderLayouts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        BorderLayout capa = new BorderLayout();
        contenedor.setLayout(capa);
    

        JButton btn_1 = new JButton("Boton 1");
        JButton btn_2 = new JButton("Boton 2");
        JButton btn_3 = new JButton("Boton 3");

        JPanel contenedor_centro = new JPanel();
        FlowLayout capa_centro = new FlowLayout();
        contenedor_centro.setLayout(capa_centro);
        contenedor_centro.add(btn_1);
        contenedor_centro.add(btn_2);

        contenedor.add(contenedor_centro, BorderLayout.CENTER);
        contenedor.add(contenedor, BorderLayout.SOUTH);

        add(contenedor);
        revalidate();
        
    }
}