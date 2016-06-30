package Genes;

import ControlClasses.Node;

public class GeneLibrary {
	//###GENES###
	//Gender
	public GeneGender X = new GeneGender("X");
	public GeneGender Y = new GeneGender("Y");
	//Body Type
	private int[] bMods = {2,2,2};
	public GeneBodyType biped = new GeneBodyType("FEATURE", "Biped", 6, bMods, 2);
	public GeneBodyType quadruped = new GeneBodyType("FEATURE", "Quadruped", 8, bMods, 4);
	public GeneBodyType hexapod = new GeneBodyType("FEATURE", "Hexapod", 7, bMods, 6);
	public GeneBodyType octopod = new GeneBodyType("FEATURE", "Octopod", 4, bMods, 8);
	
	public Node<GeneBodyType> nQuadruped = new Node<GeneBodyType>(quadruped);
	public Node<GeneBodyType> nBiped = new Node<GeneBodyType>(biped, 80, nQuadruped);
	public Node<GeneBodyType> nHexapod = new Node<GeneBodyType>(hexapod, 20, nQuadruped);
	public Node<GeneBodyType> nOctopod = new Node<GeneBodyType>(octopod, 100, nHexapod);
	
	//Size
	public GeneSize gargantuan = new GeneSize("MODIFIER","Gargantuan", 10, 1, bMods);
	public GeneSize colossal = new GeneSize("MODIFIER", "Colossal", 7, 2, bMods);
	public GeneSize titan = new GeneSize("MODIFIER", "Titanic", 5, 3, bMods);
	public GeneSize monstrous = new GeneSize("MODIFIER", "Monstrous", 3, 4, bMods);
	public GeneSize giant = new GeneSize("MODIFIER", "Gigantic", 2, 5, bMods);
	public GeneSize large = new GeneSize("MODIFIER", "Large", 1.5, 6, bMods);
	public GeneSize normal = new GeneSize("MODIFIER", "Normal", 1, 8, bMods);
	public GeneSize small = new GeneSize("MODIFIER", "Small", 0.7, 7, bMods);
	public GeneSize tiny = new GeneSize("MODIFIER", "Tiny", 0.5, 6, bMods);
	public GeneSize microscopic = new GeneSize("MODIFIER", "Microscopic", 0.2, 2, bMods);
	
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
	public GeneFeetType paws = new GeneFeetType("FEATURE", "Paws", 5, bMods);
	public GeneFeetType flippers = new GeneFeetType("FEATURE", "Flippers", 2, bMods);
	public GeneFeetType talons = new GeneFeetType("FEATURE", "Talons", 4, bMods);
	public GeneFeetType hooves = new GeneFeetType("FEATURE", "Hooves", 3, bMods);
	public GeneFeetType tentacles = new GeneFeetType("FEATURE", "Tentacles", 4, bMods);
	
	//Legs
	
	//Arms
	
	//Hands
	
	//Head
	
	//Wings
	
	//Skin/Fur Modifiers
	
	//Production
	
}
