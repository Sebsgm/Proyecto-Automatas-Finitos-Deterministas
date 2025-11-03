import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.Timer;
import javax.swing.JButton;
import javax.swing.ImageIcon;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.awt.event.ActionEvent;

public class CuestionarioAppF extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;
	private int tiempoRestante = 180; // Tiempo en segundos (3 minutos)
	private Timer timer;
	private Cuestionario cuestionario = new Cuestionario();
	private List<Pregunta> preguntasActuales;
	private List<Pregunta> preguntasIncorrectas = new ArrayList<>();
	private int preguntaIndex = 0;
	private int correctas = 0;
	private int incorrectas = 0;
	private int puntuacion;
	private JLabel tiempoLabel;
	private JLabel lblPreguntas, lblRespuesta1, lblRespuesta2, lblRespuesta3, lblRespuesta4;
	private JButton btnOpA, btnOpB, btnOpC, btnOpD;
	private String[] opcionesMezcladas;
	private JLabel lblfondo;

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
	
	public CuestionarioAppF() {
		cuestionario = new Cuestionario();
        VentanaInicial();
		
	}
	
	public void VentanaInicial() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 843, 409);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBackground(new Color(138, 43, 226));
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblDescripcion = new JLabel("Tiene un total de 3 minutos para responder a las preguntas. Por cada pregunta incorrecta se restan 10 segundos.");
		lblDescripcion.setForeground(new Color(0, 0, 102));
		lblDescripcion.setOpaque(true);
		lblDescripcion.setHorizontalAlignment(SwingConstants.CENTER);
		lblDescripcion.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblDescripcion.setBackground(new Color(106, 90, 205));
		lblDescripcion.setBounds(62, 106, 700, 51);
		contentPane.add(lblDescripcion);
		
		JLabel lblBienvenida_1 = new JLabel("BIENVENIDO AL CUESTIONARIO, SELECCIONA UNA CATEGORIA PARA COMENZAR:");
		lblBienvenida_1.setLabelFor(this);
		lblBienvenida_1.setOpaque(true);
		lblBienvenida_1.setForeground(new Color(0, 0, 102));
		lblBienvenida_1.setHorizontalAlignment(SwingConstants.CENTER);
		lblBienvenida_1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblBienvenida_1.setBackground(new Color(106, 90, 205));
		lblBienvenida_1.setBounds(62, 11, 700, 63);
		contentPane.add(lblBienvenida_1);
		
		JButton categoriaCienciaButton = new JButton("Ciencia");
		categoriaCienciaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaJuego("Ciencia");
				
			}
		});
		categoriaCienciaButton.setForeground(new Color(0, 0, 102));
		categoriaCienciaButton.setBackground(new Color(106, 90, 205));
		categoriaCienciaButton.setFont(new Font("Impact", Font.PLAIN, 22));
		categoriaCienciaButton.setBounds(323, 241, 193, 44);
		contentPane.add(categoriaCienciaButton);
		
		JButton categoriaHistoriaButton = new JButton("Historia");
		categoriaHistoriaButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				VentanaJuego("Historia");
				
			}
		});
		categoriaHistoriaButton.setForeground(new Color(0, 0, 102));
		categoriaHistoriaButton.setBackground(new Color(106, 90, 205));
		categoriaHistoriaButton.setFont(new Font("Impact", Font.PLAIN, 22));
		categoriaHistoriaButton.setBounds(323, 296, 193, 44);
		contentPane.add(categoriaHistoriaButton);
		
		JLabel lblFondoBienvenida = new JLabel("");
		lblFondoBienvenida.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/LogoF-removebg-preview.png")));
		lblFondoBienvenida.setBounds(233, 11, 372, 348);
		contentPane.add(lblFondoBienvenida);

	}
	
	public void VentanaJuego(String categoria) {
		preguntasActuales = cuestionario.obtenerPreguntasAleatorias(categoria);
		preguntaIndex = 0;
		correctas = 0;
		incorrectas = 0;
		puntuacion = 0;
		preguntasIncorrectas.clear();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1110, 660);
		setLocationRelativeTo(null);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);

		btnOpA = new JButton("");
		btnOpA.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/A.png")));
		btnOpA.setBounds(210, 480, 22, 31);
		contentPane.add(btnOpA);

		btnOpB = new JButton("");
		btnOpB.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/B.png")));
		btnOpB.setBounds(590, 480, 22, 31);
		contentPane.add(btnOpB);

		btnOpC = new JButton("");
		btnOpC.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/C.png")));
		btnOpC.setBounds(210, 557, 22, 31);
		contentPane.add(btnOpC);

		btnOpD = new JButton("");
		btnOpD.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/D.png")));
		btnOpD.setBounds(590, 557, 22, 31);
		contentPane.add(btnOpD);

		lblPreguntas = new JLabel();
		lblPreguntas.setHorizontalAlignment(SwingConstants.CENTER);
		lblPreguntas.setForeground(Color.WHITE);
		lblPreguntas.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblPreguntas.setBounds(153, 339, 794, 102);
		contentPane.add(lblPreguntas);

		lblRespuesta1 = new JLabel();
		lblRespuesta1.setForeground(Color.WHITE);
		lblRespuesta1.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRespuesta1.setBounds(242, 480, 289, 31);
		contentPane.add(lblRespuesta1);

		lblRespuesta2 = new JLabel();
		lblRespuesta2.setForeground(Color.WHITE);
		lblRespuesta2.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRespuesta2.setBounds(622, 480, 289, 31);
		contentPane.add(lblRespuesta2);

		lblRespuesta3 = new JLabel();
		lblRespuesta3.setForeground(Color.WHITE);
		lblRespuesta3.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRespuesta3.setBounds(242, 557, 289, 31);
		contentPane.add(lblRespuesta3);

		lblRespuesta4 = new JLabel();
		lblRespuesta4.setForeground(Color.WHITE);
		lblRespuesta4.setFont(new Font("Tahoma", Font.BOLD, 16));
		lblRespuesta4.setBounds(622, 557, 289, 31);
		contentPane.add(lblRespuesta4);
		
		tiempoLabel = new JLabel("Tiempo restante: 3:00");
		tiempoLabel.setFont(new Font("Tahoma", Font.BOLD, 30));
		tiempoLabel.setForeground(new Color(255, 255, 255));
		tiempoLabel.setBounds(10, 0, 377, 61);
		contentPane.add(tiempoLabel);
		
		lblfondo = new JLabel("");
		lblfondo.setIcon(new ImageIcon(CuestionarioAppF.class.getResource("/Fotos/template.png")));
		lblfondo.setHorizontalAlignment(SwingConstants.CENTER);
		lblfondo.setBounds(0, 0, 1094, 621);
		contentPane.add(lblfondo);

		// Agregar listeners para los botones
		btnOpA.addActionListener(e -> verificarRespuesta(0));
		btnOpB.addActionListener(e -> verificarRespuesta(1));
		btnOpC.addActionListener(e -> verificarRespuesta(2));
		btnOpD.addActionListener(e -> verificarRespuesta(3));
		

		iniciarTemporizador();
	    mostrarPregunta();
	    revalidate();
	    repaint();
		
	}

	
	
	private void iniciarTemporizador() {
		
		tiempoRestante = 180;
		
	    timer = new Timer(1000, new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                tiempoRestante--;
                int minutos = tiempoRestante / 60;
                int segundos = tiempoRestante % 60;
                tiempoLabel.setText(String.format("Tiempo restante: %02d:%02d", minutos, segundos));

                if (tiempoRestante <= 0) {
                    timer.stop();
                    JOptionPane.showMessageDialog(null, "¡Se acabó el tiempo!");
                    mostrarResultados();
                }
            }
        });
        timer.start();
	}
	public void mostrarPregunta() {
		if (preguntaIndex < preguntasActuales.size()) {
			Pregunta pregunta = preguntasActuales.get(preguntaIndex);
			lblPreguntas.setText(pregunta.getTextoPregunta());

			// Obtener y mezclar opciones
			opcionesMezcladas = pregunta.getOpciones().clone();
			Collections.shuffle(Arrays.asList(opcionesMezcladas));

			lblRespuesta1.setText(opcionesMezcladas[0]);
			lblRespuesta2.setText(opcionesMezcladas[1]);
			lblRespuesta3.setText(opcionesMezcladas[2]);
			lblRespuesta4.setText(opcionesMezcladas[3]);

		}else if (!preguntasIncorrectas.isEmpty()) {
            preguntasActuales = new ArrayList<>(preguntasIncorrectas);
            preguntasIncorrectas.clear();
            preguntaIndex = 0;
            mostrarPregunta();
        } 
		else {
			mostrarResultados();
		}
	}
	
	public void mostrarResultados() {
		timer.stop();
		int opcion = JOptionPane.showOptionDialog(this, "Juego terminado.\nCorrectas: " + correctas + "\nIncorrectas: " + incorrectas + "\nPuntuación: " + puntuacion + 
				"\n¿Deseas volver a jugar o salir?",
		        "Resultados",
		        JOptionPane.YES_NO_OPTION,
		        JOptionPane.INFORMATION_MESSAGE,
		        null,
		        new String[]{"Volver a jugar", "Salir"},
		        "Volver a jugar"
		    );

		    if (opcion == JOptionPane.YES_OPTION) {
		        reiniciarJuego();
		    } else {
		        System.exit(0);
		    };
	}

	public void verificarRespuesta(int opcionSeleccionada) {
		Pregunta pregunta = preguntasActuales.get(preguntaIndex);
		// Verificar si la opción seleccionada es correcta
		if (opcionesMezcladas[opcionSeleccionada].equals(pregunta.getOpciones()[pregunta.getRespuestaCorrecta()])) {
			correctas++;
			puntuacion += 200;
			JOptionPane.showMessageDialog(this, "¡Respuesta correcta!");
		} else {
			incorrectas++;
			puntuacion -= 200;
			tiempoRestante -= 10; // Penalización de 10 segundos
			preguntasIncorrectas.add(pregunta);
			JOptionPane.showMessageDialog(this, "Respuesta incorrecta.")
			
			;
		}
		preguntaIndex++;
		mostrarPregunta();
	}
	
    private void reiniciarJuego() {
    // Reiniciar todas las variables necesarias
    preguntaIndex = 0;
    correctas = 0;
    incorrectas = 0;
    puntuacion = 0;
    preguntasIncorrectas.clear();
    tiempoRestante = 180; // Tiempo en segundos (3 minutos)
    
    // Detener el temporizador si está corriendo
    if (timer != null) {
        timer.stop();
    }
    
    // Limpiar la interfaz y mostrar la ventana inicial de selección de categoría
    getContentPane().removeAll();
    revalidate();
    repaint();
    VentanaInicial();

}
	
}
