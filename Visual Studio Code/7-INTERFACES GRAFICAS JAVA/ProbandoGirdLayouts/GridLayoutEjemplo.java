import javax.swing.*;
import java.awt.*;

public class GridLayoutsEjemplo extends JFrame{

    public GridLayoutsEjemplo(){
        initComponets();
        
    }

    public void initComponets(){
        setVisible(true);
        setTitle("FlowLayouts y BorderLayouts");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setResizable(false);
        setLocationRelativeTo(null);

        JPanel contenedor = new JPanel();
        GridLayout capa = new GridLayout();
        contenedor.setLayout(capa);

        JTextFiled arreglo_inputs [] = new JTextFiled[12];

        for(int i=0; i<arreglo_inputs.length;i++){
            arreglo_inputs[i] = new JTextFiled();
        } 
        for(int i=0; i<arreglo_inputs.length;i++){
            contenedor.add(arreglo_inputs[i]);
        }

        add(contenedor);
        revalidate();

    }
}