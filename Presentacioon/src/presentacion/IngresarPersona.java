package presentacion;

import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class IngresarPersona extends JFrame {
    private JPanel pnlPrincipal;
    private JTextField txtCodigo;
    private JLabel lblCodigo;
    private JLabel A;
    private JTextField textField1;
    private JTextField textField2;
    private JComboBox cmbidioma;
    private JButton btnGuardar;

    public IngresarPersona () {

      this.setTitle("ventana ingresar persona");
      this.setContentPane(pnlPrincipal);
      this.setSize(400, 300);

      this.setVisible(true);
        btnGuardar.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String codigo = txtCodigo.getText ();
                String nombre = txtCodigo.getText ();
                String apellido = txtCodigo.getText ();

                String mensaje = "Tus datos son: \n" + "Codigo: " + codigo + "\n" + "Nombre: " + nombre + "\n" + "Apellido: " + apellido + "\n";

                JOptionPane.showMessageDialog(btnGuardar , mensaje);
            }
        });
    }

}
