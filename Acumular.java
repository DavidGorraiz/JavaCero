import javax.swing.*;
import java.awt.event.*;

public class Acumular extends JFrame implements ActionListener{
	
	private JTextField bloqueTexto;
	private JScrollPane scroll;
	private JTextArea areaTexto;
	private JButton agregar, cerrar;

	String texto = "";

	public Acumular(){
		setLayout(null);
		bloqueTexto = new JTextField();
		bloqueTexto.setBounds(10,10,200,30);
		add(bloqueTexto);

		agregar = new JButton("Agregar");
		agregar.setBounds(250,10,100,30);
		add(agregar);
		agregar.addActionListener(this);
		
		areaTexto = new JTextArea();
		scroll = new JScrollPane(areaTexto);
		scroll.setBounds(10,50,400,300);
		add(scroll);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(420,300,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == agregar){
			texto += bloqueTexto.getText() + "\n";
			areaTexto.setText(texto);
			bloqueTexto.setText("");
		}

		if(e.getSource() == cerrar){
			System.exit(0);		
		}
	}

	public static void main(String args[]){
		Acumular formulario = new Acumular();
		formulario.setBounds(0,0,540,400);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}