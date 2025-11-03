import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.SwingConstants;
import javax.sound.sampled.AudioInputStream;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.io.File;

public class INICIO extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					INICIO frame = new INICIO();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */

	public INICIO() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1107, 651);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JButton btnInicioJuego = new JButton("INICIAR JUEGO");
		btnInicioJuego.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				CuestionarioAppF newframe = new CuestionarioAppF ();
				
				newframe.setVisible(true);
				
				dispose();
				
			}
		});
		btnInicioJuego.setForeground(new Color(0, 0, 102));
		btnInicioJuego.setFont(new Font("Impact", Font.PLAIN, 22));
		btnInicioJuego.setBackground(new Color(106, 90, 205));
		btnInicioJuego.setBounds(391, 403, 276, 60);
		contentPane.add(btnInicioJuego);
		
		JButton btnSalir = new JButton("SALIR");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				System.exit(0);
			}
		});
		btnSalir.setForeground(new Color(0, 0, 102));
		btnSalir.setFont(new Font("Impact", Font.PLAIN, 22));
		btnSalir.setBackground(new Color(106, 90, 205));
		btnSalir.setBounds(391, 474, 276, 60);
		contentPane.add(btnSalir);
		
		
		JLabel lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon(INICIO.class.getResource("/Fotos/INICIO.jpg")));
		lblfondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblfondo.setBounds(0, 0, 1091, 612);
		contentPane.add(lblfondo);
	}
}
