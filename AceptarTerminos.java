import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class AceptarTerminos extends JFrame implements ActionListener, ChangeListener{

	private JLabel etiqueta;
	private JCheckBox check;
	private JButton continuar, cerrar;

	public AceptarTerminos(){
		setLayout(null);

		etiqueta = new JLabel("Aceotar terminos y condiciones");
		etiqueta.setBounds(10,10,400,30);
		add(etiqueta);

		check = new JCheckBox("Acepto");
		check.setBounds(10,50,100,30);
		check.addChangeListener(this);
		add(check);

		continuar = new JButton("Continuar");
		continuar.setBounds(10,100,100,30);
		add(continuar);
		continuar.addActionListener(this);
		continuar.setEnabled(false);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(150,100,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void stateChanged(ChangeEvent c){
		if(check.isSelected() == true){
			continuar.setEnabled(true);
		} else{
			continuar.setEnabled(false);
		}
	}

	public void actionPerformed(ActionEvent a){
		if(a.getSource() == continuar){
			System.exit(0);
		}

		if(a.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		AceptarTerminos formulario = new AceptarTerminos();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}