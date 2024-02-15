import javax.swing.*;
import javax.swing.event.*;
import java.awt.event.*;

public class Check extends JFrame implements ChangeListener, ActionListener{

	private JCheckBox check, check1, check2;
	private JButton cerrar;

	public Check(){
		setLayout(null);
		check = new JCheckBox("Ingles");
		check.setBounds(10,10,150,30);
		check.addChangeListener(this);
		add(check);

		check1 = new JCheckBox("Frances");
		check1.setBounds(10,50,150,30);
		check1.addChangeListener(this);
		add(check1);

		check2 = new JCheckBox("Aleman");
		check2.setBounds(10,90,150,30);
		check2.addChangeListener(this);
		add(check2);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(150,100,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void stateChanged(ChangeEvent c){
		String cad = ""; 
		
		if(check.isSelected() == true){
			cad = cad + "Ingles-";
		}

		if(check1.isSelected() == true){
			cad = cad + "Frances-";
		}

		if(check2.isSelected() == true){
			cad = cad + "Aleman-";
		}
		
		setTitle(cad);
	}

	public void actionPerformed(ActionEvent a){
		
		if(a.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		Check formulario = new Check();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}