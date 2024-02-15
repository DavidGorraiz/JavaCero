import javax.swing.*;
import java.awt.event.*;

public class InterfazTexto extends JFrame implements ActionListener{

	private JTextField bloqueTexto;
	private JLabel etiqueta;
	private JButton boton, Cerrar;

	public InterfazTexto(){
		setLayout(null);
		etiqueta = new JLabel("Usuario:");
		etiqueta.setBounds(10,10,100,30);
		add(etiqueta);

		bloqueTexto = new JTextField();
		bloqueTexto.setBounds(120,17,150,20);
		add(bloqueTexto);

		boton = new JButton("Aceptar");
		boton.setBounds(10,80,100,30);
		add(boton);
		boton.addActionListener(this);

		Cerrar = new JButton("Cerrar");
		Cerrar.setBounds(120,80,100,30);
		add(Cerrar);
		Cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == boton){
			String texto = bloqueTexto.getText();
			setTitle(texto);
		}

		if(e.getSource() == Cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		InterfazTexto formulario = new InterfazTexto();
		formulario.setBounds(0,0,300,150);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}