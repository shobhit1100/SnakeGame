import javax.swing.JFrame;

public class Main {

	public Main()
	{
		JFrame frame = new JFrame();
		Gamepanel gamepanel = new Gamepanel();
		frame.add(gamepanel); 
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("SNAKECODING");
		frame.pack();
		frame.setVisible(true);
		frame.setLocationRelativeTo(null);
	}
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		new Main();
	}

}
