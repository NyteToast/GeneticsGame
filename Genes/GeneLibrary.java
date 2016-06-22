package Genes;

import ControlClasses.Node;

public class GeneLibrary {
	//###GENES###
	//Gender
	public GeneGender X = new GeneGender("X");
	public GeneGender Y = new GeneGender("Y");
	//Body Type
	public GeneBodyType biped = new GeneBodyType("Biped", 6);
	public GeneBodyType quadruped = new GeneBodyType("Quadruped", 8);
	public GeneBodyType hexapod = new GeneBodyType("Hexapod", 7);
	public GeneBodyType octopod = new GeneBodyType("Octopod", 4);
	
	public Node<GeneBodyType> nQuadruped = new Node<GeneBodyType>(quadruped);
	public Node<GeneBodyType> nBiped = new Node<GeneBodyType>(biped, 80, nQuadruped);
	public Node<GeneBodyType> nHexapod = new Node<GeneBodyType>(hexapod, 20, nQuadruped);
	public Node<GeneBodyType> nOctopod = new Node<GeneBodyType>(octopod, 100, nHexapod);
	
}
