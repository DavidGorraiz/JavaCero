import javax.swing.*;
import javax.swing.event.*;
import java.awt.*;
import java.awt.event.*;

public class Licencia extends JFrame implements ChangeListener, ActionListener{

	private JLabel etiqueta, etiqueta1;
	private JCheckBox check;
	private JButton continuar, noAcepto;
	private JScrollPane scroll;
	private JTextArea areaTexto;
	String nombre = "";

	public Licencia(){
		setLayout(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setTitle("Licencia de uso");
		setIconImage(new ImageIcon(getClass().getResource("Imagenes/icon.png")).getImage());
		Bienvenida bienvenida = new Bienvenida();
		nombre = bienvenida.texto;

		etiqueta = new JLabel("TÉRMINOS Y CONDICIONES");
		etiqueta.setBounds(215,5,200,30);
		etiqueta.setFont(new Font("Arial", 1, 14));
		etiqueta.setForeground(new Color(0,0,0));
		add(etiqueta);

		areaTexto = new JTextArea();
		areaTexto.setEditable(false);
		areaTexto.setFont(new Font("Arial", 0, 9));
		areaTexto.setText("\n\n          TÉRMINOS Y CONDICIONES" +
		    "\n\n            A.  PROHIBIDA SU VENTA O DISTRIBUCIÓN SIN AUTORIZACIÓN DE LA GEEKIPEDIA DE ERNESTO." +
                    "\n            B.  PROHIBIDA LA ALTERACIÓN DEL CÓDIGO FUENTE O DISEÑO DE LAS INTERFACES GRÁFICAS." +
                    "\n            C.  LA GEEKIPEDIA DE ERNESTO NO SE HACE RESPONSABLE DEL MAL USO DE ESTE SOFTWARE." +
                    "\n\n          LOS ACUERDOS LEGALES EXPUESTOS ACONTINUACIÓN RIGEN EL USO QUE USTED HAGA DE ESTE SOFTWARE" +
                    "\n          (LA GEEKIPEDIA DE ERNESTO Y EL AUTOR ERNESTO), NO SE RESPONSABILIZAN DEL USO QUE USTED" + 
                    "\n          HAGA CON ESTE SOFTWARE Y SUS SERVICIOS. PARA ACEPTAR ESTOS TERMINOS HAGA CLIC EN (ACEPTO)" +
                    "\n          SI USTED NO ACEPTA ESTOS TERMINOS, HAGA CLIC EN (NO ACEPTO) Y NO UTILICE ESTE SOFTWARE." + 
                    "\n\n          PARA MAYOR INFORMACIÓN SOBRE NUESTROS PRODUCTOS O SERVICIOS, POR FAVOR VISITE" + 
                    "\n          http://www.youtube.com/ernestoperezm");
		scroll = new JScrollPane(areaTexto);
		scroll.setBounds(10,40,575,200);
		add(scroll);
		
		check = new JCheckBox("Yo " + nombre + " Acepto");
		check.setBounds(10,250,300,30);
		check.addChangeListener(this);
		add(check);

		continuar = new JButton("Continuar");
		continuar.setBounds(10,290,100,30);
		continuar.addActionListener(this);
		continuar.setEnabled(false);
		add(continuar);

		noAcepto = new JButton("No Acepto");
		noAcepto.setBounds(120,290,100,30);
		noAcepto.addActionListener(this);
		noAcepto.setEnabled(true);
		add(noAcepto);

		ImageIcon imagen = new ImageIcon("Imagenes/coca-cola.png");
		etiqueta1 = new JLabel(imagen);
		etiqueta1.setBounds(315,135,300,300);
		add(etiqueta1);
	}
	
	public void stateChanged(ChangeEvent e){
		if(check.isSelected() == true){
			continuar.setEnabled(true);
			noAcepto.setEnabled(false);
		}else {
			continuar.setEnabled(false);
			noAcepto.setEnabled(true);
		}	
	}
	
	public void actionPerformed(ActionEvent e){
		if(e.getSource() == continuar){
			Principal principal = new Principal();
			principal.setBounds(0,0,640,535);
			principal.setVisible(true);
			principal.setResizable(false);
			principal.setLocationRelativeTo(null);
			this.setVisible(false);
		} else if(e.getSource() == noAcepto){
			Bienvenida bienvenida = new Bienvenida();
			bienvenida.setBounds(0,0,350,450);
			bienvenida.setVisible(true);
			bienvenida.setResizable(false);
			bienvenida.setLocationRelativeTo(null);
			this.setVisible(false);
		}
	}

	public static void main(String args[]){
		Licencia licencia = new Licencia();
		licencia.setBounds(0,0,600,360);
		licencia.setVisible(true);
		licencia.setResizable(false);
		licencia.setLocationRelativeTo(null);
	}
}