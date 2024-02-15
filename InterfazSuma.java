import javax.swing.*;
import java.awt.event.*;

public class InterfazSuma extends JFrame implements ActionListener{
	
	private JTextField bloqueTexto, bloqueTexto1;
	private JLabel etiqueta, etiqueta1, etiqueta2;
	private JButton suma, cerrar;

	public InterfazSuma(){
		setLayout(null);
		etiqueta = new JLabel("Valor 1:");
		etiqueta.setBounds(50,5,100,30);
		add(etiqueta);

		etiqueta1 = new JLabel("Valor 2:");
		etiqueta1.setBounds(50,35,100,30);
		add(etiqueta1);

		etiqueta2 = new JLabel("Resultado:");
		etiqueta2.setBounds(120,80,100,30);
		add(etiqueta2);

		bloqueTexto = new JTextField();
		bloqueTexto.setBounds(120,10,150,30);
		add(bloqueTexto);
	
		bloqueTexto1 = new JTextField();
		bloqueTexto1.setBounds(120,40,150,30);
		add(bloqueTexto1);

		suma = new JButton("Sumar");
		suma.setBounds(10,80,100,30);
		add(suma);
		suma.addActionListener(this);

		cerrar = new JButton("Cerrar");
		cerrar.setBounds(10,110,100,30);
		add(cerrar);
		cerrar.addActionListener(this);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == suma){
			int valor1 = 0, valor2 = 0, resultado = 0;
			
			valor1 = Integer.parseInt(bloqueTexto.getText());
			valor2 = Integer.parseInt(bloqueTexto1.getText());

			resultado = valor1 + valor2;
			
			etiqueta2.setText("Resultado: " + resultado);
		}

		if(e.getSource() == cerrar){
			System.exit(0);
		}
	}

	public static void main(String args[]){
		InterfazSuma formulario = new InterfazSuma();
		formulario.setBounds(0,0,300,200);
		formulario.setVisible(true);
		formulario.setResizable(false);
		formulario.setLocationRelativeTo(null);
	}
}