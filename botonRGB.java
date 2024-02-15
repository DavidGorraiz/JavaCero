import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class botonRGB extends JFrame implements ActionListener{

	private JLabel etiqueta, etiqueta1, etiqueta2;
	private JComboBox combo, combo1, combo2;
	private JButton boton, cerrar;

	public botonRGB(){
		setLayout(null);

		etiqueta = new JLabel("Rojo:");
		etiqueta.setBounds(10,10,100,10);
		add(etiqueta);

		combo = new JComboBox();
		combo.setBounds(120,10,50,30);
			for(int i = 0; i <= 255; i++){
				combo.addItem(String.valueOf(i));
			}
		add(combo);

		etiqueta1 = new JLabel("Verde:");
		etiqueta1.setBounds(10,50,100,10);
		add(etiqueta1);

		combo1 = new JComboBox();
		combo1.setBounds(120,50,50,30);
			for(int i = 0; i <= 255; i++){
				combo1.addItem(String.valueOf(i));
			}
		add(combo1);

		etiqueta2 = new JLabel("Azul:");
		etiqueta2.setBounds(10,90,100,10);
		add(etiqueta2);

		combo2 = new JComboBox();
		combo2.setBounds(120,90,50,30);
			for(int i = 0; i <= 255; i++){
				combo2.addItem(String.valueOf(i));
			}
		add(combo2);

		boton = new JButton("Fijar color");
		boton.setBounds(10,130,100,30);
		add(boton);
		boton.addActionListener(this);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(10,170,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String cad = combo.getSelectedItem().toString();
			String cad1 = combo1.getSelectedItem().toString();
			String cad2 = combo2.getSelectedItem().toString();
			
			int rojo = Integer.parseInt(cad);
			int verde = Integer.parseInt(cad1);
			int azul = Integer.parseInt(cad2);

			Color color = new Color(rojo,verde,azul);
			boton.setBackground(color);
		}
		
		if(e.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		botonRGB formulario = new botonRGB();
		formulario.setBounds(0,0,190,300);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}
