package cliente;

import java.awt.FlowLayout;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;

public class VentanaUsuarios extends JFrame {
	JPanel p = new JPanel(new FlowLayout(FlowLayout.CENTER));
	JTextArea ta = new JTextArea(15,40);

	public VentanaUsuarios() {
		this.setSize(600, 400);

		this.setTitle("Usuarios");
		
		
		this.setContentPane(p);
		ta.setEditable(false);
		ta.setText("Usuarios");
		JScrollPane scroll= new JScrollPane(ta);
		scroll.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		p.add(scroll);
		this.setVisible(true);
		
	}

	public JTextArea getTa() {
		return ta;
	}

	public void setTa(JTextArea ta) {
		this.ta = ta;
	}
	

}