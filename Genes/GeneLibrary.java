package Genes;

import ControlClasses.Node;

public class GeneLibrary {
	//###GENES###
	//Gender
	public GeneGender X = new GeneGender("X");
	public GeneGender Y = new GeneGender("Y");
	//Body Type
	public GeneBodyType biped = new GeneBodyType("Biped", 6, 2);
	public GeneBodyType quadruped = new GeneBodyType("Quadruped", 8, 4);
	public GeneBodyType hexapod = new GeneBodyType("Hexapod", 7, 6);
	public GeneBodyType octopod = new GeneBodyType("Octopod", 4, 8);
	
	public Node<GeneBodyType> nQuadruped = new Node<GeneBodyType>(quadruped);
	public Node<GeneBodyType> nBiped = new Node<GeneBodyType>(biped, 80, nQuadruped);
	public Node<GeneBodyType> nHexapod = new Node<GeneBodyType>(hexapod, 20, nQuadruped);
	public Node<GeneBodyType> nOctopod = new Node<GeneBodyType>(octopod, 100, nHexapod);
	
	//Size
	public GeneSize gargantuan = new GeneSize("Gargantuan", 10, 1);
	public GeneSize colossal = new GeneSize("Colossal", 7, 2);
	public GeneSize titan = new GeneSize("Titanic", 5, 3);
	public GeneSize monstrous = new GeneSize("Monstrous", 3, 4);
	public GeneSize giant = new GeneSize("Gigantic", 2, 5);
	public GeneSize large = new GeneSize("Large", 1.5, 6);
	public GeneSize normal = new GeneSize("Normal", 1, 8);
	public GeneSize small = new GeneSize("Small", 0.7, 7);
	public GeneSize tiny = new GeneSize("Tiny", 0.5, 6);
	public GeneSize microscopic = new GeneSize("Microscopic", 0.2, 2);
	
	public Node<GeneSize> nNormal = new Node<GeneSize>(normal);
	public Node<GeneSize> nSmall = new Node<GeneSize>(small, 80, nNormal);
	public Node<GeneSize> nLarge = new Node<GeneSize>(large, 20, nNormal);
	public Node<GeneSize> nTiny = new Node<GeneSize>(tiny, 70, nSmall);
	public Node<GeneSize> nGiant = new Node<GeneSize>(giant, 30, nLarge);
	public Node<GeneSize> nMicroscopic = new Node<GeneSize>(microscopic, 70, nTiny);
	public Node<GeneSize> nTitan = new Node<GeneSize>(titan, 30, nGiant);
	public Node<GeneSize> nColossal = new Node<GeneSize>(colossal, 70, nTitan);
	public Node<GeneSize> nGargantuan = new Node<GeneSize>(gargantuan, 30, nColossal);
	
	//Feet
	public GeneFeetType paws = new GeneFeetType("Paws", 5);
	public GeneFeetType flippers = new GeneFeetType("Flippers", 2);
	public GeneFeetType talons = new GeneFeetType("Talons", 4);
	public GeneFeetType hooves = new GeneFeetType("Hooves", 3);
	public GeneFeetType tentacles = new GeneFeetType("Tentacles", 4);
	
	//Legs
	
	//Arms
	
	//Hands
	
	//Head
	
	//Production
	
}
