package Paquete;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import java.awt.Font;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import java.io.File;
import java.io.IOException;
import java.awt.Color;
import javax.sound.sampled.AudioSystem;
import javax.sound.sampled.Clip;
import javax.sound.sampled.LineUnavailableException;
import javax.sound.sampled.UnsupportedAudioFileException;
import javax.swing.ImageIcon;
import java.awt.Toolkit;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

/**
 * @author Beatriz Hernandez Perez Tome
 */

public class JVentana extends JFrame {

	private static final long serialVersionUID = 1L;
	private JTextField cajaTexto1, cajaTexto2;

	public JVentana() {
		setResizable(false);
		setIconImage(Toolkit.getDefaultToolkit().getImage("src/Imagenes/icono.png"));
		getContentPane().setBackground(new Color(165, 42, 42));
		getContentPane().setForeground(new Color(0, 0, 0));
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(530, 712);
		setLocationRelativeTo(null);
		getContentPane().setLayout(null);
		inicializarComponentes();
		setVisible(true);

	}

	private void inicializarComponentes() {

		setTitle("Calculadora");

		cajaTexto1 = new JTextField();
		cajaTexto1.setDoubleBuffered(true);
		cajaTexto1.setFont(new Font("Cambria", Font.BOLD, 14));
		cajaTexto1.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}
			}

		});
		cajaTexto1.setBounds(221, 209, 140, 30);
		cajaTexto2 = new JTextField();
		cajaTexto2.setFont(new Font("Cambria", Font.BOLD, 14));
		cajaTexto2.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar = e.getKeyChar();
				if (Character.isLetter(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(rootPane, "INGRESAR SOLO NÚMEROS", "Advertencia",
							JOptionPane.WARNING_MESSAGE);
				}
			}
		});
		cajaTexto2.setBounds(221, 269, 140, 30);

		getContentPane().add(cajaTexto1);
		getContentPane().add(cajaTexto2);

		JLabel numero1 = new JLabel("NUMERO 1:");
		numero1.setForeground(new Color(0, 0, 0));
		numero1.setFont(new Font("Broadway", Font.PLAIN, 15));
		numero1.setBounds(123, 208, 99, 30);
		getContentPane().add(numero1);

		JLabel numero2 = new JLabel("NUMERO 2:");
		numero2.setForeground(new Color(0, 0, 0));
		numero2.setFont(new Font("Broadway", Font.PLAIN, 15));
		numero2.setBounds(123, 268, 99, 30);
		getContentPane().add(numero2);

		JButton bSumar = new JButton("SUMAR");
		bSumar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("src/Music/Sumar.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir sonido");
				}
			}
		});
		bSumar.setBackground(Color.WHITE);
		bSumar.setFont(new Font("Cambria", Font.BOLD, 12));
		bSumar.setBounds(91, 356, 140, 45);
		getContentPane().add(bSumar);

		JButton bRestar = new JButton("RESTAR");
		bRestar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("src/Music/Restar.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir sonido");
				}
			}
		});
		bRestar.setBackground(Color.WHITE);
		bRestar.setFont(new Font("Cambria", Font.BOLD, 12));
		bRestar.setBounds(91, 412, 140, 45);
		getContentPane().add(bRestar);

		JButton bMultiplicar = new JButton("MULTIPLICAR");
		bMultiplicar.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("src/Music/Multiplicar.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir sonido");
				}
			}
		});
		bMultiplicar.setBackground(Color.WHITE);
		bMultiplicar.setFont(new Font("Cambria", Font.BOLD, 12));
		bMultiplicar.setBounds(91, 472, 140, 45);
		getContentPane().add(bMultiplicar);

		JButton bDividir = new JButton("DIVIDIR");
		bDividir.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				try {
					Clip clip = AudioSystem.getClip();
					clip.open(AudioSystem.getAudioInputStream(new File("src/Music/Dividir.wav")));
					clip.start();
				} catch (UnsupportedAudioFileException | IOException | LineUnavailableException ex) {
					System.out.println("Error al reproducir sonido");
				}
			}
		});
		bDividir.setBackground(Color.WHITE);
		bDividir.setFont(new Font("Cambria", Font.BOLD, 12));
		bDividir.setBounds(91, 528, 140, 45);
		getContentPane().add(bDividir);

		JButton raizCuadrada = new JButton("\u221A ");
		raizCuadrada.setFont(new Font("Cambria", Font.BOLD, 12));
		raizCuadrada.setBackground(Color.WHITE);
		raizCuadrada.setBounds(269, 356, 92, 45);
		getContentPane().add(raizCuadrada);

		JButton raizCubica = new JButton("3\u221A");
		raizCubica.setFont(new Font("Cambria", Font.BOLD, 12));
		raizCubica.setBackground(Color.WHITE);
		raizCubica.setBounds(375, 356, 89, 45);
		getContentPane().add(raizCubica);

		JLabel textResultado = new JLabel("");
		textResultado.setFont(new Font("Cambria", Font.BOLD, 14));
		textResultado.setForeground(Color.WHITE);
		textResultado.setBounds(300, 648, 187, 14);
		getContentPane().add(textResultado);

		JLabel icono = new JLabel("");
		icono.setIcon(new ImageIcon("src/Imagenes/png.png"));
		icono.setBounds(102, 28, 304, 152);
		getContentPane().add(icono);

		JLabel fondo = new JLabel("");
		fondo.setIcon(new ImageIcon("src/Imagenes/fondo.jpg"));
		fondo.setBounds(0, 0, 514, 681);
		getContentPane().add(fondo);

		// Componente que usaremos para la suma
		bSumar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == bSumar) {

						String cajaText1 = cajaTexto1.getText();
						String cajaText2 = cajaTexto2.getText();
						int num1 = Integer.parseInt(cajaText1);
						int num2 = Integer.parseInt(cajaText2);

						int sumar = num1 + num2;
						String total = String.valueOf(sumar);
						textResultado.setText(total);
						textResultado.setText("EL RESULTADO ES " + sumar);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INGRESE NÚMEROS", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}

			}

		});
		// Componente que usaremos para la resta
		bRestar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == bRestar) {

						String cajaText1 = cajaTexto1.getText();
						String cajaText2 = cajaTexto2.getText();
						int num1 = Integer.parseInt(cajaText1);
						int num2 = Integer.parseInt(cajaText2);

						int restar = num1 - num2;
						String total = String.valueOf(restar);
						textResultado.setText(total);
						textResultado.setText("EL RESULTADO ES " + restar);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INGRESE NÚMEROS", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}

			}
		});
		// Componente que usaremos para la división
		bDividir.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					String cajaText1 = cajaTexto1.getText();
					String cajaText2 = cajaTexto2.getText();
					int num1 = Integer.parseInt(cajaText1);
					int num2 = Integer.parseInt(cajaText2);
					if (e.getSource() == bDividir) {
						if (num2 == 0) {
							JOptionPane.showMessageDialog(null, "NO SE PUEDE DIVIDIR ENTRE 0", "Error",
									JOptionPane.ERROR_MESSAGE);
						}
					} else {
						int dividir = num1 / num2;
						String total = String.valueOf(dividir);
						textResultado.setText(total);
						textResultado.setText("EL RESULTADO ES " + dividir);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INGRESE NÚMEROS", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}

			}
		});
		// Componente que usaremos para la multiplicación
		bMultiplicar.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				try {
					if (e.getSource() == bMultiplicar) {

						String cajaText1 = cajaTexto1.getText();
						String cajaText2 = cajaTexto2.getText();
						int num1 = Integer.parseInt(cajaText1);
						int num2 = Integer.parseInt(cajaText2);

						int multi = num1 * num2;
						String total = String.valueOf(multi);
						textResultado.setText(total);
						textResultado.setText("EL RESULTADO ES " + multi);
					}
				} catch (NumberFormatException ex) {
					JOptionPane.showMessageDialog(null, "INGRESE NÚMEROS", "Advertencia", JOptionPane.WARNING_MESSAGE);

				}

			}
		});

		raizCuadrada.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				JOptionPane.showMessageDialog(null, "FUNCIONABILIDAD NO DISPONIBLE", "Información",
						JOptionPane.INFORMATION_MESSAGE);
			}
		});

		raizCubica.addActionListener(new ActionListener() {

			@Override
			public void actionPerformed(ActionEvent e) {

				String password = JOptionPane.showInputDialog(null, "ESCRIBA LA CONTRASEÑA",
						"Funcionabilidad Bloqueada", JOptionPane.QUESTION_MESSAGE);

				if ("Alohomora".equals(password)) {
					JOptionPane.showMessageDialog(null, "CONTRASEÑA CORRECTA", "Funcionabilidad Disponible",
							JOptionPane.INFORMATION_MESSAGE);

					Double raiz = (double) Integer.parseInt(JOptionPane.showInputDialog(null, "INTRODUCE UN NÚMERO",
							"Funcionabilidad Activada", JOptionPane.QUESTION_MESSAGE));
					double otroNumero = raiz;
					double raizCubica = Math.cbrt(otroNumero);
					textResultado.setText("El resultado es " + raizCubica);

				} else {
					JOptionPane.showMessageDialog(null, "CONTRASEÑA INCORRECTA", "Error", JOptionPane.ERROR_MESSAGE);
				}
			}

		});

	}

	public static void main(String[] args) {
		new JVentana();
	}

}
