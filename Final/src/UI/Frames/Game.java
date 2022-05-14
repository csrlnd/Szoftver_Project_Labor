package UI.Frames;
import java.awt.EventQueue;
import javax.swing.JFrame;

import UI.Components.GameField;
import UI.Components.Panel;
import java.awt.Graphics;


public class Game {

	private JFrame frame;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Game window = new Game();
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
	public Game() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(0, 0, 1200, 650);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		Panel panel = new Panel();
		GameField gameField = new GameField();
		

		frame.getContentPane().add(panel);
		frame.getContentPane().add(gameField);

		frame.setVisible(true);
		
		//teszt
		//panel.enableVaccine();
	}
}
