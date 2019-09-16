package SwingHomeWork;



import javax.swing.*;

public class Screens {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		JFrame frame = new JFrame();

		frame.setTitle("Manipulate String");
		frame.setVisible(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(500, 300);

		placeComponents(frame);

	}

	private static void placeComponents(JFrame frame) {

		frame.setLayout(null);

		JButton countLetters = new JButton("Count Letters");
		countLetters.setBounds(10, 10, 150, 30);
		frame.add(countLetters);

		JButton reverseLetters = new JButton("Reverse Letters");
		reverseLetters.setBounds(10, 60, 150, 30);
		frame.add(reverseLetters);

		JButton removeDuplicates = new JButton("RemoveDuplicates");
		removeDuplicates.setBounds(10, 100, 150, 30);
		frame.add(removeDuplicates);

		JLabel userInput = new JLabel("Input");
		userInput.setBounds(250, 8, 80, 25);
		frame.add(userInput);

		JLabel userOutput = new JLabel("Output");
		userOutput.setBounds(250, 60, 80, 25);
		frame.add(userOutput);

		JTextField input = new JTextField(50);
		input.setBounds(200, 40, 160, 25);
		frame.add(input);

		JTextField output = new JTextField(50);
		output.setBounds(200, 80, 160, 25);
		frame.add(output);

		// ACTION LISTENNER TO COUNT LETTERS IN A WORD
		countLetters.addActionListener(cc -> {

			int count = Integer.valueOf(input.getText().toString().length());
			output.setText(String.valueOf(count));
		});

		// ACTION LISTENNER TO REVESE A STRING

		reverseLetters.addActionListener(hh -> {

			String word = input.getText().toString();

			String rev = "";
			for (int i = word.length() - 1; i >= 0; i--) {

				rev = rev + word.charAt(i);
			}

			output.setText(rev);

		});
		
		//ACTION LISTENNER TO REMOVE DUPLICATES
		
		removeDuplicates.addActionListener(rr->{
			
			String dup = input.getText().toString();
			
			String result ="";
			for (int i = 0; i < dup.length(); i++) {
		        if(!result.contains(String.valueOf(dup.charAt(i)))) {
		            result += String.valueOf(dup.charAt(i));
		        }
		    }
		    
			output.setText(result);
		});

	}

}
