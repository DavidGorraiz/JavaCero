import javax.swing.*;
import java.awt.event.*;

public class Scroll extends JFrame implements ActionListener{
	
	private JTextField bloqueTexto;
	private JScrollPane scroll;
	private JTextArea areaTexto;
	private JButton cerrar;

	public Scroll(){
		setLayout(null);
		bloqueTexto = new JTextField();
		bloqueTexto.setBounds(10,10,200,30);
		add(bloqueTexto);

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
		if(e.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		Scroll formulario = new Scroll();
		formulario.setBounds(0,0,540,400);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}

}