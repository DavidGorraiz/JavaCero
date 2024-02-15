import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

public class Bienvenida extends JFrame implements ActionListener{

	private JTextField bloqueTexto;
	private JLabel etiqueta, etiqueta1, etiqueta2, etiqueta3;
	private JButton ingresar;
	public static String texto = "";

	public Bienvenida(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Bienvenido");
		getContentPane().setBackground(new Color(255,0,0));
		setIconImage(new ImageIcon(getClass().getResource("Imagenes/icon.png")).getImage());

		ImageIcon imagen = new ImageIcon("Imagenes/logo-coca.png");
		etiqueta = new JLabel(imagen);
		etiqueta.setBounds(25,15,300,150);
		add(etiqueta);

		etiqueta1 = new JLabel("Sistema de Control Vacacional");
		etiqueta1.setBounds(35,135,300,30);
		etiqueta1.setFont(new Font("Arial", 3, 18));
		etiqueta1.setForeground(new Color(255,255,255));
		add(etiqueta1);

		etiqueta2 = new JLabel("Ingrese su nombre");
		etiqueta2.setBounds(45,212,200,30);
		etiqueta2.setFont(new Font("Arial", 1, 12));
		etiqueta2.setForeground(new Color(255,255,255));
		add(etiqueta2);

		etiqueta3 = new JLabel("©2017 The Coca-Cola Company");
		etiqueta3.setBounds(85,375,300,30);
		etiqueta3.setFont(new Font("Arial", 1, 12));
		etiqueta3.setForeground(new Color(255,255,255));
		add(etiqueta3);

		bloqueTexto = new JTextField();
		bloqueTexto.setBounds(45,240,255,25);
		bloqueTexto.setBackground(new Color(224,224,224));
		bloqueTexto.setFont(new Font("Arial", 1, 14));
		bloqueTexto.setForeground(new Color(255,0,0));
		add(bloqueTexto);

		ingresar = new JButton("Ingresar");
		ingresar.setBounds(125,280,100,30);
		ingresar.setBackground(new Color(255,255,255));
		ingresar.setFont(new Font("Arial", 1, 14));
		ingresar.setForeground(new Color(255,0,0));
		ingresar.addActionListener(this);
		add(ingresar);
	}

	public void actionPerformed(ActionEvent e){
		if(e.getSource() == ingresar){
			texto = bloqueTexto.getText().trim();
			if(texto.equals("")){
				JOptionPane.showMessageDialog(null, "Debes ingresar tu nombre.");	
			} else{
				Licencia licencia = new Licencia();
				licencia.setBounds(0,0,600,360);
				licencia.setVisible(true);
				licencia.setResizable(false);
				licencia.setLocationRelativeTo(null);
				this.setVisible(false);
			}
		}
	}

	public static void main(String args[]){
		Bienvenida bienvenida = new Bienvenida();
		bienvenida.setBounds(0,0,350,450);
		bienvenida.setVisible(true);
		bienvenida.setResizable(false);
		bienvenida.setLocationRelativeTo(null);
	}
}