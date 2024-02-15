import javax.swing.*;
import java.awt.event.*;

public class EtiquetaBoton extends JFrame implements ActionListener{
	private JButton boton, boton1, boton2, botonC;
	private JLabel etiqueta;

	public EtiquetaBoton(){
		setLayout(null);
		boton = new JButton("1");
		boton.setBounds(10,50,90,30);
		add(boton);
		boton.addActionListener(this);
		
		boton1 = new JButton("2");
		boton1.setBounds(110,50,90,30);
		add(boton1);
		boton1.addActionListener(this);
		
		boton2 = new JButton("3");
		boton2.setBounds(210,50,90,30);
		add(boton2);
		boton2.addActionListener(this);

		botonC = new JButton("Cerrar");
		botonC.setBounds(210,100,90,30);
		add(botonC);
		botonC.addActionListener(this);

		etiqueta = new JLabel("En espera ...");
		etiqueta.setBounds(10,10,300,30);
		add(etiqueta);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			etiqueta.setText("Has presioncado el boton 1.");
		}

		if(e.getSource() == boton1){
			etiqueta.setText("Has presioncado el boton 2.");
		}

		if(e.getSource() == boton2){
			etiqueta.setText("Has presioncado el boton 3.");
		}

		if(e.getSource() == botonC){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		EtiquetaBoton formulario = new EtiquetaBoton();
		formulario.setBounds(0,0,350,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}