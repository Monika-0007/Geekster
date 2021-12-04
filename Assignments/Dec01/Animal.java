package objects;

public class AnimalTest
{
	public static void main(String[] args)
	{
		Animals dog = new Animals();
		dog.setLegs(4);
		dog.setType("Domestic");
		//Accessing values through Getters
		System.out.println("D O G");
		System.out.println("Type :"+dog.getType()+" Number of Legs :"+dog.getLegs()+" Wings :"+dog.getWings()+" Age :"+Animals.age);
		dog.isOmnivore();
		
		System.out.println("T I G E R");
		Animals tiger = new Animals(4,"Wild");
		tiger.display();
		tiger.isCarnivore();
		Animals.incrementAge();
		
		System.out.println("P I G E O N");
		Animals pgn = new Animals(4,"Domestic",2);
		pgn.display();
		pgn.isHerbivore();
		Animals.incrementAge();

	}
	
}
class Animals
{
	//instance variables
	int legs;
	String type;
	int wings;
	//static variable
	static int age=0;
	
	//CONSTRUCTORS
	Animals()
	{
	System.out.println("ANIMALS");
	}
	Animals(int legs, String type)
	{
		//CONSTRUCTOR CHAINING
		this(4,type,0);
	}
	Animals(int legs, String type,int wings)
	{
		this.legs = legs;
		this.type = type;
		this.wings=wings;
	}
	
	//Auto generated Getters & Setters
	public int getLegs() {
		return legs;
	}
	public void setLegs(int legs) {
		this.legs = legs;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getWings() {
		return wings;
	}
	public void setWings(int wings) {
		this.wings = wings;
	}
	//Member Functions
	public void isHerbivore()
	{
		System.out.println("Is a Herbivore");
	}
	public void isCarnivore()
	{
		System.out.println("Is a Carnivore");
	}
	public void isOmnivore()
	{
		System.out.println("Is a Omnivore");
	}
	public void display() {
		System.out.println("Type :"+this.type+" Number of Legs :"+this.legs+" Wings :"+this.wings+" Age :"+age);
	}
	
	//Static Method 
	static void incrementAge()
	{
		age++;
		System.out.println("Incremented age :"+age);
	}
	
}
