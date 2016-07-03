package Genetics;

import ControlClasses.Node;


public class GeneLibrary {
	//###GENES###
	//Gender
	public GeneGender X = new GeneGender("X");
	public GeneGender Y = new GeneGender("Y");

	
	//Body Type
	//public GeneBodyType nagaroid = new GeneBodyType("FEATURE", 2, 0, 0, 0, 0, 0); REQUIRES IMPLEMENTATION OF TAILLEGS
	
	public GeneBodyType humanoid = new GeneBodyType("Humanoid", 5, 1, 1, 2, 0, 0 );
	public GeneBodyType angeloid = new GeneBodyType("Winged Humanoid", 3, 1, 1, 2, 0, 1);
	public GeneBodyType deviloid = new GeneBodyType("Tailed Humanoid", 4, 1, 1, 2, 1, 0);
	public GeneBodyType wingedDeviloid = new GeneBodyType("Winged Humanoid With Tail", 2, 1, 1, 2, 1, 1);
	
	public GeneBodyType horse = new GeneBodyType("Horseroid", 7, 2, 1, 0, 0, 0);
	public GeneBodyType centaur = new GeneBodyType("Centauroid", 5, 2, 1, 2, 0, 0);
	public GeneBodyType pegasi = new GeneBodyType("Winged Horseroid", 6, 2, 1, 0, 0, 1);
	public GeneBodyType wingedCentaur = new GeneBodyType("Winged Centauroid", 2, 2, 1, 2, 0, 1);
	
	
	//public GeneBodyType serpent = new GeneBodyType("Serpentoid", 3, 0, 1, 0, 1, 0); REQUIRES IMPLEMENTATION OF TAILLEGS
	public GeneBodyType lizard = new GeneBodyType("Lizardoid", 3, 2, 1, 0, 1, 0);
	public GeneBodyType dragon = new GeneBodyType("Dragonoid", 2, 2, 1, 0, 1, 1);
	public GeneBodyType wyvern = new GeneBodyType("Wyvernoid", 1, 1, 1, 0, 1, 1);
	
	
	
	
	/*
	//Size
	public GeneSize gargantuan = new GeneSize("MODIFIER","Gargantuan", 10, 1);
	public GeneSize colossal = new GeneSize("MODIFIER", "Colossal", 7, 2);
	public GeneSize titan = new GeneSize("MODIFIER", "Titanic", 5, 3);
	public GeneSize monstrous = new GeneSize("MODIFIER", "Monstrous", 3, 4);
	public GeneSize giant = new GeneSize("MODIFIER", "Gigantic", 2, 5);
	public GeneSize large = new GeneSize("MODIFIER", "Large", 1.5, 6);
	public GeneSize normal = new GeneSize("MODIFIER", "Normal", 1, 8);
	public GeneSize small = new GeneSize("MODIFIER", "Small", 0.7, 7);
	public GeneSize tiny = new GeneSize("MODIFIER", "Tiny", 0.5, 6);
	public GeneSize microscopic = new GeneSize("MODIFIER", "Microscopic", 0.2, 2);
	
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
	 * */
	//Number of Mods
	public GeneModNum zero = new GeneModNum("Zero", 8, 0);
	public GeneModNum one = new GeneModNum("One", 9, 1);
	public GeneModNum two = new GeneModNum("Two", 10, 2);
	public GeneModNum three = new GeneModNum("Three", 8, 3);
	public GeneModNum four = new GeneModNum("Four", 7, 4);
	public GeneModNum five = new GeneModNum("Five", 6, 5);
	public GeneModNum six = new GeneModNum("Six", 5, 6);
	public GeneModNum seven = new GeneModNum("Seven", 4, 7);
	public GeneModNum eight = new GeneModNum("Eight", 3, 8);
	public GeneModNum nine = new GeneModNum("Nine", 2, 9);
	public GeneModNum ten = new GeneModNum("Ten", 1, 10);
	
	public Node<GeneModNum> nZero = new Node<GeneModNum>(zero);
	public Node<GeneModNum> nOne = new Node<GeneModNum>(one ,nZero);
	public Node<GeneModNum> nTwo = new Node<GeneModNum>(two ,nZero);
	public Node<GeneModNum> nThree = new Node<GeneModNum>(three ,nZero);
	public Node<GeneModNum> nFour = new Node<GeneModNum>(four ,nZero);
	public Node<GeneModNum> nFive = new Node<GeneModNum>(five ,nZero);
	public Node<GeneModNum> nSix = new Node<GeneModNum>(six ,nZero);
	public Node<GeneModNum> nSeven = new Node<GeneModNum>(seven ,nZero);
	public Node<GeneModNum> nEight = new Node<GeneModNum>(eight ,nZero);
	public Node<GeneModNum> nNine = new Node<GeneModNum>(nine ,nZero);
	public Node<GeneModNum> nTen = new Node<GeneModNum>(ten ,nZero);
	
	//Lifespan
	public GeneLifespan ls5Days = new GeneLifespan("1-5 Days", 1, 1, 5);
	public GeneLifespan ls10Days = new GeneLifespan("5-10 Days", 2, 5, 10);
	
	
}
