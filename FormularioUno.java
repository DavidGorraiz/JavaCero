import javax.swing.*;

public class FormularioUno extends JFrame{

	public FormularioUno(){
		setLayout(null);
	}

	public static void main(String args[]){
		FormularioUno formulario = new FormularioUno();
		formulario.setBounds(0,0,400,550);
		formulario.setVisible(true);
		formulario.setLocationRelativeTo(null);
		formulario.setResizable(false);
	}
}