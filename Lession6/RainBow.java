package SwingHomeWork;

import java.awt.Color;
import java.awt.FlowLayout;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class RainBow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		JFrame frame = new JFrame();

		frame.setTitle("Rainbow Colors");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(400, 400);

		placeComponents(frame);
		
		

	}
	
	public static void placeComponents(JFrame frame) {
		
		frame.setLayout(new FlowLayout(FlowLayout.LEFT));
		
		Color VIOLET = new Color(128,0,128);
		Color INDIGO = new Color(75,0,130);
		
		JButton red = new JButton("RED");
		red.setBackground(Color.RED);
		frame.add(red);
		
		JButton orange = new JButton();
		orange.setBackground(Color.ORANGE);
		frame.add(orange);
		
		JButton yellow = new JButton();
		yellow.setBackground(Color.YELLOW);
		frame.add(yellow);
		
		JButton green = new JButton();
		green.setSize(100, 200);
		green.setBackground(Color.GREEN);
		frame.add(green);
		
		JButton blue = new JButton();
		blue.setBackground(Color.BLUE);
		frame.add(blue);
		
		JButton indigo= new JButton();
		indigo.setBackground(INDIGO);
		frame.add(indigo);
		
		JButton violet = new JButton();
        violet.setBackground(VIOLET);
		frame.add(violet);
		
		
		red.addActionListener(rr->{
			
			JOptionPane.showMessageDialog(null, " Red signifies passion, vitality,"
					+ " enthusiasm and security. It is the light with the longest wavelength.");
		});
		
		orange.addActionListener(oo->{
			
			JOptionPane.showMessageDialog(null, "Orange represents creativity, practicality, "
					+ "playfulness as well as equilibrium or control.");
		});
		
		
       yellow.addActionListener(yy->{
			
			JOptionPane.showMessageDialog(null, "It represents clarity of thought, wisdom, "
					+ "orderliness and energy.");
		});
		
       green.addActionListener(gg->{
			
			JOptionPane.showMessageDialog(null, "Green is the middle color of the rainbow and denotes"
					+ " fertility, growth, balance, health and wealth..");
		});
	
       blue.addActionListener(bb->{
			
			JOptionPane.showMessageDialog(null, "Blue is the fifth color of the rainbow which makes us think of the Unknown. "
					+ "The sky and the wide oceans are in this color"
					+ " and hence it has been associated with Spirituality and Divinity.");
		});
	
       
       indigo.addActionListener(ind->{
			
			JOptionPane.showMessageDialog(null, "It is believed that where Blue is calming, Indigo is sedating. "
					+ "Indigo is mystical as it bridges the Gap between Finite and Infinite. "
					+ "Indigo colored gem stones are often used for spiritual attainment, psychic abilities, "
					+ "self awareness and enhancement of Intuition.");
		});
       
       
       violet.addActionListener(yy->{
			
			JOptionPane.showMessageDialog(null, "The last color of the rainbow is a mix of red and blue."
					+ " It is considered the highest element of spirituality."
					+ " It can ignite one’s imagination and be an inspiration to artists. "
					+ "Dark tones of violet are associated with sorrow."
					+ " Deeper shades of violet or purple denote high spiritual mastery.");
		});
	}

}
