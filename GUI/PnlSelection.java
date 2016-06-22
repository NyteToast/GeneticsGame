package GUI;

import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JPanel;

public class PnlSelection extends JPanel{
	
	JButton btnCreatures = new JButton("Creatures");
	JButton btnBreeding = new JButton("Breeding");
	JButton btnBuildings = new JButton("Buidings");
	
	public PnlSelection(){
		super();
		setLayout(new GridLayout(6,1, 5, 20));
		setPreferredSize(new Dimension(200,600));
		
		add(btnCreatures);
		add(btnBreeding);
		add(btnBuildings);
	}
	public void addHandler(ActionListener handlerS){
		btnCreatures.addActionListener(handlerS);
		btnBreeding.addActionListener(handlerS);
		btnBuildings.addActionListener(handlerS);
	}
}

