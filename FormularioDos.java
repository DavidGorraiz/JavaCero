import javax.swing.*;

public class FormularioDos extends JFrame{

	private JLabel etiqueta;
	private JLabel etiqueta1;

	public FormularioDos(){
		setLayout(null);
		etiqueta = new JLabel("Interfaz grafica.");
		etiqueta.setBounds(10,20,300,30);
		add(etiqueta);
		etiqueta1 = new JLabel("Version 1.0");
		etiqueta1.setBounds(10,100,100,30);
		add(etiqueta1);
	}

	public static void main(String args[]){
		FormularioDos formulario = new FormularioDos();
		formulario.setBounds(0,0,300,200);
		formulario.setResizable(false);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
	}
}