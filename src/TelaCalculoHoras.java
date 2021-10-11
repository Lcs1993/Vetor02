import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class TelaCalculoHoras {

	private JFrame frame;
	private JTextField text;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					TelaCalculoHoras window = new TelaCalculoHoras();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public TelaCalculoHoras() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		JLabel lblV = new JLabel("Valor");
		lblV.setBounds(31, 46, 46, 14);
		frame.getContentPane().add(lblV);
		
		JLabel lblR = new JLabel("Resultado Em Minutos");
		lblR.setBounds(10, 136, 153, 14);
		frame.getContentPane().add(lblR);
		
		text = new JTextField();
		text.setBounds(87, 43, 86, 20);
		frame.getContentPane().add(text);
		text.setColumns(10);
		
		JLabel lblResultado = new JLabel("Resultado");
		lblResultado.setFont(new Font("Tahoma", Font.PLAIN, 14));
		lblResultado.setForeground(Color.RED);
		lblResultado.setBounds(173, 126, 86, 30);
		frame.getContentPane().add(lblResultado);
		
		JLabel lblValores = new JLabel("Valores Comuns");
		lblValores.setBounds(293, 49, 95, 14);
		frame.getContentPane().add(lblValores);
		
		JLabel lblNewLabel_1 = new JLabel("17 = 10 min");
		lblNewLabel_1.setBounds(312, 76, 76, 14);
		frame.getContentPane().add(lblNewLabel_1);
		
		JLabel lblNewLabel_2 = new JLabel("33 = 20 min");
		lblNewLabel_2.setBounds(313, 87, 70, 30);
		frame.getContentPane().add(lblNewLabel_2);
		
		JLabel lblNewLabel_3 = new JLabel("50 = 30 min");
		lblNewLabel_3.setBounds(312, 116, 70, 14);
		frame.getContentPane().add(lblNewLabel_3);
		
		JLabel lblNewLabel_4 = new JLabel("66 = 40 min");
		lblNewLabel_4.setBounds(313, 136, 70, 14);
		frame.getContentPane().add(lblNewLabel_4);
		
		JLabel lblNewLabel = new JLabel("83 = 50 min");
		lblNewLabel.setBounds(313, 161, 70, 14);
		frame.getContentPane().add(lblNewLabel);
		
		JButton lblC = new JButton("Calcular");
		lblC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				int valor=Integer.parseInt(text.getText().toString());
				int resultado=(int)Math.ceil((valor*60)/100);
				lblResultado.setText(Integer.toString(resultado));
				
				
			}
		});
		lblC.setBounds(39, 91, 89, 23);
		frame.getContentPane().add(lblC);
	}
}
