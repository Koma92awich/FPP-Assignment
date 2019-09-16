package SwingHomeWork;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;


public class MetricConversion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		JFrame frame = new JFrame();

		frame.setTitle("Metric Conversion Assistant");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(600, 600);

		placeComponents(frame);

	}
	
	private static void  placeComponents(JFrame frame) {
		
		
		
		frame.setLayout(null);
		
		JLabel userInput = new JLabel("Mile:");
		userInput.setBounds(60, 60, 200, 30);
		frame.add(userInput);
		
		JLabel kilo = new JLabel("Kilometer:");
		kilo.setBounds(310, 60, 200, 30);
		frame.add(kilo);
		
		JLabel userOutput = new JLabel("Pound:");
		userOutput.setBounds(60, 100, 150, 30);
		frame.add(userOutput);
		
		JLabel gram = new JLabel("Kilogram:");
		gram.setBounds(310, 100, 150, 30);
		frame.add(gram);
		
		JLabel gallon = new JLabel("Gallon:");
		gallon.setBounds(60, 130, 150, 30);
		frame.add(gallon);
		
		JLabel liters = new JLabel("Liters:");
		liters.setBounds(310, 130, 150, 30);
		frame.add(liters);
		
		JLabel fahren = new JLabel("Fahrenheit:");
		fahren.setBounds(60, 170, 90, 30);
		frame.add(fahren);
		
		
		JLabel cent = new JLabel("Centrigrade:");
		cent.setBounds(310, 170, 90, 30);
		frame.add(cent);
		
		
		
		JTextField mil = new JTextField(50);
		mil.setBounds(130, 170, 160, 25);
		frame.add(mil);
		
		JTextField eat = new JTextField(50);
		eat.setBounds(390, 170, 160, 25);
		frame.add(eat);
		
		JTextField pou = new JTextField(50);
		pou.setBounds(130, 130, 160, 25);
		frame.add(pou);
		
		JTextField kil = new JTextField(50);
		kil.setBounds(390, 130, 160, 25);
		frame.add(kil);
		
		JTextField gal = new JTextField(50);
		gal.setBounds(130, 100, 160, 25);
		frame.add(gal);
		
		JTextField liq = new JTextField(50);
		liq.setBounds(390, 100, 160, 25);
		frame.add(liq);
		
		
		JTextField fah = new JTextField(50);
		fah.setBounds(130, 60, 160, 25);
		frame.add(fah);
		
		JTextField cen = new JTextField(50);
		cen.setBounds(390, 60, 160, 25);
		frame.add(cen);
		
		
		JButton convert = new JButton("convert");
		convert.setBounds(260, 260, 150, 30);
		frame.add(convert);
		
		//MILES TO KILOMETERS
		convert.addActionListener(hh->{
			 
			double x = Double.valueOf(fah.getText().toString());
			
			double y =  (x/0.6214);
			cen.setText(String.valueOf(y));
			
		});
		
		
		//POUND TO KILOGRAM
		convert.addActionListener(hh->{
			 
			double x = Double.valueOf(gal.getText().toString());
			
			double y =  (x/0.453592);
			liq.setText(String.valueOf(y));
			
		});
		
		//Gallon to litters
		
		convert.addActionListener(hh->{
			 
			double x = Double.valueOf(pou.getText().toString());
			
			double y =  (x/3.78541);
			kil.setText(String.valueOf(y));
			
		});
		
		//Fahrehati to centigrade
		
		convert.addActionListener(hh->{
			 
			double x = Double.valueOf(mil.getText().toString());
			
			double y =(x -32)*0.5556;
			eat.setText(String.valueOf(y));
			
		});
	}

}
