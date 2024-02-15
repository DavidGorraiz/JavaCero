import javax.swing.*;
import java.awt.event.*;

public class interfazLista extends JFrame implements ItemListener, ActionListener{

	private JComboBox combo;
	private JButton cerrar;
	
	public interfazLista(){
		setLayout(null);
		combo = new JComboBox();
		combo.setBounds(10,10,80,20);
		add(combo);

		combo.addItem("rojo");
		combo.addItem("verde");
		combo.addItem("azul");
		combo.addItem("amarillo");
		combo.addItem("negro");

		combo.addItemListener(this);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(10,110,100,30);
		add(cerrar);


		cerrar.addActionListener(this);
	}

	public void itemStateChanged(ItemEvent i){
		if(i.getSource() == combo){
			String seleccion = combo.getSelectedItem().toString();
			setTitle(seleccion);
		}
	}

	public void actionPerformed(ActionEvent a){
		if(a.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		interfazLista formulario = new interfazLista();
		formulario.setBounds(0,0,300,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}